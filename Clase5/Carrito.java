package EjArgProg.Clase5;
import java.util.ArrayList;

public class Carrito {
    private ArrayList<Item> items;

    // Constructor que inicializa la lista de items del carrito
    public Carrito() {
        items = new ArrayList<Item>();
    }

    // Método para agregar un item al carrito
    public void agregarItem(Item item) {
        items.add(item);
    }

    // Método para mostrar el contenido del carrito, imprimiendo cada item
    public void mostrarContenido() {
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }

    // Método para obtener el precio total del carrito, sumando el precio de cada item
    public double getPrecioTotal() {
        double precioTotal = 0;
        for (Item item : items) {
            precioTotal += item.getPrecioTotal();
        }
        return precioTotal;
    }

    // Método para obtener la cantidad total de productos del carrito, sumando la cantidad de cada item
    public int getCantidadTotal() {
        int cantidadTotal = 0;
        for (Item item : items) {
            cantidadTotal += item.getCantidad();
        }
        return cantidadTotal;
    }

    // Método que retorna el precio total del carrito, sumando el precio de cada item
    public double precio() {
        double precioTotal = 0;
        for (Item item : items) {
            precioTotal += item.getPrecioTotal();
        }
        return precioTotal;
    }
}
