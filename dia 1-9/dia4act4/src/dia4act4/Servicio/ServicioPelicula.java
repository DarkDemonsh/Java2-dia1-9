package dia4act4.Servicio;

import dia4act4.Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ServicioPelicula {
    Scanner leer = new Scanner(System.in);
    Pelicula p = new Pelicula();
    List<Double> tiempo = new ArrayList<>();
    ArrayList<String> list = new ArrayList<>();
    ArrayList<String> direct = new ArrayList<>();

    public Pelicula crear(){
        String r;
        do{
            System.out.println("Ingrese el nombre de la pelicula");
            p.setTitulo(leer.next());
            System.out.println("Ingrese el director de la pelicula");
            p.setDirector(leer.next());
            System.out.println("ingrese la duracion de la pelicula");
            p.setDuracion(leer.nextDouble());
            System.out.println("");
            System.out.println("¿Desea añadir otra pelicula?(SI/NO)");
            r = leer.next();
            System.out.println("");
            
            list.add(p.getTitulo());
            direct.add(p.getDirector());
            tiempo.add(p.getDuracion());
            
            
        }while(r.equalsIgnoreCase("si"));
        return p;
    }
    
    public void mostrar_peliculas(Pelicula p){
        System.out.println("Lista de peliculas");       
        for(int i = 0; i < list.size(); i++){  
            System.out.println("Titulo: |"+list.get(i)+"| Director: |"+direct.get(i)+"| Duracion: |"+tiempo.get(i)+"hs|");             
        }        

    }
    
    public void duracion_menor(Pelicula p){
        System.out.println("");
        System.out.println("Lista de peliculas que duran mas de 1:00hs");
        for(int i = 0; i < list.size(); i++){
            
            if(tiempo.get(i)<1){
                
            }else{
            System.out.println("Titulo: |"+list.get(i)+"| Director: |"+direct.get(i)+"| Duracion: |"+tiempo.get(i)+"hs|"); 
            }
  
        }
        
    }
    
    public void orden_d_mayor(Pelicula p){
        System.out.println("");
        System.out.println("Lista de peliculas ordenada de mayor a menor duracion");
       
        ArrayList<Pelicula> peliculas = new ArrayList<>();
        
        for (int i = 0; i < tiempo.size(); i++) {
            peliculas.add(new Pelicula(list.get(i), direct.get(i), tiempo.get(i)));
        }        
        Collections.sort(peliculas, (Pelicula p1, Pelicula p2) -> Double.compare(p2.getDuracion(), p1.getDuracion()));
        
        for(Pelicula p0 : peliculas){  
            System.out.println("Titulo: |"+p0.getTitulo()+"| Director: |"+p0.getDirector()+"| Duracion: |"+p0.getDuracion()+"hs|");    
        }
        
    }
    
    public void oreden_d_menor(Pelicula p){
        System.out.println("");
        System.out.println("Lista de peliculas ordenada de menor a mayor duracion");
        
        ArrayList<Pelicula> peliculas = new ArrayList<>();
        
        for (int i = 0; i < tiempo.size(); i++) {
            peliculas.add(new Pelicula(list.get(i), direct.get(i), tiempo.get(i)));
        }
        Collections.sort(peliculas, (Pelicula p1, Pelicula p2) -> Double.compare(p1.getDuracion(), p2.getDuracion()));
        
        for(Pelicula p0 : peliculas){  
            System.out.println("Titulo: |"+p0.getTitulo()+"| Director: |"+p0.getDirector()+"| Duracion: |"+p0.getDuracion()+"hs|");    
        }
    }
    
    public void titulo_alfa(Pelicula p){
        System.out.println("");
        System.out.println("Lista de peliculas ordenada por titulo de la a-z");
        
        ArrayList<Pelicula> peliculas = new ArrayList<>();
        
        for (int i = 0; i < list.size(); i++) {
            peliculas.add(new Pelicula(list.get(i), direct.get(i), tiempo.get(i)));
        }
        
        Collections.sort(peliculas, (Pelicula p1, Pelicula p2) -> p1.getTitulo().compareTo(p2.getTitulo()));
        
        for(Pelicula p0 : peliculas){  
            System.out.println("Titulo: |"+p0.getTitulo()+"| Director: |"+p0.getDirector()+"| Duracion: |"+p0.getDuracion()+"hs|");    
        }  
    }
    
    public void Direct_alfa(Pelicula p){
        System.out.println("");
        System.out.println("Lista de peliculas ordenada por director de la a-z");
        
        ArrayList<Pelicula> peliculas = new ArrayList<>();
        
        for (int i = 0; i < tiempo.size(); i++) {
            peliculas.add(new Pelicula(list.get(i), direct.get(i), tiempo.get(i)));
        }
        
        Collections.sort(peliculas, (Pelicula p1, Pelicula p2) -> p1.getDirector().compareTo(p2.getDirector()));
        
        for(Pelicula p0 : peliculas){  
            System.out.println("Titulo: |"+p0.getTitulo()+"| Director: |"+p0.getDirector()+"| Duracion: |"+p0.getDuracion()+"hs|");    
        }  
    }  
}
