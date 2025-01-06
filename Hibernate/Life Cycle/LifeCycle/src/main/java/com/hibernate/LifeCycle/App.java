package com.hibernate.LifeCycle;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App {
	public static void main(String[] args) {
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Laptop.class);
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf = con.buildSessionFactory(reg);
		Session session = sf.openSession();
		session.beginTransaction();
		
		// code
		
		// Transient state
		Laptop laptop = new Laptop();
		laptop.setId(11);
		laptop.setBrand("Apple");
		laptop.setModel("MacBook Pro 16");
		
		// Persistence state
		session.save(laptop);
		session.getTransaction().commit();
		
		// Detach state
//		session.evict(laptop); 
		session.delete(laptop);
		
		laptop.setModel("MacBook Pro");
		
		session.close();
		System.out.println("Success...");

	}
}
