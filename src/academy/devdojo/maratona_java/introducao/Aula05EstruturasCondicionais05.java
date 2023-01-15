package academy.devdojo.maratona_java.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        // imprima o dia da semana, considerando 1 como domingo
        byte dia = 10;
       switch (dia){
           case 1:
               System.out.println("domingo");
               break;
           case 2:
               System.out.println("segunda");
               break;
           case 3:
               System.out.println("terca");
               break;
           case 4:
               System.out.println("quarta");
               break;
           case 5:
               System.out.println("quinta");
               break;
           case 6:
               System.out.println("sexta");
               break;
           case 7:
               System.out.println("sabado");
           default:
               System.out.println("Opcao invalida, favor inserir um numero entre 1 a 7");
               break;

        }
    }
}
