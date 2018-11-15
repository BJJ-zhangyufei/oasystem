package com.oasystem.pojo;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/**
 * Created by zyf on 2018/10/16.
 */

@Entity
@Table(name="CarFare")
public class CarFare implements Serializable {

    private static final long serialVersionUID = 7503623512485597338L;

    @Id
    @Column(columnDefinition="int(4)")
    @GeneratedValue
    private int id;

    @Column(name="Date",length=20)
    @Temporal(TemporalType.DATE)
    private Date Date;

    @Column(name="Reason",nullable=false)
    private String Reason;

    @Column(name="UserId",nullable=false)
    private int userid;

//    @Column(name="amount",nullable=false)
//    private String Amount;
//
//
//    @Column(name="bill",nullable=false)
//    private int Bill;
//
//    @Column(name="explain",nullable=false)
//    private String Explain;
//
//
//    @Column(name="attach",nullable=false)
//    private String Attach;
//
//    @Column(name="state",nullable=false)
//    private int State;
//
//    @Column(name="opinion",nullable=false)
//    private String Opinion;
//
//
//    @Column(name="project",nullable=false)
//    private int Project;

    public CarFare(){

    }


    public CarFare(String reason, String amount, String attach, int bill, String explain) {
        this.Reason = reason;
//        this.Amount = amount;
//        this.Attach = attach;
//        this.Bill = bill;
//        this.Explain = explain;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public Date getDate() {
        return Date;
    }


    public void setDate(Date date) {
        Date = date;
    }


    public String getReason() {
        return Reason;
    }


    public void setReason(String reason) {
        Reason = reason;
    }


    public int getUserid() {
        return userid;
    }


    public void setUserid(int userid) {
        this.userid = userid;
    }


//    public String getAmount() {
//        return Amount;
//    }
//
//
//    public void setAmount(String amount) {
//        Amount = amount;
//    }
//
//
//    public int getBill() {
//        return Bill;
//    }
//
//
//    public void setBill(int bill) {
//        Bill = bill;
//    }
//
//
//    public String getExplain() {
//        return Explain;
//    }
//
//
//    public void setExplain(String explain) {
//        Explain = explain;
//    }
//
//
//    public String getAttach() {
//        return Attach;
//    }
//
//
//    public void setAttach(String attach) {
//        Attach = attach;
//    }
//
//
//    public int getState() {
//        return State;
//    }
//
//
//    public void setState(int state) {
//        State = state;
//    }
//
//
//    public String getOpinion() {
//        return Opinion;
//    }
//
//
//    public void setOpinion(String opinion) {
//        Opinion = opinion;
//    }
//
//
//    public int getProject() {
//        return Project;
//    }
//
//
//    public void setProject(int project) {
//        Project = project;
//    }



}
