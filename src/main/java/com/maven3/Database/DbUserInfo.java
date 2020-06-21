/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maven3.Database;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import org.hibernate.query.Query;
import com.maven3.DbModels.UserInfo;
import org.hibernate.Transaction;
/**
 *
 * @author prasa
 */
@Component
public class DbUserInfo implements IHandleSession{
    Session session = null;
    SessionFactory factory = null;
    IDBConnector dbConnector;
    private static final Logger logger = Logger.getLogger(DBConnector.class);
    @Autowired
    public DbUserInfo(IDBConnector dbConnector)
    {
        this.dbConnector = dbConnector;
    }
    
    public List<UserInfo> getAllUserInfo()
    {
        try
        {
            dbConnector.CreateSession(this);
            Query<UserInfo> query = session.createQuery("From UserInfo");
            return query.list();
        }
        finally
        {
            dbConnector.ClearSession();
        }
    }
    
    public int InsertUserInfo(UserInfo userInfo)
    {
        Transaction tx =null;
        Integer userId = null;
        try
        {
            dbConnector.CreateSession(this);
            tx = session.beginTransaction();
            userId = (Integer) session.save(userInfo);
            tx.commit();
            return userId;
//            Query query = session.createSQLQuery("insert into dbo.UserInfo (Name, Address, Mobile) values (:Name, :Address, :Mobile)");
//            query.setParameter(":Name", userInfo.getName());
//            query.setParameter(":Address", userInfo.getAddress());
//            query.setParameter(":Mobile", userInfo.getMobile());
//            logger.info("InsertUserInfo");
//            logger.info(query.toString());
//            return query.executeUpdate();
        }
        catch (Exception ex)
        {
            if(tx != null)
                tx.rollback();
            throw ex;
        }
        finally
        {
            dbConnector.ClearSession();
        }
         
    }
    
    @Override
    public void PassSessionObjects(Session session, SessionFactory factory) {
        this.session = session;
        this.factory = factory;
    }

   
    
}
