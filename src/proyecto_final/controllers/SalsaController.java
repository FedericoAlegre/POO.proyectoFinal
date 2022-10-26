package proyecto_final.controllers;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import proyecto_final.Models.Salsa;

/**
 * 
 * @author fedea
 */
public class SalsaController {
    
    private static EntityManagerFactory emf;
    private static EntityManager em;
    
    public SalsaController(){
        if (emf == null && em == null) {
            SalsaController.emf = Persistence.createEntityManagerFactory("Proyecto_FinalPU");
            SalsaController.em = emf.createEntityManager();
        }
    }
    
    public void createSalsa(String n, int p) throws Exception {
        Salsa s = new Salsa(n, p);
        em.getTransaction().begin();
        em.persist(s);
        em.getTransaction().commit();
    }
    
    public List<Salsa> getSalsaList(){
        return em.createNamedQuery("list Salsas").getResultList();
    }
    
    public void deleteSalsa(Long id)throws Exception{
        Salsa s;
        s = em.find(Salsa.class, id);
        em.getTransaction().begin();
        em.remove(s);
        em.getTransaction().commit();
    }
    
    public Salsa getSalsa(Long id)throws Exception{
        return em.find(Salsa.class, id);
    }
    
    public void updateSalsa(String n,int p, Long id) throws Exception{
        Salsa t = em.find(Salsa.class, id);
        t.setNombre(n);
        t.setPicor(p);
        if (t!= null){
            em.getTransaction().begin();
            em.persist(t);
            em.getTransaction().commit();
        }else{            
            System.out.println("NO EXISTE LA SALSA");
        }
    }
}
