package com.gree.day02.dao;

import lombok.Data;

import java.util.Date;

@Data
public class Mail {

    private Integer id;

    private String userId;

    private String username;

    private String mailPwd;

    private String title;

    private String mainText;

    private String addresser;

    private String recipients;

    private String copyRecipients;

    private Date sernTime;

    private Date inputTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMailPwd() {
        return mailPwd;
    }

    public void setMailPwd(String mailPwd) {
        this.mailPwd = mailPwd;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMainText() {
        return mainText;
    }

    public void setMainText(String mainText) {
        this.mainText = mainText;
    }

    public String getAddresser() {
        return addresser;
    }

    public void setAddresser(String addresser) {
        this.addresser = addresser;
    }

    public String getRecipients() {
        return recipients;
    }

    public void setRecipients(String recipients) {
        this.recipients = recipients;
    }

    public String getCopyRecipients() {
        return copyRecipients;
    }

    public void setCopyRecipients(String copyRecipients) {
        this.copyRecipients = copyRecipients;
    }

    public Date getSernTime() {
        return sernTime;
    }

    public void setSernTime(Date sernTime) {
        this.sernTime = sernTime;
    }

    public Date getInputTime() {
        return inputTime;
    }

    public void setInputTime(Date inputTime) {
        this.inputTime = inputTime;
    }

}