package proyecto_final.Models;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.NamedQuery;


@Entity
@Table(name="Salsas")
@NamedQuery(name="list Salsas", query="SELECT p FROM Salsa p")
public class Salsa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="Nombre")
    private String nombre;
    @Column(name="Picor")
    private int picor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Salsa() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Salsa(String nombre, int picor) {
        this.nombre = nombre;
        this.picor = picor;
    }

    public int getPicor() {
        return picor;
    }

    public void setPicor(int picor) {
        this.picor = picor;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.id);
        hash = 17 * hash + Objects.hashCode(this.nombre);
        hash = 17 * hash + this.picor;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Salsa other = (Salsa) obj;
        if (this.picor != other.picor) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Salsa{" + "id=" + id + ", nombre=" + nombre + ", picor=" + picor + '}';
    }

    
    
    
    
}
