package dia4act4.Entidad;

public class Pelicula {
    
    private String titulo;
    private String Director;
    private double Duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String Director, double Duracion) {
        this.titulo = titulo;
        this.Director = Director;
        this.Duracion = Duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public double getDuracion() {
        return Duracion;
    }

    public void setDuracion(Double Duracion) {
        this.Duracion = Duracion;
    }
    
    
}
