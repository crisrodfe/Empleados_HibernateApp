/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tables;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Hibernate Utility class with a convenient method to get Session Factory object.
 * @author CrisRodFe
 */
public class SessionFactoryUtil 
{
    private static SessionFactory sessionFactory;
    private static ServiceRegistry serviceRegistry;
    private static SessionFactory configureSessionFactory() throws HibernateException 
    {
        Configuration configuration = new Configuration();
        configuration.configure("/ConfigFiles/hibernate.cfg.xml");
        serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
         
        return sessionFactory;
    }
    
    public static SessionFactory getSessionFactory() 
    {
        return configureSessionFactory();
    }
}