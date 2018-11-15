package com.oasystem.dao;

import com.oasystem.pojo.TravelDetail;
import com.oasystem.pojo.User;

import java.util.List;

/**
 * Created by zyf on 2018/10/16.
 */
public interface ManagerTravelDetailDAO {

    /**
     * @return
     */

    public List<TravelDetail> getAllTravelDetail(int pageSize, int currentPage);

    public int addTravelDetail(TravelDetail td);

    public int deleteTravelDetail(int id);

    public int updateTravelDetail(TravelDetail td);

    public User showId(int id);
}
