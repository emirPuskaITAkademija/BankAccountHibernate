package entity;

import config.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ActiveBankAccount {

    public void save(){
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(this);
            session.getTransaction().commit();
        }catch (HibernateException e){
            System.err.println(e.getMessage());
        }
    }

    public void update(){
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.getTransaction().begin();
            session.update(this);
            session.getTransaction().commit();
        }catch (HeadlessException e){
            System.err.println(e.getMessage());
        }
    }

    public void delete(){
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(this);
            session.getTransaction().commit();
        }catch (HibernateException e){
            System.err.println(e.getMessage());
        }
    }

    public static List<BankAccount> loadAll(){
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Query query = session.createQuery("from BankAccount");
            session.getTransaction().commit();
            return query.list();
        }catch (HibernateException e){
            System.err.println(e.getMessage());
            return Collections.emptyList();
        }
    }
}
