package com.gree.day02.Controller;

import com.github.pagehelper.PageInfo;
import com.gree.day02.dao.GYCS;
import com.gree.day02.dao.Mail;
import com.gree.day02.service.IGycsService;
import com.gree.day02.service.ISendMailService;
import com.gree.day02.utils.SendTextMails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
@RequestMapping("/GYCS")
@Transactional
public class GYCSController {

   @Autowired
   private IGycsService iGycsService;
    @Autowired
    private ISendMailService iSendMailService;

    /**
     * 查询工艺参数表(打开界面)
     * @param page
     * @param size
     * @return
     * @throws Exception
     */
   @RequestMapping("/findGycs.do")
   public ModelAndView findGycs(@RequestParam(name = "page",required = true,defaultValue = "1")int page, @RequestParam(name = "size",required = true,defaultValue = "15")int size) throws Exception {
      ModelAndView mv = new ModelAndView();
      List<GYCS> GycsList = iGycsService.findGycs(page,size);
      PageInfo pageInfo = new PageInfo(GycsList);
      mv.addObject("pageInfo",pageInfo);
      mv.setViewName("Charting_Query_list");
      return mv;
   }

    /**
     * 初始界面
     * @param page
     * @param size
     * @param count
     * @return
     * @throws Exception
     */
   @RequestMapping("/findGycs2.do")
    public  ModelAndView findAll2(@RequestParam(name = "page",required = true,defaultValue = "1")int page, @RequestParam(name = "size",required = true,defaultValue = "5")int size,int count) throws Exception {
        ModelAndView mv = new ModelAndView();
        List<GYCS> scrapList=null;
        if(count==3){
            scrapList = iGycsService.findGycs2(page,size,count);
            mv.setViewName("paperless-ZK-list");
        }else if(count==4){
          scrapList = iGycsService.findGycs2(page,size,count);
          mv.setViewName("paperless-GY-list");
        }else if(count==6){
            scrapList = iGycsService.findGycs2(page,size,count);
            mv.setViewName("ZK-list");
        }else if(count==5){
            scrapList = iGycsService.findGycs(page,size);   //查出所有可修改的记录
            mv.setViewName("Update_GYCS_list");
        }

        PageInfo pageInfo = new PageInfo(scrapList);
        mv.addObject("pageInfo",pageInfo);
        return mv;
    }

   /**
    * 录入工艺参数表
    * @param gycs
    * @return
    */
   @RequestMapping("/save.do")
   public String gycsAdd(GYCS gycs){
      iGycsService.gycsAdd(gycs);
      return "redirect:findGycs.do";
   }

    /**
     * 录入审核信息和修改进程状态（第一条）
     * @param id
     * @param roleName
     * @param roleDesc
     * @param count
     * @return
     * @throws Exception
     */
    @RequestMapping("/updateTJY.do")
    public String scrapUpdate(int id,@RequestParam(name = "roleName",required = true)String roleName,@RequestParam(name = "roleDesc",required = true)String roleDesc,int count)throws Exception
    {
        iGycsService.insertZK(id,roleName,roleDesc);
        iGycsService.updateGycsForZK(id,roleName,roleDesc);
        iGycsService.GycsUpdate(id,count);
        //发送邮件
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Mail mail =iSendMailService.findMail(authentication.getName());
        SendTextMails.SendTextMail(mail.getAddresser(),mail.getPassword(),mail.getRecipients(),mail.getCopyRecipients(),mail.getTitle(),mail.getMainText());
        return "redirect:findGycs2.do?count="+(count-1);
    }

