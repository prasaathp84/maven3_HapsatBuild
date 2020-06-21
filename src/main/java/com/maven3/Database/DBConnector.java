/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maven3.Database;

import com.sun.org.apache.xerces.internal.xni.grammars.XMLSchemaDescription;
import java.io.File;
import org.hibernate.Session;    
import org.hibernate.SessionFactory;    
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.cfg.Configuration;
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.apache.log4j.Logger; 
import java.nio.file.Paths;
import org.springframework.stereotype.Component;


/**
 *
 * @author prasa
 */
@Component
 public class DBConnector implements IDBConnector {
    StandardServiceRegistry ssr=null;
    Metadata meta = null;
    Session _session;
    SessionFactory _factory;
    private final Logger logger = Logger.getLogger(DBConnector.class);

    @Override
    public void CreateSession(IHandleSession hdSession) {
        try
        {
            String path = System.getenv("CATALINA_HOME") + "\\webapps\\mavenproject3\\WEB-INF\\classes\\hibernate.cfg.xml";
            File cfgFile = new File(path);
            _factory = new Configuration().configure(cfgFile).buildSessionFactory();
            _session = _factory.openSession();
            hdSession.PassSessionObjects(_session, _factory);
        }
        catch(Exception sqlException)
        {
            sqlException.printStackTrace();
            logger.debug(sqlException);
        }
    }

    @Override
    public void ClearSession() {
        _session.close();
        _factory.close();
    }
    
    
    
    
 }




