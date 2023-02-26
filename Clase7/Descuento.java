package EjArgProg.Clase7;

// La clase Descuento representa un descuento que se puede aplicar a un carrito
abstract class Descuento {
    protected String nombre;

    public Descuento(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularDescuento(Carrito carrito);

    public String getNombre() {
        return nombre;
    }
    public abstract double aplicarDescuento(double precio);
}
