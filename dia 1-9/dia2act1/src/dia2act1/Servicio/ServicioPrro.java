package dia2act1.Servicio;

import dia2act1.Entidad.Prro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ServicioPrro {
    
    Scanner leer = new Scanner(System.in);
    Prro p = new Prro();
    ArrayList<String> razap = new ArrayList<>();
    int i = 0;
    
    public Prro crear_prro(){
  
        do{
        System.out.println("Ingrese la raza del perro o escriba salir para terminar");
        p.setRaza(leer.next());
        System.out.println("");
        
        if(p.getRaza().equalsIgnoreCase("Salir")){
            i = 1;
            break;
        }else{
            razap.add(p.getRaza());
        }
        
        }while(i == 0);
        
        return p;
    }
    
    public void mostrar(Prro p){
        System.out.println("Razas de perros registradas: ");
        
        for (String razap0 : razap) {
            
            System.out.println("-"+razap0);
        }
        System.out.println("");
    }
    
    public void buscar(Prro p){
        Iterator<String> prroite = razap.iterator();
        
        System.out.println("Ingrese la raza a buscar");
        String busca = leer.next();
        System.out.println("");
        boolean find = false;
        
        while(prroite.hasNext()){
            String dog = prroite.next();
            if(dog.equalsIgnoreCase(busca)){
                prroite.remove();
                find = true;
                break;
            }
        }
   
        Collections.sort(razap);
        
        if(find){
            System.out.println("El perro |"+busca+"| fue silenciado");
        }else{
            System.out.println("El perro |"+busca+"| no esta en la lista");
        }
        System.out.println("");
        System.out.println("Nueva lista de perros");
        for (String razap0 : razap) {
            
            System.out.println("-"+razap0);
        }
        System.out.println("");
        
    }
    
}