    /**
     * 录入审核信息和修改进程状态（第二条）
     * @param id
     * @param roleName
     * @param roleDesc
     * @param count
     * @return
     * @throws Exception
     */
    @RequestMapping("/updateByJL.do")
    public String updateByJL(int id,@RequestParam(name = "roleName",required = true)String roleName,@RequestParam(name = "roleDesc",required = true)String roleDesc,int count)throws Exception
    {
        if(count==4){
            iGycsService.insertZK(id,roleName,roleDesc);
            iGycsService.updateGycsForZK(id,roleName,roleDesc);
            //发送邮件
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            Mail mail =iSendMailService.findMail(authentication.getName());
            SendTextMails.SendTextMail(mail.getAddresser(),mail.getPassword(),mail.getRecipients(),mail.getCopyRecipients(),mail.getTitle(),mail.getMainText());
        }else if(count==5){
            iGycsService.updateByJC_GY(id,roleName,roleDesc);
            iGycsService.updateGycsForGY(id,roleName,roleDesc);
            //发送邮件
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            Mail mail =iSendMailService.findMail(authentication.getName());
            SendTextMails.SendTextMail(mail.getAddresser(),mail.getPassword(),mail.getRecipients(),mail.getCopyRecipients(),mail.getTitle(),mail.getMainText());
        }
        iGycsService.GycsUpdate(id,count);
        return "redirect:findGycs2.do?count="+(count-1);
    }


    /**
     * 参数修改后保存质控审核数据
     * @param id
     * @param ZKname
     * @param ZKdesc
     * @return
     */
    @RequestMapping("/saveGycsById.do")
    public String saveGycsById(@RequestParam(name = "id",required = true)int id,@RequestParam(name = "zKname",required = true)String ZKname,@RequestParam(name = "zKdesc",required = true)String ZKdesc)throws Exception{

        iGycsService.saveGycsById(id,ZKname,ZKdesc);
        iGycsService.GycsUpdate(id,8);
        //发送邮件
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Mail mail =iSendMailService.findMail(authentication.getName());
        SendTextMails.SendTextMail(mail.getAddresser(),mail.getPassword(),mail.getRecipients(),mail.getCopyRecipients(),mail.getTitle(),mail.getMainText());
        return "redirect:findGycs2.do?count=6";
    }


    /**
     * 详情界面
     */
    @RequestMapping("/findGycsByGyId.do")
    public ModelAndView findGycsByGyId(@RequestParam(name = "id",required = true)int gyId)
    {
        ModelAndView mv=new ModelAndView();
        GYCS TSYscrap =  iGycsService.findGycsByGyId(gyId);
        mv.addObject("TSYscrap",TSYscrap);
        mv.setViewName("Query_Gycs");
        return mv;
    }

    /**
     * 查询
     * @param scrapId
     * @return
     */
    @RequestMapping("/updateByGycsId.do")
    public ModelAndView updateByGycsId(@RequestParam(name = "id",required = true)int scrapId)
    {
        ModelAndView mv=new ModelAndView();
        GYCS TSYscrap =  iGycsService.findByTJYId(scrapId);
        mv.addObject("TSYscrap",TSYscrap);
        mv.setViewName("Update_Gycs");
        return mv;
    }

