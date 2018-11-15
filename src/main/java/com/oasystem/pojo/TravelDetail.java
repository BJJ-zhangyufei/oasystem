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
@Table(name="TravelDetail")
public class TravelDetail implements Serializable {

    private static final long serialVersionUID = -6535798314838272470L;

    @Id
    @Column(columnDefinition="int(4)")
    @GeneratedValue
    private int detailId;

    @Column(name="startDate",nullable=false)
    private Date startDate;

    @Column(name="endDate",nullable=false)
    private Date endDate;

    @Column(columnDefinition="int(4)")
    @GeneratedValue
    private int UserId;

//    @Column(name="startplace",length=20,nullable=false)
//    private String startPlace;
//
//    @Column(name="destination",length=20,nullable=false)
//    private String Destination;
//
//    @Column(name="vehicle",length=20,nullable=false)
//    private String Vehicle;
//
//    @Column(name="vbill",length=4,nullable=true)
//    private int Vbill;
//
//    @Column(name="vamount",length=8,nullable=false)
//    private float Vamount;
//
//    @Column(name="btdays",length=4,nullable=true)
//    private int BTdays;
//
//    @Column(name="btamount",length=8,nullable=true)
//    private float BTamount;
//
//    @Column(name="livefee",length=8,nullable=true)
//    private float LiveFee;
//
//    @Column(name="carfee",length=8,nullable=true)
//    private float CarFee;
//
//    @Column(name="phonefee",length=8,nullable=true)
//    private float PhoneFee;
//
//    @Column(name="officefee",length=8,nullable=true)
//    private float OfficeFee;
//
//    @Column(name="notwpfee",length=8,nullable=true)
//    private float NotWPFee;
//
//    @Column(name="othersfee",length=8,nullable=true)
//    private float OthersFee;

    public int getDetailId() {
        return detailId;
    }

    public void setDetailId(int detailId) {
        this.detailId = detailId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int UserId) {
        this.UserId = UserId;
    }

//    public String getStartPlace() {
//        return startPlace;
//    }
//
//    public void setStartPlace(String startPlace) {
//        this.startPlace = startPlace;
//    }
//
//    public String getDestination() {
//        return Destination;
//    }
//
//    public void setDestination(String destination) {
//        Destination = destination;
//    }
//
//    public String getVehicle() {
//        return Vehicle;
//    }
//
//    public void setVehicle(String vehicle) {
//        Vehicle = vehicle;
//    }
//
//    public int getVbill() {
//        return Vbill;
//    }
//
//    public void setVbill(int vbill) {
//        Vbill = vbill;
//    }
//
//    public float getVamount() {
//        return Vamount;
//    }
//
//    public void setVamount(float vamount) {
//        Vamount = vamount;
//    }
//
//    public int getBTdays() {
//        return BTdays;
//    }
//
//    public void setBTdays(int bTdays) {
//        BTdays = bTdays;
//    }
//
//    public float getBTamount() {
//        return BTamount;
//    }
//
//    public void setBTamount(float bTamount) {
//        BTamount = bTamount;
//    }
//
//    public float getLiveFee() {
//        return LiveFee;
//    }
//
//    public void setLiveFee(float liveFee) {
//        LiveFee = liveFee;
//    }
//
//    public float getCarFee() {
//        return CarFee;
//    }
//
//    public void setCarFee(float carFee) {
//        CarFee = carFee;
//    }
//
//    public float getPhoneFee() {
//        return PhoneFee;
//    }
//
//    public void setPhoneFee(float phoneFee) {
//        PhoneFee = phoneFee;
//    }
//
//    public float getOfficeFee() {
//        return OfficeFee;
//    }
//
//    public void setOfficeFee(float officeFee) {
//        OfficeFee = officeFee;
//    }
//
//    public float getNotWPFee() {
//        return NotWPFee;
//    }
//
//    public void setNotWPFee(float notWPFee) {
//        NotWPFee = notWPFee;
//    }
//
//    public float getOthersFee() {
//        return OthersFee;
//    }
//
//    public void setOthersFee(float othersFee) {
//        OthersFee = othersFee;
//    }
//
//    public static long getSerialversionuid() {
//        return serialVersionUID;
//    }

}
