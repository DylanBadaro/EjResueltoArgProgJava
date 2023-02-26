package EjArgProg.Clase7;

public class Main {
    public static void main(String[] args) {
        // Creamos algunos productos
        Producto tv = new Producto("TV", 10000);
        Producto celular = new Producto("Celular", 5000);
        Producto laptop = new Producto("Laptop", 20000);

        // Creamos algunos descuentos
        Descuento descuentoFijoObj = new DescuentoFijo(100.0);
        Descuento descuentoPorcentajeObj = new DescuentoPorcentaje("Descuento Porcentaje", 10.0);
        Descuento descuentoPorcentajeConTopeObj = new DescuentoPorcentajeConTope("Descuento Porcentaje con Tope", 20.0, 500.0);

        // Creamos un carrito de compras
        CarritoDeCompras carrito = new CarritoDeCompras();

        // Agregamos productos al carrito
        carrito.agregarProducto(tv);
        carrito.agregarProducto(celular);
        carrito.agregarProducto(laptop);

        // Agregamos descuentos al carrito
        carrito.agregarDescuento(descuentoFijoObj);
        carrito.agregarDescuento(descuentoPorcentajeObj);
        carrito.agregarDescuento(descuentoPorcentajeConTopeObj);

        // Calculamos el precio final
        double precioFinal = carrito.precio();

        System.out.println("El precio total es: $" + precioFinal);

        // Test para DescuentoFijo
        double precioDescuentoFijo = descuentoFijoObj.aplicarDescuento(500);
        System.out.println("Precio con DescuentoFijo aplicado: " + precioDescuentoFijo);

        // Test para DescuentoPorcentaje
        double precioDescuentoPorcentaje = descuentoPorcentajeObj.aplicarDescuento(500);
        System.out.println("Precio con DescuentoPorcentaje aplicado: " + precioDescuentoPorcentaje);

        // Test para DescuentoPorcentajeConTope
        double precioDescuentoPorcentajeConTope = descuentoPorcentajeConTopeObj.aplicarDescuento(1000);
        System.out.println("Precio con DescuentoPorcentajeConTope aplicado: " + precioDescuentoPorcentajeConTope);
    }
}
