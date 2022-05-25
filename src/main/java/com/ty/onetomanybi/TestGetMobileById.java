package com.ty.onetomanybi;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetMobileById {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("karthik");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Mobile mobile = entityManager.find(Mobile.class,1);
		
		List<Sim> sim = mobile.getSims();
		for (Sim sim2 : sim) {
			System.out.println(sim2.getProvider());
			System.out.println(sim2.getType());
			
		}
		
		System.out.println(mobile.getName());
		System.out.println(mobile.getCost());
		
		
	}

}
