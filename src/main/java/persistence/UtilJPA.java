package persistence;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Conseiller;

public class UtilJPA {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
	EntityManager em = emf.createEntityManager();
	EntityTransaction txn = em.getTransaction();
	
	public void insertEntity() {
	    
		try {
			txn.begin();
	        
			LocalDate date = LocalDate.now();
	        LocalDate date1 = LocalDate.now();
			Conseiller c = new Conseiller( "01","Bob", "batman", date , 2000, date1);		
			
			
			//Conseiller c= em.find(Conseiller.class, 1);
			//em.persist(c);			
			
			System.out.println(c);
			
			txn.commit();
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
			
		} finally {
			if (em != null) {
				em.close();
			}
			if (emf != null) {
				emf.close();
			}
		} 
			
	}
	
	public List<Conseiller> findEntity() {
		return null;
		
	}

	public void findAllEntity() {
		// TODO Auto-generated method stub
		
	}

	public void deleteEntity() {
		// TODO Auto-generated method stub
		
	}

	public void updateEntity() {
		// TODO Auto-generated method stub
		
	}

	public void findByIdEntity() {
		try {
			txn.begin();
	        
			Conseiller c= em.find(Conseiller.class, 1);			
			
			System.out.println(c);
			
			txn.commit();
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
			
		} finally {
			if (em != null) {
				em.close();
			}
			if (emf != null) {
				emf.close();
			}
		} 
	}
}
