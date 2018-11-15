package com.oasystem.utl;

/**
 * Created by zyf on 2018/10/16.
 */
public final class contains {

    public static final String HQL_GET_ALL_USER="from user ";

    public static final String HQL__CARFARE_ALLROWS="select count(*) from CarFare";

    public static final String HQL_GET_ALL_CARFARE="from CarFare";

    public static final String HQL_DELETE_CARFARE="delete from CarFare pc where pc.id=?";

    public static final String HQL_UPDATE_CARFARE="update CarFare as pc set pc.date=?,pc.reason=?,pc.userid=? ,pc.amount=? ,pc.bill=? ,pc.explain=? ,pc.attach=? ,pc.state=? ,pc.opinion=?,pc.project = ? where pc.id=?";

    //获取所有Travel
    public static final String HQL_GET_ALL_TRAVEL="from Travel";
    //获取所有TravelDetail
    public static final String HQL_GET_ALL_TRAVELDETAIL = "from TravelDetail";
    //删除
    public static final String HQL_DELETE_TRAVELDETAIL = "";

    public static final String HQL_UPDATE_TRAVELDETAIL = "update TravelDetail as td";
}
