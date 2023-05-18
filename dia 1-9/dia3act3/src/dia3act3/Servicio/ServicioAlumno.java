package dia3act3.Servicio;

import dia3act3.Entidad.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ServicioAlumno {
    Scanner leer = new Scanner(System.in);
    ArrayList alum = new ArrayList<>();
    List<Integer> notas = new ArrayList<>();
    
   public void CrearAlumnos(){
       String r;
       
       do{
           System.out.println("Ingrese el nombre del alumno");
           String nam = leer.nextLine(); 

           for (int i = 1; i <= 3; i++) {
               System.out.println("ingrese las notas del °"+i+" Alumno");
               int nota = Integer.parseInt(leer.nextLine());
               notas.add(nota);
           }
           
               Alumno a = new Alumno(nam,notas);
               alum.add(a);
               
               System.out.println("desea añadir otro alumno(SI/NO)");
               r = leer.nextLine();
               System.out.println("");
       }while(r.equalsIgnoreCase("SI"));
       
   }
    
    public double notaFinal(String na){
        for (Iterator it = alum.iterator(); it.hasNext();) {
            Alumno a = (Alumno) it.next();
            if(a.getNombre().equalsIgnoreCase(na)){
                List<Integer> notas = a.getNota();
                double prom = notas.stream().mapToInt(Integer::intValue).average().orElse(0);
                return prom;
            }
        }
        return 0;
    }
    
    
    
}
