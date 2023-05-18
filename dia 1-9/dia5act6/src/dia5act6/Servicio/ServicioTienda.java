package dia5act6.Servicio;

import dia5act6.Entidad.Tienda;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ServicioTienda {
    Scanner leer = new Scanner(System.in);
    Tienda t = new Tienda();
    private static Map<String,Double> map = new HashMap<>();

    public Tienda crear(){
        return t;
    }
    
    public void agregar(Tienda t){

        System.out.println("Introducir nombre del producto");
        t.setProducto(leer.next());
        System.out.println("");
        System.out.println("Introducir precio del producto");
        t.setPrecio(leer.nextDouble());
        System.out.println("");
        map.put(t.getProducto(), t.getPrecio());
        System.out.println("Productos agregados");
        System.out.println("");
        
    }
    
    public void mod_precio(Tienda t){
        
        System.out.println("Ingrese el nombre del producto");
        String b = leer.next();
        System.out.println("");
        if(map.containsKey(b)){
            System.out.println("Ingrese el nuevo precio del producto: "+b);
            Double np = leer.nextDouble();
            map.put(b, np);
            System.out.println("");
            System.out.println("Precio modificado");
            System.out.println("");
        }else{
            System.out.println("Producto no encontrado");
            System.out.println("");
        }
    }
    
    public void delet(Tienda t){
        
        System.out.println("Ingrese el nombre del producto");
        String b = leer.next();
        System.out.println("");
        if(map.containsKey(b)){
            map.remove(b);
            System.out.println("Producto eliminado");
            System.out.println("");
        }else{
            System.out.println("Producto no encontrado");
            System.out.println("");
        }  
    }
    
    public void mostrar(Tienda t){
        
        if(map.isEmpty()){
            System.out.println("No hay productos en la TIENDA, osea que esto no es una tienda");
        }else{
            System.out.println("");
            System.out.println("Productos en el inventario");
            System.out.println("");
            map.entrySet().forEach((pp) -> {
                System.out.println("Nombre: "+pp.getKey()+ "/ Precio: "+pp.getValue()+"$");
                System.out.println("");
            });
        }  
    }
}
