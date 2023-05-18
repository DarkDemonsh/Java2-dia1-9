package dia5act5;

import dia5act5.Entidad.Paises;
import dia5act5.Servicio.ServicioPaises;

public class Dia5act5 {

    public static void main(String[] args) {
        ServicioPaises sp = new ServicioPaises();
        Paises p = sp.Crear();
        
        sp.mostrar(p);
        sp.detel(p);
        sp.nuevabusqueda(p);
        System.out.println("");
    }
    
}
