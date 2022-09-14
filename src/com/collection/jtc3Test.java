package com.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class jtc3Test {
public static void main(String[]args) {
	Configuration cfg=new Configuration();
	cfg.configure("Customer.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session session=sf.openSession();
	org.hibernate.Transaction tx=session.beginTransaction();
	String cous[]= {"java","JDBC","JSP"};
	List<String>ems=new ArrayList<String>();
	ems.add("aa@jtc");
	ems.add("bb@jtc");
	ems.add("cc@jtc");
	List<Integer>maks=new ArrayList<Integer>();
	maks.add(100);
	maks.add(99);
	maks.add(100);
	Set<Long>phs=new HashSet<Long>();
	phs.add(new Long(1111));
	phs.add(new Long(2222));
	phs.add(new Long(3333));
	
	jtc3 stu=new jtc3("som","10-10-10","M.Sc",cous,ems,maks,phs);
	session.save(stu);
	tx.commit();
	session.close();
	sf.close();
	System.out.println("Record inserted");
	
	
}
}
