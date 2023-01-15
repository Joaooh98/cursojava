package academy.devdojo.maratona_java.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        byte dia = 1;
        switch (dia){
            case 1:
            case 7:
                System.out.println("final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("dia da semana");
                break;
            default:
                System.out.println("Opcao invalida, favor inserir um numero entre 1 a 7");
        }
    }
}
