package EjArgProg.Clase3;

public class PuntoDos {
    public char[] abecedario = {'a', 'b', 'c', 'd', 'e', 'f', 'g',
            'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q',
            'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public String codificar(String palabra, int desplazamiento) {
        String salida = "";
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            int indice = buscarIndice(letra);
            indice += desplazamiento;
            if (indice > abecedario.length - 1) {
                indice -= abecedario.length;
            }
            salida += abecedario[indice];
        }
        return salida;
    }

    public String decodificar(String palabra, int desplazamiento) {
        String salida = "";
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            int indice = buscarIndice(letra);
            indice -= desplazamiento;
            if (indice < 0) {
                indice += abecedario.length;
            }
            salida += abecedario[indice];
        }
        return salida;
    }

    public int buscarIndice(char letra) {
        for (int i = 0; i < abecedario.length; i++) {
            if (abecedario[i] == letra) {
                return i;
            }
        }
        return -1;
    }
    /*Este método devuelve -1 porque se usa para buscar el índice de una letra
    en particular en la matriz abecedario. Si la letra no se encuentra en la
    matriz, el método devuelve -1. Esto se hace para indicar que la letra
    no se encontró en la matriz.*/
}
