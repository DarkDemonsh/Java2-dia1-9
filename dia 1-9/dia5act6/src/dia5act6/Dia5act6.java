package dia5act6;

import dia5act6.Entidad.Tienda;
import dia5act6.Servicio.ServicioTienda;
import java.util.Scanner;

public class Dia5act6 {

    public static void main(String[] args) {
        ServicioTienda st = new ServicioTienda();
        Tienda t = st.crear();
        Scanner leer = new Scanner(System.in);
        
        while (t.getX() != 5){
           System.out.println("---MENU---");
           System.out.println("1- Agregar producto");
           System.out.println("2- Modificar precio de un producto");
           System.out.println("3- Eliminar un producto");
           System.out.println("4- Mostrar todos los productos");
           System.out.println("5- Salir");
           System.out.println("----------");
           System.out.println("");
           
           System.out.print("Ingrese una opcion: ");
           t.setX(leer.nextInt());
           System.out.println("");
           
        switch(t.getX()){
           case 1:
               st.agregar(t);
               break;
           case 2:
               st.mod_precio(t);
               break;
           case 3:
               st.delet(t);
               break;
           case 4:
               st.mostrar(t);
               break;
           case 5:
               System.out.println("Saliendo del programa");
               System.out.println("");
               break;
           default:
               System.out.println("Opcion invalida... como usted");
               System.out.println("");
               break;
       }}
        
    }
    
}
