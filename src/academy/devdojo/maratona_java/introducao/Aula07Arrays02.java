package academy.devdojo.maratona_java.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
//        padrao de inicializacao
//        byte , float, int, long, double, short = 0
//        char '\u0000' ' '
//        boolean false
//        string null
//        int [] idade = new int[3];
//        System.out.println(idade[0]);
//        System.out.println(idade[1]);
//        System.out.println(idade[2]);
//        System.out.println(idade[3]);
//----------------------------------------------------------------------------------------
//    String[] nomes = new String[4];
//    nomes[0] = "goku";
//    nomes[1] = "joao";
//    nomes[2] = "mayety";
//    nomes[3] = "kurosaki";
//        for (int i = 0; i < 4; i++) {
//            System.out.println(nomes[i]);
//        }
//----------------------------------------------------------------------------------------
//        nomes.length = retorna o tamanho do array (length-traducao-(comprimento))
        String[] nomes = new String[5];
        nomes[0] = "goku";
        nomes[1] = "joao";
        nomes[2] = "mayety";
        nomes[3] = "kurosaki";
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
