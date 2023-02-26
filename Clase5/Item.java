package EjArgProg.Clase5;

public class Item {
    private int cantidad;// variable que almacena la cantidad de unidades del artículo
    private double precioUnitario; // variable que almacena el precio unitario del artículo
    private String producto;// variable que almacena el nombre del artículo

    public Item(int cantidad, double precioUnitario, String producto) {
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.producto = producto;
    }
    /*
     Constructor de la clase Item. Recibe la cantidad, precio unitario y nombre del artículo.
     @param cantidad cantidad de unidades del artículo.
     @param precioUnitario precio unitario del artículo.
     @param producto nombre del artículo.
     */


    public double calcularPrecio() {
        return cantidad * precioUnitario;
    }
    /*
     Método que calcula el precio total del artículo.
     @return el precio total del artículo.
     */


    public String toString() {
        return cantidad + "\t" + precioUnitario + "\t" + producto;
    }
    /*
     Método que retorna una cadena de caracteres con la información del artículo.
     @return cadena de caracteres con la información del artículo.
     */


    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioTotal() {
        return cantidad * precioUnitario;
    }

    // getters y setters
}
