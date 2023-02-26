package EjArgProg.Clase7;

// La clase DescuentoPorcentaje representa un descuento que es un porcentaje del total del carrito
class DescuentoPorcentaje extends Descuento {
    private double porcentaje;

    public DescuentoPorcentaje(String nombre, double porcentaje) {
        super(nombre);
        this.porcentaje = porcentaje;
    }

    public double calcularDescuento(Carrito carrito) {
        return carrito.getTotal() * porcentaje / 100.0;
    }
    @Override
    public double aplicarDescuento(double precio) {
        return precio * (1 - (porcentaje / 100));
    }
    /*Este método calcula el descuento en base al porcentaje
    almacenado en el objeto DescuentoPorcentaje y lo aplica
    al precio recibido como parámetro.*/
}