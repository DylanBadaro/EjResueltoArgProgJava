package EjArgProg.Clase7;

import java.util.ArrayList;
import java.util.List;

// La clase Carrito representa el carrito de compras
class Carrito {
    private List<Producto> productos;
    private List<Descuento> descuentos;

    public Carrito() {
        productos = new ArrayList<Producto>();
        descuentos = new ArrayList<Descuento>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void agregarDescuento(Descuento descuento) {
        descuentos.add(descuento);
    }

    public double getTotal() {
        double total = 0.0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        for (Descuento descuento : descuentos) {
            total -= descuento.calcularDescuento(this);
        }
        return total;
    }
}
