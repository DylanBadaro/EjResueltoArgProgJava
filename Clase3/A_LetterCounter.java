package EjArgProg.Clase3;

public class A_LetterCounter {
    public int countLetter(String str, char letter) {
        int counter = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == letter) {
                counter++;
            }
        }
        return counter;
    }
}
