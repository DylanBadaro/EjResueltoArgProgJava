package EjArgProg.Clase7;

import java.util.ArrayList;
import java.util.List;

// La clase Producto representa los productos en nuestro sistema
class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}