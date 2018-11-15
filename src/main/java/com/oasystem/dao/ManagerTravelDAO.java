package com.oasystem.dao;

import com.oasystem.pojo.Travel;
import com.oasystem.pojo.User;

import java.util.List;

/**
 * Created by zyf on 2018/10/16.
 */
public interface ManagerTravelDAO {

    /**
     * @return
     */
    public List<Travel> getALLTravel(int pageSizeInt, int currentPageInt);

    /**
     * @return
     */
    public long getTravelRow();

    /**
     * @param
     * @return
     */
    public int addTravel(Travel at);

    /**
     * @param id
     * @return
     */
    public int deleteTravel(int id);

    /**
     * @param
     * @return
     */
    public int updateTravel(Travel ut);

    public User showId(int id);
}
