package dia5act6.Entidad;

public class Tienda {
    
    private String producto;
    private double precio;
    private int x;

    public Tienda() {
    }

    public Tienda(String producto, double precio, int x) {
        this.producto = producto;
        this.precio = precio;
        this.x = x;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    
    
    
}
