
package proyecto_final.controllers;

import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import proyecto_final.Models.Relleno;
import proyecto_final.Models.Salsa;
import proyecto_final.Models.Taco;
import proyecto_final.Models.TacoState;
import proyecto_final.Models.Tortilla;


public class TacoController {
    private static EntityManagerFactory emf;
    private static EntityManager em;
    
    public TacoController(){
        if (emf == null && em == null) {
            TacoController.emf = Persistence.createEntityManagerFactory("Proyecto_FinalPU");
            TacoController.em = emf.createEntityManager();
        }
    }
    
    public void createTaco(Tortilla to, Relleno r1, Relleno r2, Relleno r3, Salsa s) throws Exception {
        
        Taco ta = new Taco(to, r1, r2, r3, s, TacoState.Pedido, new Date());
        em.getTransaction().begin();
        em.persist(ta);
        em.getTransaction().commit();
    }

    public List<Taco> getTacoList(String x, TacoState s){
        if("Tacos".equals(x)){
            return em.createNamedQuery("list "+x).getResultList();
        }else{
            Query q = em.createNamedQuery("list "+x);
            q.setParameter("e", s);
            return q.getResultList();
        }
        
    }
    
    public void deleteTaco(Long id){
        Taco t;
        t = em.find(Taco.class, id);
        em.getTransaction().begin();
        em.remove(t);
        em.getTransaction().commit();
    }
    
    public Taco getTaco(Long id){
        return em.find(Taco.class, id);
    }
    
    public void updateTaco(Tortilla to, Relleno r1, Relleno r2, Relleno r3, Salsa s, Long id){
        Taco t = em.find(Taco.class, id);
        
        if(t!=null){            
            t.setRelleno1(r1);
            t.setRelleno2(r2);
            t.setRelleno3(r3);
            t.setTortilla(to);
            t.setSalsa(s);
            em.getTransaction().begin();
            em.persist(t);
            em.getTransaction().commit();
        }else{            
            System.out.println("NO EXISTE EL TACO");
        }        
    }
    
    public void updateStateTaco(Long id, TacoState s){
        Taco t = em.find(Taco.class, id);
        
        if(t!=null){            
            t.setState(s);
            em.getTransaction().begin();
            em.persist(t);
            em.getTransaction().commit();
        }else{            
            System.out.println("NO EXISTE EL TACO");
        }  
    }
    
}
