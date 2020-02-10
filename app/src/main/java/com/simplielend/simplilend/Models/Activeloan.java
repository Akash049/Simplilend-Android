package com.simplielend.simplilend.Models;

public class Activeloan {
    private String name,status_email,status_mobile,purpose,approved_amount,approved_tenure;
    private int date,img;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus_email() {
        return status_email;
    }

    public void setStatus_email(String status_email) {
        this.status_email = status_email;
    }

    public String getStatus_mobile() {
        return status_mobile;
    }

    public void setStatus_mobile(String status_mobile) {
        this.status_mobile = status_mobile;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getApproved_amount() {
        return approved_amount;
    }

    public void setApproved_amount(String approved_amount) {
        this.approved_amount = approved_amount;
    }

    public String getApproved_tenure() {
        return approved_tenure;
    }

    public void setApproved_tenure(String approved_tenure) {
        this.approved_tenure = approved_tenure;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
