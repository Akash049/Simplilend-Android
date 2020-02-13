package com.simplielend.simplilend.Models;

public class rejectedloan {
    private String rej_name,rej_email,rej_number,rej_purpose,requested_tenure,requested_amount,comment,loan_type;



    private int img;

    public String getLoan_type() {
        return loan_type;
    }

    public void setLoan_type(String loan_type) {
        this.loan_type = loan_type;
    }

    public String getRej_name() {
        return rej_name;
    }

    public void setRej_name(String rej_name) {
        this.rej_name = rej_name;
    }

    public String getRej_email() {
        return rej_email;
    }

    public void setRej_email(String rej_email) {
        this.rej_email = rej_email;
    }

    public String getRej_number() {
        return rej_number;
    }

    public void setRej_number(String rej_number) {
        this.rej_number = rej_number;
    }

    public String getRej_purpose() {
        return rej_purpose;
    }

    public void setRej_purpose(String rej_purpose) {
        this.rej_purpose = rej_purpose;
    }

    public String getRequested_tenure() {
        return requested_tenure;
    }

    public void setRequested_tenure(String requested_tenure) {
        this.requested_tenure = requested_tenure;
    }

    public String getRequested_amount() {
        return requested_amount;
    }

    public void setRequested_amount(String requested_amount) {
        this.requested_amount = requested_amount;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
