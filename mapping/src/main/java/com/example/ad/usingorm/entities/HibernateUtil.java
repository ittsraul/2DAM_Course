package com.example.ad.usingorm.entities;

import java.io.File;
import java.io.Serializable;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil implements Serializable {
    public static SessionFactory factory = null;

    static {
        try {
            factory = new Configuration().configure("com/example/ad/usingorm/ORM/users.hbm.xml").buildSessionFactory();
        } catch (Throwable e) {
            System.err.println("Error ");
            e.printStackTrace();
            throw new ExceptionInInitializerError(e);
        }
    }

    // Método para obtener la SessionFactory
    public static SessionFactory getSessionFactory() {
        return factory;
    }

    public static Session getSession() {
        return (Session) factory;
    }
}