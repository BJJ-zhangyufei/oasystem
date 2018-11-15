package com.oasystem.daoImpl;

import com.oasystem.dao.ManagerTravelDetailDAO;
import com.oasystem.pojo.TravelDetail;
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
@Component("managerTravelDetailDAO")
@Transactional
public class ManagerTravelDetailDAOImpl implements ManagerTravelDetailDAO {


    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    @Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
    public List<TravelDetail> getAllTravelDetail(int pageSize, int currentPage) {
        List<TravelDetail> travelDetailList=new ArrayList<TravelDetail>();
        Session session=sessionFactory.getCurrentSession();
        Query query=session.createQuery(contains.HQL_GET_ALL_TRAVELDETAIL);
        travelDetailList=query.list();
        return travelDetailList;
    }

    @Override
    public int addTravelDetail(TravelDetail td) {
        return (int) sessionFactory.getCurrentSession().save(td);
    }

    @Override
    public int deleteTravelDetail(int id) {
        Session session=sessionFactory.getCurrentSession();
        Query query=session.createQuery(contains.HQL_DELETE_TRAVELDETAIL);
        query.setParameter(0, id);
        int result=query.executeUpdate();
        return result;
    }

    //@Override
    public int updateTravelDetail(TravelDetail td) {
        Session session=sessionFactory.getCurrentSession();
        Query query=session.createQuery(contains.HQL_UPDATE_TRAVELDETAIL);
        query.setParameter(0, td.getStartDate());
        query.setParameter(1, td.getEndDate());
//        query.setParameter(2, td.getStartPlace());
//        query.setParameter(3, td.getDestination());
//        query.setParameter(4, td.getVehicle());
//        query.setParameter(5, td.getVbill());
//        query.setParameter(6, td.getVamount());
//        query.setParameter(7, td.getBTdays());
//        query.setParameter(8, td.getBTamount());
//        query.setParameter(9, td.getLiveFee());
//        query.setParameter(10, td.getCarFee());
//        query.setParameter(11, td.getPhoneFee());
//        query.setParameter(12, td.getOfficeFee());
//        query.setParameter(13, td.getNotWPFee());
//        query.setParameter(14, td.getOthersFee());
        int result=query.executeUpdate();
        return result;
    }

    //@Override
    public User showId(int id) {
        Session session=sessionFactory.getCurrentSession();
        Query query=session.createQuery(contains.HQL_UPDATE_CARFARE);
        int result=query.executeUpdate();
        return null;
    }
}
