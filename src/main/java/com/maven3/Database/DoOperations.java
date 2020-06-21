/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maven3.Database;

import java.time.format.DateTimeFormatter;
import org.hibernate.Session;
import com.maven3.Models.*;
import java.sql.CallableStatement;
import org.hibernate.query.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import java.util.*;
import java.time.LocalDateTime;
import org.apache.log4j.Logger; 
import com.maven3.Interfaces.*;
import java.io.File;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import org.hibernate.cfg.Configuration;


/**
 *
 * @author prasa
 */
public class DoOperations implements IHandleSession {
    Session session = null;
    SessionFactory factory = null;
    private static final Logger logger = Logger.getLogger(DBConnector.class);
    IHandleException hdExcepton;
    public DoOperations(IHandleException hdExcepton)
    {
        this.hdExcepton = hdExcepton;
        //DBConnector.createSession(this);
    }
    
    public int test()
    {
        logger.info("test method");
        String path = System.getenv("CATALINA_HOME") + "\\webapps\\mavenproject3\\WEB-INF\\hibernate.cfg.xml";
        File cfgFile = new File(path);
        SessionFactory factory = new Configuration().configure(cfgFile).buildSessionFactory();
        Session _session = factory.openSession();
        Transaction tx = session.beginTransaction();
	Query query = session.createQuery("from Employee");
        List<CustomerOrders> custOrders = query.list();
        for(CustomerOrders custOrder : custOrders){
			System.out.println(custOrder.getItemCode());
        }
        _session.close();
        factory.close();
        return 1;
    }
    
    public int updateCustomers()
    {
        logger.info("updateCustomers");
        int rowsaff = 0;
        try{
            
            Transaction tx = session.beginTransaction();
            StoredProcedureQuery custQuery = session.createStoredProcedureQuery("dbo.InsertCustomerOrders", CustomerOrders.class);
            custQuery.registerStoredProcedureParameter("InvoiceDate", LocalDateTime.class, ParameterMode.IN);
            custQuery.registerStoredProcedureParameter("InvoiceNumber", String.class, ParameterMode.IN);
            custQuery.registerStoredProcedureParameter("DocTotal", Integer.class, ParameterMode.IN);
            custQuery.registerStoredProcedureParameter("CustomerName", String.class, ParameterMode.IN);
            custQuery.registerStoredProcedureParameter("CustomerEmail", String.class, ParameterMode.IN);
            custQuery.registerStoredProcedureParameter("CustomerPhoneNumber", String.class, ParameterMode.IN);
            custQuery.registerStoredProcedureParameter("ItemCode", String.class, ParameterMode.IN);
            custQuery.registerStoredProcedureParameter("ItemDescription", String.class, ParameterMode.IN);
            custQuery.setParameter("InvoiceDate", LocalDateTime.now());
            custQuery.setParameter("InvoiceNumber", "464646");
            custQuery.setParameter("DocTotal", 88);
            custQuery.setParameter("CustomerName", "victor");
            custQuery.setParameter("CustomerEmail", "victor@gmail.com");
            custQuery.setParameter("CustomerPhoneNumber", "464646");
            custQuery.setParameter("ItemCode", "chv0808080");
            custQuery.setParameter("ItemDescription", "wimbledon tennis garden");
            rowsaff = custQuery.executeUpdate();
            tx.commit();
            //closeSession();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            logger.debug(ex);
            hdExcepton.ProcessException(ex);
        }
        return rowsaff;
    }

 
    
    @Override
    public  void PassSessionObjects(Session session, SessionFactory factory) {
        this.session = session;
        this.factory = factory;
    }
   
}


