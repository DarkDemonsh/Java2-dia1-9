package dia2act1;

import dia2act1.Entidad.Prro;
import dia2act1.Servicio.ServicioPrro;

public class Dia2act1 {

    public static void main(String[] args) {
        ServicioPrro sp = new ServicioPrro();
        Prro p = sp.crear_prro();
        
        sp.mostrar(p);
        sp.buscar(p);
    }
    
}
