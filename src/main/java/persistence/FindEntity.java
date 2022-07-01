package persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Conseiller;

public class FindEntity {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();

        Conseiller p = em.find(Conseiller.class, 1);
//            em.remove(p1);
        System.out.println(p);

        if (em != null) {
            em.close();
        }
        if (emf != null) {
            emf.close();
        }

	}

}
