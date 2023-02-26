package EjArgProg.Clase7;

// La clase DescuentoPorcentajeConTope representa un descuento que es un porcentaje del total del carrito con un tope fijo
public class DescuentoPorcentajeConTope extends DescuentoPorcentaje {

    private double tope;

    public DescuentoPorcentajeConTope(String nombre, double porcentaje, double tope) {
        super(nombre, porcentaje);
        this.tope = tope;
    }

    @Override
    public double aplicarDescuento(double precio) {
        double descuento = super.aplicarDescuento(precio);
        if (descuento > tope) {
            return precio - tope;
        } else {
            return precio - descuento;
        }
    }
}