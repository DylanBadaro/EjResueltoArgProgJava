package EjArgProg.Clase5;

import java.io.File; // importar la clase File para trabajar con archivos
import java.io.FileNotFoundException; // importar la excepción FileNotFoundException para manejar errores de archivo no encontrado
import java.util.Scanner; // importar la clase Scanner para leer el archivo de texto

public class Main {
    public static void main(String[] args) {
        // EJERCICIO 2
        String filename = "C:\\Users\\Usuario\\Desktop\\MATERIAL DOCENTE-Desarrollador Java Inicial\\Clase 5\\items.txt"; // nombre y ubicación del archivo a leer
        /* El archivo txt contiene estos datos:
        1    40    jabón en polvo
        3    10    esponjas
        2    100   chocolates
        */

        // crear un objeto File con el nombre del archivo
        File file = new File(filename);

        // crear un objeto Carrito vacío
        Carrito carrito = new Carrito();

        try {
            // crear un objeto Scanner para leer el archivo de texto
            Scanner scanner = new Scanner(file);

            // usar la tabulación como delimitador en lugar del espacio en blanco por defecto
            scanner.useDelimiter("\t");

            // iterar sobre cada línea del archivo
            while (scanner.hasNextLine()) {
                // leer la línea actual y separar los campos por la tabulación
                String line = scanner.nextLine();
                String[] fields = line.split("\t");

                // crear un objeto Item a partir de los campos separados
                int cantidad = Integer.parseInt(fields[0]);
                double precioUnitario = Double.parseDouble(fields[1]);
                String producto = fields[2];
                Item item = new Item(cantidad, precioUnitario, producto);

                // agregar el objeto Item al Carrito
                carrito.agregarItem(item);
            }

            // cerrar el objeto Scanner
            scanner.close();

            // mostrar el contenido del Carrito y el precio total
            System.out.println("Contenido del carrito:");
            carrito.mostrarContenido();
            System.out.println("Precio total: " + carrito.precio());

        } catch (FileNotFoundException e) {
            // manejar la excepción FileNotFoundException si el archivo no se encuentra
            System.out.println("Archivo no encontrado: " + filename);
        }
    }
}
