package academy.devdojo.maratona_java.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        //while, do while, for//
        int cont = 0;
        while (cont < 10){
            System.out.println(++cont);
        }

        cont = 0;
        do{
            System.out.println("dentro do do-while"+ ++cont);
        }while (cont < 10);

        for(int i= 0; i<10; i++){
            System.out.println("for"+i);
        }
    }
}
