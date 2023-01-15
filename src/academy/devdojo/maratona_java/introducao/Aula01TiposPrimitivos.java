package academy.devdojo.maratona_java.introducao;

public class Aula01TiposPrimitivos {
    public static void main(String[] args){
//        Tipos primitivos:sao palavras reservadas que sempre sera letra minuscula
//        exemplos:
        // int, double, float, char, byte, short, long, boolean//

        long numeroGrande = 100000;
        double salarioDouble = 2000.0D;
        float salariofloat = 2000.0F;
        byte idadeByte = 127;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
        String nome = "joao carlos de paiva "; /// nao e um tipo primitivo e sim uma classe

        // modelo de uso int
        int TempoParaEsturdarJava = 15;
        System.out.println("seu prazo para estudo de em Java e "+TempoParaEsturdarJava+" dias");
        System.out.println(numeroGrande);
        System.out.println(salarioDouble);
        System.out.println(salariofloat);
        System.out.println(idadeByte);
        System.out.println(idadeShort);
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println(caractere);
        System.out.println(nome);
    }
}
