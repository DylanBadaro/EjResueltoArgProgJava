package EjArgProg.Clase7;

import java.util.ArrayList;

public class CarritoDeCompras {
    private ArrayList<Producto> productos;
    private ArrayList<Descuento> descuentos;

    public CarritoDeCompras() {
        productos = new ArrayList<>();
        descuentos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void agregarDescuento(Descuento descuento) {
        descuentos.add(descuento);
    }

    public double precio() {
        double precioTotal = 0;

        // Calculamos el precio total de los productos
        for (Producto producto : productos) {
            precioTotal += producto.getPrecio();
        }

        // Aplicamos los descuentos en orden
        for (Descuento descuento : descuentos) {
            precioTotal = descuento.aplicarDescuento(precioTotal);
        }

        return precioTotal;
    }
}