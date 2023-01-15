package academy.devdojo.maratona_java.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int [] numero = new int[3];
        int [] numeros = {1,2,3,4,5};
       
        for (int i = 0; i < numero.length; i++) {
           System.out.println(numeros[i]);
       }
        for (int num: numeros) {
            System.out.println(num);
        }
    }
}
