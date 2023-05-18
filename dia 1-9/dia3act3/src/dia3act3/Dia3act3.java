package dia3act3;

import dia3act3.Servicio.ServicioAlumno;
import java.util.Scanner;

public class Dia3act3 {

    public static void main(String[] args) {
        ServicioAlumno sa = new ServicioAlumno();
        Scanner leer = new Scanner(System.in);

          sa.CrearAlumnos();
          
          System.out.println("ingrese el nombre del alumno para calcular su nota");
          String na = leer.nextLine();
          
          double nf = sa.notaFinal(na);
          System.out.println("el promedio de |"+na+"| es de: "+nf);
        
        

    }
    
}
