package com.oasystem.pojo;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by zyf on 2018/10/16.
 */

@Entity
@Table(name="Travel")
public class Travel implements Serializable {

    private static final long serialVersionUID = -7267453345266266742L;

    @Id
    @Column(columnDefinition = "int(4)")
    @GeneratedValue
    private int travelId;

    @Column(name = "Date", nullable = false)
    private Date date;

    @Column(name = "Reason", length = 50, nullable = false)
    private String Reason;

    @Column(name = "Traveler", length = 20, nullable = false)
    private String Traveler;

//    @Column(name = "tamount", length = 8, nullable = false)
//    private float Tamount;
//
//    @Column(name = "attach", length = 100, nullable = true)
//    private String Attach;
//
//    @Column(name = "status", length = 2, nullable = false)
//    private int Status;
//
//    @Column(name = "opinion", length = 100, nullable = true)
//    private String Opinion;
//
//    @Column(name = "project", length = 11, nullable = true)
//    private int Project;

   // @Column(name = "userid", length = 11, nullable = true)
    private int UserId;

    public int getTravelId() {
        return travelId;
    }

    public void setTravelId(int travelId) {
        this.travelId = travelId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getReason() {
        return Reason;
    }

    public void setReason(String reason) {
        Reason = reason;
    }

    public String getTraveler() {
        return Traveler;
    }

    public void setTraveler(String traveler) {
        Traveler = traveler;
    }

//    public float getTamount() {
//        return Tamount;
//    }
//
//    public void setTamount(float tamount) {
//        Tamount = tamount;
//    }
//
//    public String getAttach() {
//        return Attach;
//    }
//
//    public void setAttach(String attach) {
//        Attach = attach;
//    }
//
//    public int getStatus() {
//        return Status;
//    }
//
//    public void setStatus(int status) {
//        Status = status;
//    }
//
//    public String getOpinion() {
//        return Opinion;
//    }
//
//    public void setOpinion(String opinion) {
//        Opinion = opinion;
//    }
//
//    public int getProject() {
//        return Project;
//    }
//
//    public void setProject(int project) {
//        Project = project;
//    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public Travel() {
        super();
    }
}