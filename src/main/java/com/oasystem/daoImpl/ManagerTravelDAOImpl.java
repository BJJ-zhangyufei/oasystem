package com.oasystem.daoImpl;

import com.oasystem.dao.ManagerTravelDAO;
import com.oasystem.pojo.Travel;
import com.oasystem.pojo.User;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import java.util.List;

/**
 * Created by zyf on 2018/10/16.
 */
@Component("managerTravelDAO")
@Transactional
public class ManagerTravelDAOImpl implements ManagerTravelDAO{

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;


    @Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)


    @Override
    public List<Travel> getALLTravel(int pageSizeInt, int currentPageInt) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long getTravelRow() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int addTravel(Travel at) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int deleteTravel(int id) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int updateTravel(Travel ut) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public User showId(int id) {
        // TODO Auto-generated method stub
        return null;
    }
}
