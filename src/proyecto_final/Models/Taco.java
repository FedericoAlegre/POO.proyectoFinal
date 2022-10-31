package proyecto_final.Models;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import static javax.persistence.TemporalType.DATE;

@Entity
@Table(name = "Tacos")
@NamedQuery(name = "list Tacos", query = "SELECT p FROM Taco p")
@NamedQuery(name = "list Tacos by State", query = "SELECT p FROM Taco p WHERE p.estado = :e")
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
    private TacoState estado;
    @Temporal(DATE)
    private Date fecha;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Taco(Tortilla tortilla, Relleno relleno1, Relleno relleno2, Relleno relleno3, Salsa salsa, TacoState state, Date date) {
        this.tortilla = tortilla;
        this.relleno1 = relleno1;
        this.relleno2 = relleno2;
        this.relleno3 = relleno3;
        this.salsa = salsa;
        this.estado = state;
        this.fecha = date;
    }

    public TacoState getState() {
        return estado;
    }

    public Date getDate() {
        return fecha;
    }

    public void setState(TacoState state) {
        this.estado = state;
    }

    public void setDate(Date date) {
        this.fecha = date;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + Objects.hashCode(this.id);
        hash = 31 * hash + Objects.hashCode(this.tortilla);
        hash = 31 * hash + Objects.hashCode(this.relleno1);
        hash = 31 * hash + Objects.hashCode(this.relleno2);
        hash = 31 * hash + Objects.hashCode(this.relleno3);
        hash = 31 * hash + Objects.hashCode(this.salsa);
        hash = 31 * hash + Objects.hashCode(this.estado);
        hash = 31 * hash + Objects.hashCode(this.fecha);
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
        if (!Objects.equals(this.salsa, other.salsa)) {
            return false;
        }
        if (this.estado != other.estado) {
            return false;
        }
        return Objects.equals(this.fecha, other.fecha);
    }

    @Override
    public String toString() {
        return "Taco{" + "id=" + id + ", tortilla=" + tortilla + ", relleno1=" + relleno1 + ", relleno2=" + relleno2 + ", relleno3=" + relleno3 + ", salsa=" + salsa + ", state=" + estado + ", date=" + fecha + '}';
    }

}
