package com.oasystem.daoImpl;

import com.oasystem.dao.ManagerCarFareDAO;
import com.oasystem.pojo.CarFare;
import com.oasystem.pojo.User;
import com.oasystem.utl.contains;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zyf on 2018/10/16.
 */
@Component("managerCarFareDAO")
@Transactional
public class ManagerCarFareDAOImpl implements ManagerCarFareDAO {

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;


    @Override
    @Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
    public long getCarFareRow() {
        long rows=0;
        Session session=sessionFactory.getCurrentSession();
        Query query=session.createQuery(contains.HQL__CARFARE_ALLROWS);
        rows=(long)query.list().get(0);
        return rows;
    }

    @Override
    @Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
    public List<CarFare> getALLCarFare(int pageSize, int currentPage) {
        List<CarFare> carFareList=new ArrayList<CarFare>();
        int pageStart=(currentPage-1)*pageSize;
        Session session=sessionFactory.getCurrentSession();
        Query query=session.createQuery(contains.HQL_GET_ALL_CARFARE);
        query.setFirstResult(pageStart);
        query.setMaxResults(pageSize);
        carFareList=query.list();
        return carFareList;
    }


    @Override
    public int addCarFare(CarFare pc) {
        return (int) sessionFactory.getCurrentSession().save(pc);
    }

    @Override
    public int deleteCarFare(int id) {
        Session session=sessionFactory.getCurrentSession();
        Query query=session.createQuery(contains.HQL_DELETE_CARFARE);
        query.setParameter(0, id);
        int result=query.executeUpdate();
        return result;
    }

    @Override
    public int updateCarFare(CarFare task) {
        Session session=sessionFactory.getCurrentSession();
        Query query=session.createQuery(contains.HQL_UPDATE_CARFARE);
        query.setParameter(0, task.getDate());
        query.setParameter(1, task.getReason());
        query.setParameter(2, task.getUserid());
//        query.setParameter(3, task.getAmount());
//        query.setParameter(4, task.getBill());
//        query.setParameter(5, task.getExplain());
//        query.setParameter(6, task.getAttach());
//        query.setParameter(7, task.getState());
//        query.setParameter(8, task.getOpinion());
//        query.setParameter(9, task.getProject());
        int result=query.executeUpdate();
        return result;
    }

    @Override
    public User showId(int id) {
        Session session=sessionFactory.getCurrentSession();
        Query query=session.createQuery(contains.HQL_UPDATE_CARFARE);
        int result=query.executeUpdate();
        return null;
    }


}
