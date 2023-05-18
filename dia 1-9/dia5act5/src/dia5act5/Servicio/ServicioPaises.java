package dia5act5.Servicio;

import dia5act5.Entidad.Paises;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ServicioPaises {
    Scanner leer = new Scanner(System.in);
    Paises p = new Paises();
    ArrayList<String> list = new ArrayList<>();
    
    public Paises Crear(){
        String r;
      do{
          System.out.println("Ingrese el nombre del pais");
          p.setPais(leer.next());
          
          list.add(p.getPais());
          System.out.println("");
          
          System.out.println("¿Desea ingresar otro pais?(Si/No)");
          r = leer.next();
          System.out.println("");
          
      }while(r.equalsIgnoreCase("SI"));  
      return p;  
    }
    
    public void mostrar(Paises p){
        System.out.println("");
        System.out.println("Lista de paises ordenada");
        Collections.sort(list);
        list.forEach((p1) -> {
            System.out.println("-"+p1);
        });
    
    }
    
    public void detel(Paises p){
        Iterator<String> p0 = list.iterator();
        System.out.println("");
        
        System.out.println("Ingrese el pais a buscar");
        String s = leer.next();
        System.out.println("");
        
        boolean f = false;
        
        while(p0.hasNext()){
            String d = p0.next();
            
            if(d.equalsIgnoreCase(s)){
                p0.remove();
                f = true;
                break;
            }            
        }
        
        Collections.sort(list);        
        if(f){
            System.out.println("El pais |"+s+"| fue Atomizado");
        }else{
            System.out.println("El pais |"+s+"| no fue encontrado");
        }
        
    }
    
    public void nuevabusqueda(Paises p){
        System.out.println("");
        System.out.println("Lista de paises ordenada");
        Collections.sort(list);
        list.forEach((p1) -> {
            System.out.println("-"+p1);
        });
    }
      
}