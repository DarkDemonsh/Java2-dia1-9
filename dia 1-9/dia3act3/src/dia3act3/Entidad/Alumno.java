package dia3act3.Entidad;

import java.util.List;

public class Alumno {
    
    private String nombre;
    private List<Integer> nota;

    public Alumno() {
    }

    public Alumno(String nombre, List<Integer> nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getNota() {
        return nota;
    }

    public void setNota(List<Integer> nota) {
        this.nota = nota;
    }
 
}
