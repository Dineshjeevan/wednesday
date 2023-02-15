package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Patient;

public class Patientdao {
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction  entityTransaction=entityManager.getTransaction();
	 
	
	public void insert(Patient a){
		entityTransaction.begin();
		entityManager.persist(a);
		entityTransaction.commit();
	}

}
