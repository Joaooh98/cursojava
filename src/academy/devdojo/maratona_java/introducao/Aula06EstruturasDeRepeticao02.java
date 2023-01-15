package academy.devdojo.maratona_java.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        //imprima todos os numeros pares de 0 ate 1000000
        for (int i = 1; i < 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        int cont = 1;
        while (cont < 1000000){
            ++cont;
            if (cont % 2 == 0){
                System.out.println(cont);
            }
        }
    }
}
