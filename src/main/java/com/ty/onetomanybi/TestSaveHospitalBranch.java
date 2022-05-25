package com.ty.onetomanybi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveHospitalBranch {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("karthik");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Hospital hospital = new Hospital();
		hospital.setName("Delta diagonistics");
		hospital.setWeb("www.delta.com");
		
		Branch branch1 = new Branch();
		branch1.setName("Basavangudi");
		branch1.setPhone(988789087l);
		branch1.setState("Karnataka");
		branch1.setCountry("India");
		
		Branch branch2 = new Branch();
		branch2.setName("Marathalli");
		branch2.setCountry("India");
		branch2.setPhone(678987654l);
		branch2.setState("Karnataka");
		
		branch1.setHospital(hospital);
		
		
		entityTransaction.begin();
		entityManager.persist(branch1);
		entityManager.persist(branch2);
		entityManager.persist(hospital);
		entityTransaction.commit();
	}

}
