/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_final.controllers;

import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.sqlite.SQLiteException;
import proyecto_final.Models.Tortilla;

/**
 *
 * @author fedea
 */
public class TortillaController {

    private static EntityManagerFactory emf;
    private static EntityManager em;

    public TortillaController() {
        if (emf == null && em == null) {
            TortillaController.emf = Persistence.createEntityManagerFactory("Proyecto_FinalPU");
            TortillaController.em = emf.createEntityManager();
        }

    }
    
    public Tortilla instanceTortilla(String n){
        return new Tortilla(n);
    }
    

    public void createTortilla(String n) throws Exception {
        Tortilla t = new Tortilla(n);
        em.getTransaction().begin();
        em.persist(t);
        em.getTransaction().commit();
    }

    public List<Tortilla> getTortillaList() throws Exception{
        
        Query q = em.createNamedQuery("list Tortillas");
        List<Tortilla> tortillas;
        tortillas = q.getResultList();
        return tortillas;
    }
    
    public void deleteTortilla(Long id)throws Exception{
        Tortilla t;
        t = em.find(Tortilla.class, id);
        em.getTransaction().begin();
        em.remove(t);
        em.getTransaction().commit();
    }
    
    public Tortilla getTortilla(Long id)throws Exception{
        return em.find(Tortilla.class, id);
    }
    
    public void updateTortilla(String n, Long id) throws Exception{
        Tortilla t = em.find(Tortilla.class, id);
        t.setNombre(n);
        if (t!= null){
            em.getTransaction().begin();
            em.persist(t);
            em.getTransaction().commit();
        }else{            
            System.out.println("NO EXISTE LA TORTILLA");
        }
    }

}