    /**
     * 修改工艺参数
     * @param gyId
     * @return
     */
    @RequestMapping("/updateGycsById")
    public String updateGycsById(@RequestParam(name = "id",required =true)int gyId,@RequestParam(name = "YL1",required = true)String YL1,@RequestParam(name = "YL2",required = true)String YL2,@RequestParam(name = "YL3",required = true)String YL3,@RequestParam(name = "YL4",required = true)String YL4,@RequestParam(name = "YL5",required = true)String YL5,@RequestParam(name = "YL6",required = true)String YL6,
                                 @RequestParam(name = "YL7",required = true)String YL7,@RequestParam(name = "SD1",required = true)String SD1,@RequestParam(name = "SD2",required = true)String SD2,@RequestParam(name = "SD3",required = true)String SD3,@RequestParam(name = "SD4",required = true)String SD4,@RequestParam(name = "SD5",required = true)String SD5,
                                 @RequestParam(name = "SD6",required = true)String SD6,@RequestParam(name = "SD7",required = true)String SD7,@RequestParam(name = "WZ1",required = true)String WZ1,@RequestParam(name = "WZ2",required = true)String WZ2,@RequestParam(name = "WZ3",required = true)String WZ3,@RequestParam(name = "WZ4",required = true)String WZ4,
                                 @RequestParam(name = "WZ5",required = true)String WZ5,@RequestParam(name = "WZ6",required = true)String WZ6,@RequestParam(name = "WZ7",required = true)String WZ7,@RequestParam(name = "WD1",required = true)String WD1,@RequestParam(name = "WD2",required = true)String WD2,@RequestParam(name = "WD3",required = true)String WD3,
                                 @RequestParam(name = "WD4",required = true)String WD4,@RequestParam(name = "WD5",required = true)String WD5,@RequestParam(name = "WD6",required = true)String WD6,@RequestParam(name = "WD7",required = true)String WD7,@RequestParam(name = "CPMC",required = true)String CPMC,@RequestParam(name = "JYY",required = true)String JYY,
                                 @RequestParam(name = "JCBM",required = true)String JCBM,@RequestParam(name = "BC",required = true)String BC,@RequestParam(name = "JCRQ",required = true)String JCRQ,@RequestParam(name = "SJ",required = true)String SJ,@RequestParam(name = "LQ",required = true)String LQ,
                                 @RequestParam(name = "BYA",required = true)String BYA,@RequestParam(name = "JCSJ",required = true)String JCSJ,@RequestParam(name = "BZ",required = true)String BZ)throws Exception{
              iGycsService.updateGycsById(gyId,YL1,YL2,YL3,YL4,YL5,YL6,YL7,SD1,SD2,SD3,SD4,SD5,SD6,SD7,WZ1,WZ2,WZ3,WZ4,WZ5,WZ6,WZ7,WD1,WD2,WD3,WD4,WD5,WD6,WD7,CPMC,JYY,JCBM,BC,JCRQ,SJ,LQ,BYA,JCSJ,BZ);
        //发送邮件
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Mail mail =iSendMailService.findMail(authentication.getName());
        SendTextMails.SendTextMail(mail.getAddresser(),mail.getPassword(),mail.getRecipients(),mail.getCopyRecipients(),mail.getTitle(),mail.getMainText());
              return "redirect:findGycs2.do?count="+5;
    }

    @RequestMapping("/findByGycsId.do")
    public ModelAndView findByGycsId(@RequestParam(name = "id",required = true)int scrapId)
    {
        ModelAndView mv=new ModelAndView();
        GYCS TSYscrap =  iGycsService.findGycsByGyId(scrapId);
        mv.addObject("TSYscrap",TSYscrap);
        mv.setViewName("ZK_Gycs");
        return mv;
    }

    /**
     *
     * @param scrapId
     * @return
     */
    @RequestMapping("/findByTJYId.do")
    public ModelAndView findByTJYId(@RequestParam(name = "id",required = true)int scrapId)
    {
        ModelAndView mv=new ModelAndView();
        GYCS TSYscrap =  iGycsService.findByTJYId(scrapId);
        mv.addObject("TSYscrap",TSYscrap);
        mv.setViewName("paperless-TJY-show");
        return mv;
    }


    @RequestMapping("/findByZKId.do")
    public ModelAndView findByZKId(@RequestParam(name = "id",required = true)int scrapId)
    {
        ModelAndView mv=new ModelAndView();
        GYCS TSYscrap =  iGycsService.findByTJYId(scrapId);
        mv.addObject("TSYscrap",TSYscrap);
        mv.setViewName("paperless-ZK-show");
        return mv;
    }


    @RequestMapping("/findByGYId.do")
    public ModelAndView findByGYId(@RequestParam(name = "id",required = true)int scrapId)
    {
        ModelAndView mv=new ModelAndView();
        GYCS TSYscrap =  iGycsService.findByTJYId(scrapId);
        mv.addObject("TSYscrap",TSYscrap);
        mv.setViewName("paperless-GY-show");
        return mv;
    }







}