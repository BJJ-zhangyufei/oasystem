package com.oasystem.dao;

import com.oasystem.pojo.CarFare;
import com.oasystem.pojo.User;

import java.util.List;

/**
 * Created by zyf on 2018/10/16.
 */
public interface ManagerCarFareDAO {

    /**
     * @return
     */
    public long getCarFareRow();

    /**
     * allCarFare
     * @param pageSize
     * @param currentPage
     * @return
     */
    public List<CarFare> getALLCarFare(int pageSize, int currentPage);

    /**
     * @param pc
     * @return
     */
    public int addCarFare(CarFare pc);

    /**
     * 鍒犻櫎
     * @param id
     * @return
     */
    public int deleteCarFare(int id);

    /**
     * 淇敼
     * @param task
     * @return
     */
    public int updateCarFare(CarFare task);

    public User showId(int id);

}
