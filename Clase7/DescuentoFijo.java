package EjArgProg.Clase7;

// La clase DescuentoFijo representa un descuento que es un monto fijo en dinero
public class DescuentoFijo extends Descuento {
    private double descuento;

    public DescuentoFijo(double descuento) {
        super("Descuento Fijo");
        this.descuento = descuento;
    }

    @Override
    public double aplicarDescuento(double precio) {
        return precio - descuento;
    }

    @Override
    public double calcularDescuento(Carrito carrito) {
        return descuento;
    }
}
