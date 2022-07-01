package persistence;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Conseiller;

public class TestPersist {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();
        EntityTransaction txn = em.getTransaction();
        try {
            txn.begin();
            
            LocalDate date = LocalDate.now();
	        LocalDate date1 = LocalDate.now();
            Conseiller c = new Conseiller( "01","TIM", "batman", date , 2000, date1);	
            em.persist(c);

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
