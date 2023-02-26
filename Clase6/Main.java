package EjArgProg.Clase6;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        // Ejercicio 1
        double resultado1 = calculadora.multiplicar(80, 3);
        System.out.println("El resultado de multiplicar 80 por 3 es: " + resultado1);

        // Ejercicio 2
        double resultado2 = calculadora.dividir(calculadora.sumar(150, 180), 3);
        System.out.println("El resultado de sumar 150 y 180, dividido por 3, es: " + resultado2);

        // Ejercicio 3
        double resultado3 = calculadora.multiplicar(calculadora.restar(90, 50), 15);
        System.out.println("El resultado de restar 90 y 50, multiplicado por 15, es: " + resultado3);

        // Ejercicio 4
        double resultado4 = calculadora.multiplicar(calculadora.sumar(70, 40), 25);
        System.out.println("El resultado de sumar 70 y 40, multiplicado por 25, es: " + resultado4);

        /*
        La consola tendria que mostrar:
        El resultado de multiplicar 80 por 3 es: 240.0
        El resultado de sumar 150 y 180, dividido por 3, es: 110.0
        El resultado de restar 90 y 50, multiplicado por 15, es: 600.0
        El resultado de sumar 70 y 40, multiplicado por 25, es: 2750.0
        */
    }
}
