package proyecto_final;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import proyecto_final.Models.Tortilla;

public class Program {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Proyecto_FinalPU");
        EntityManager em = emf.createEntityManager();
        Tortilla t;
        t = new Tortilla("trigo");
        em.getTransaction().begin();
        em.persist(t);
        em.getTransaction().commit();
    }

}
