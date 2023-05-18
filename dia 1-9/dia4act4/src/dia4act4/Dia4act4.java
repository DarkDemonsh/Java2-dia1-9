package dia4act4;

import dia4act4.Entidad.Pelicula;
import dia4act4.Servicio.ServicioPelicula;

public class Dia4act4 {

    public static void main(String[] args) {
        ServicioPelicula sp = new ServicioPelicula();
        Pelicula p = sp.crear();
        
        sp.mostrar_peliculas(p);
        sp.duracion_menor(p);
        sp.orden_d_mayor(p);
        sp.oreden_d_menor(p);
        sp.titulo_alfa(p);
        sp.Direct_alfa(p);
        
    }
    
}
