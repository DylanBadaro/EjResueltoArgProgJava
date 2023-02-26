package EjArgProg.Clase4;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        //     EJERCICIO 1
        /*int[] numeros = {3, 6, 54};
        int eleccion;
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese 1:Ascendente o 2:Decreceinte");
        eleccion = s.nextInt();
        // Ordenar el arreglo sin usar el método sort
        int temp;
        if (eleccion == 1){
            for(int i=0; i < numeros.length; i++){
                for(int j=i+1; j < numeros.length; j++){
                    if(numeros[i] > numeros[j]){
                        temp = numeros[i];
                        numeros[i] = numeros[j];
                        numeros[j] = temp;
                    }
                }
            }

            // Imprimir los números en forma ascendente
            System.out.println("Números en forma ascendente:");
            for (int numero : numeros) {
                System.out.println(numero);
            }}else if(eleccion == 2){

            for(int i=numeros.length-1; i >= 0; i--){
                for(int j=i-1; j >= 0; j--){
                    if(numeros[i] > numeros[j]){
                        temp = numeros[i];
                        numeros[i] = numeros[j];
                        numeros[j] = temp;
                    }
                }
            }

            // Imprimir los números en forma decreciente
            System.out.println("Números en forma decreciente:");
            for (int numero : numeros) {
                System.out.println(numero);
            }}*/


        //   EJERCICIO 2
        String rutaArchivo = "C:\\Users\\Usuario\\Desktop\\MATERIAL DOCENTE - Desarrollador Java Inicial\\Clase 4\\numeros.txt"; // Ruta del archivo
        /*la ruta ingresada contiene un txt con numeros guardados asi:
        1
        2
        3
        4
        5
        6
        7
        8
        9
        se guarda con un salto de linea entre numero y numero para que pueda leerlo correctamente*/

        int suma = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                int numero = Integer.parseInt(linea.trim());
                suma += numero;
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
            return;
        } catch (NumberFormatException e) {
            System.out.println("El archivo debe contener números enteros: " + e.getMessage());
            return;
        }

        System.out.println("La suma de los números del archivo es: " + suma);

    }
}
