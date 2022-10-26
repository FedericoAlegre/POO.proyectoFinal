package proyecto_final.Models;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "Tacos")
public class Taco implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Tortilla tortilla;
    @ManyToOne
    private Relleno relleno1;
    @ManyToOne
    private Relleno relleno2;
    @ManyToOne
    private Relleno relleno3;
    @ManyToOne
    private Salsa salsa;

    public void setTortilla(Tortilla tortilla) {
        this.tortilla = tortilla;
    }

    public void setRelleno1(Relleno relleno1) {
        this.relleno1 = relleno1;
    }

    public void setRelleno2(Relleno relleno2) {
        this.relleno2 = relleno2;
    }

    public void setRelleno3(Relleno relleno3) {
        this.relleno3 = relleno3;
    }

    public void setSalsa(Salsa salsa) {
        this.salsa = salsa;
    }

    public Tortilla getTortilla() {
        return tortilla;
    }

    public Relleno getRelleno1() {
        return relleno1;
    }

    public Relleno getRelleno2() {
        return relleno2;
    }

    public Relleno getRelleno3() {
        return relleno3;
    }

    public Salsa getSalsa() {
        return salsa;
    }

    public Taco() {
    }

    public Taco(Tortilla tortilla, Relleno relleno1, Relleno relleno2, Relleno relleno3, Salsa salsa) {
        this.tortilla = tortilla;
        this.relleno1 = relleno1;
        this.relleno2 = relleno2;
        this.relleno3 = relleno3;
        this.salsa = salsa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.id);
        hash = 37 * hash + Objects.hashCode(this.tortilla);
        hash = 37 * hash + Objects.hashCode(this.relleno1);
        hash = 37 * hash + Objects.hashCode(this.relleno2);
        hash = 37 * hash + Objects.hashCode(this.relleno3);
        hash = 37 * hash + Objects.hashCode(this.salsa);
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
        final Taco other = (Taco) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.tortilla, other.tortilla)) {
            return false;
        }
        if (!Objects.equals(this.relleno1, other.relleno1)) {
            return false;
        }
        if (!Objects.equals(this.relleno2, other.relleno2)) {
            return false;
        }
        if (!Objects.equals(this.relleno3, other.relleno3)) {
            return false;
        }
        return Objects.equals(this.salsa, other.salsa);
    }

    @Override
    public String toString() {
        return "Taco{" + "id=" + id + ", tortilla=" + tortilla + ", relleno1=" + relleno1 + ", relleno2=" + relleno2 + ", relleno3=" + relleno3 + ", salsa=" + salsa + '}';
    }
    
    
}
