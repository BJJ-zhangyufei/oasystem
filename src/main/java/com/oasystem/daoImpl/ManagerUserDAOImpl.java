package com.oasystem.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import com.oasystem.pojo.User;
import com.oasystem.dao.ManagerUserDAO;
import com.oasystem.utl.contains;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by zyf on 2018/10/24.
 */
@Component("managerUserDAO")
@Transactional
public class ManagerUserDAOImpl implements ManagerUserDAO {

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    @Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
    public List<User> getALLUser() {
        List<User> userList=new ArrayList<User>();
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery(contains.HQL_GET_ALL_USER);
        userList = query.list();
        return userList;
    }
}
