package proyecto_final.Models;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import proyecto_final.Models.Relleno;
import proyecto_final.Models.Salsa;
import proyecto_final.Models.TacoState;
import proyecto_final.Models.Tortilla;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-10-31T19:42:56")
@StaticMetamodel(Taco.class)
public class Taco_ { 

    public static volatile SingularAttribute<Taco, Date> fecha;
    public static volatile SingularAttribute<Taco, TacoState> estado;
    public static volatile SingularAttribute<Taco, Relleno> relleno1;
    public static volatile SingularAttribute<Taco, Relleno> relleno2;
    public static volatile SingularAttribute<Taco, Relleno> relleno3;
    public static volatile SingularAttribute<Taco, Long> id;
    public static volatile SingularAttribute<Taco, Tortilla> tortilla;
    public static volatile SingularAttribute<Taco, Salsa> salsa;

}