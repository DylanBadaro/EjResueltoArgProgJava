package EjArgProg.Clase7;

public class Descripcion {
    /*
    El programa consiste en un carrito de compras que permite agregar productos y descuentos, y calcular el precio final.

    --La clase "Producto" representa un producto y tiene dos atributos: nombre y precio.

    --La clase abstracta "Descuento" representa un descuento y tiene un atributo nombre
    y dos métodos abstractos: calcularDescuento y aplicarDescuento. La primera calcula
    el descuento que se aplicará y la segunda resta ese descuento del precio del producto.

    --La clase "DescuentoFijo" extiende la clase Descuento y representa un descuento fijo.
    Tiene un atributo descuento que indica el valor fijo del descuento.

    --La clase "DescuentoPorcentaje" extiende la clase Descuento y representa un descuento por porcentaje.
    Tiene un atributo porcentaje que indica el porcentaje del descuento.

    --La clase "DescuentoPorcentajeConTope" extiende la clase DescuentoPorcentaje y representa
    un descuento por porcentaje con un tope máximo. Tiene un atributo tope que indica el valor máximo del descuento.

    --La clase "CarritoDeCompras" representa el carrito de compras y tiene una lista de productos
    y una lista de descuentos. Tiene un método precio que calcula el precio total de
    los productos con los descuentos aplicados.

    --En el main se crean algunos objetos de Producto y de las clases que extienden Descuento,
    se agregan al carrito, y luego se llama al método precio para obtener el precio total con los
    descuentos aplicados. También se ejecutan algunos tests para comprobar el correcto funcionamiento del programa.
    */
}
