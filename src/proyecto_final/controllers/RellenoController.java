/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_final.controllers;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import proyecto_final.Models.Relleno;

/**
 *
 * @author fedea
 */
public class RellenoController {
    
    private static EntityManagerFactory emf;
    private static EntityManager em;
    
    public RellenoController(){
        if (emf == null && em == null) {
            RellenoController.emf = Persistence.createEntityManagerFactory("Proyecto_FinalPU");
            RellenoController.em = emf.createEntityManager();
        }
    }
    
    public void createRelleno(String n) throws Exception {
        Relleno s = new Relleno(n);
        em.getTransaction().begin();
        em.persist(s);
        em.getTransaction().commit();
    }
    
    public List<Relleno> getRellenoList(){
        return em.createNamedQuery("list Rellenos").getResultList();
    }
    
    public void deleteRelleno(Long id)throws Exception{
        Relleno r;
        r = em.find(Relleno.class, id);
        em.getTransaction().begin();
        em.remove(r);
        em.getTransaction().commit();
    }
    
    public Relleno getRelleno(Long id)throws Exception{
        return em.find(Relleno.class, id);
    }
    
    public void updateRelleno(String n, Long id) throws Exception{
        Relleno t = em.find(Relleno.class, id);
        t.setNombre(n);
        if (t!= null){
            em.getTransaction().begin();
            em.persist(t);
            em.getTransaction().commit();
        }else{            
            System.out.println("NO EXISTE LA SALSA");
        }
    }
}
