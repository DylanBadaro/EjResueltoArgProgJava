package EjArgProg.Clase3;

public class Main {
    public static void main(String[] args){
        //Ejercicio 1a
        /*String frase = "Texto de ejemplo, espero sirva";
        char letra = 'e';
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                contador++;
            }
        }
        System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la frase.");*/




        //Ejercicio 1b
        /*Scanner s = new Scanner(System.in);
        int[] numeros = new int[3];
        String orden;

        // Pedir al usuario los números
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese el número " + (i+1) + ": ");
            numeros[i] = s.nextInt();
        }

        // Pedir al usuario el orden
        System.out.print("¿En qué orden desea ordenar los números (ascendente o descendente)? ");
        orden = s.next();

        // Ordenar los números
        if (orden.equalsIgnoreCase("ascendente")) {
            for (int i = 0; i < numeros.length; i++) {
                for (int j = i + 1; j < numeros.length; j++) {
                    if (numeros[j] < numeros[i]) {
                        int temp = numeros[i];
                        numeros[i] = numeros[j];
                        numeros[j] = temp;
                    }
                }
            }
        } else if (orden.equalsIgnoreCase("descendente")) {
            for (int i = 0; i < numeros.length; i++) {
                for (int j = i + 1; j < numeros.length; j++) {
                    if (numeros[j] > numeros[i]) {
                        int temp = numeros[i];
                        numeros[i] = numeros[j];
                        numeros[j] = temp;
                    }
                }
            }
        } else {
            System.out.println("Orden no reconocido.");
            System.exit(0);
        }

        // Imprimir el vector ordenado
        System.out.print("Los números ordenados " + orden + " son: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }*/

        /*El método equalsIgnoreCase() es un método de la clase String en Java que se utiliza para comparar
        dos cadenas de texto, ignorando las diferencias en mayúsculas y minúsculas entre ellas.
        Este método devuelve un valor booleano que indica si las dos cadenas son iguales o no,
        independientemente de si las letras están en mayúsculas o minúsculas.*/




        //Ejercicio 1c
        /*Scanner s = new Scanner(System.in);
        int[] numeros = {10, 20, 30, 40, 50}; // Vector de números
        int x;
        int suma = 0;

        // Pedir al usuario el número X
        System.out.print("Ingrese un número X: ");
        x = s.nextInt();

        // Sumar los números mayores que X
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > x) {
                suma += numeros[i];
            }
        }

        // Imprimir el resultado
        System.out.println("La suma de los números mayores que " + x + " es: " + suma);*/




        //Ejercicio 2 - este ejercicio ya utiliza una clase
        /*PuntoDos puntoDos = new PuntoDos();
        String codificado = puntoDos.codificar("hola", 3);
        System.out.println(codificado);
        String decodificado = puntoDos.decodificar(codificado, 3);
        System.out.println(decodificado);*/




        // EJERCICIOS RESUELTOS CON CLASES

        //                  ejercicio 1a
        /*A_LetterCounter counter = new A_LetterCounter();
        int letterCount = counter.countLetter("This is a sample text, I hope it helps", 'e');
        System.out.println("The letter 'e' appears " + letterCount + " times");*/




        //                  ejercicio 1b
        /*B_OrderOfNumbers orderOfNumbers = new B_OrderOfNumbers();

        //Orden ascendente
        int[] ascending = orderOfNumbers.ascending(10, 47, 3);
        System.out.println("Ascending order: " + Arrays.toString(ascending));

        //Orden decreciente
        int[] descending = orderOfNumbers.decreasing(100, 45, 359);
        System.out.println("Decreasing order: " + Arrays.toString(descending));*/




        //                  ejercicio 1c

        /*C_SumOfX c = new C_SumOfX();

        int[] nums = {1, 2, 3, 4, 5};
        int result = c.addAllGreaterThanX(nums, 3);
        System.out.println(result);  // Output: 9*/




        //              Ejercicio 2

        /*PuntoDos puntoDos = new PuntoDos();
        String codificado = puntoDos.codificar("hola", 3);
        System.out.println(codificado);
        String decodificado = puntoDos.decodificar(codificado, 3);
        System.out.println(decodificado);*/
    }
}
