package academy.devdojo.maratona_java.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salary = 6000;
        String mensagemDoar = "Eu vou doar 500,00 pro Devdojo";
        String mensagemnaoDoar = "No momento nao tenho condicoes";

//        modelo de operador ternario
//        (condicao) ? verdadeiro:Falso

           String resultado = salary > 5000 ? mensagemDoar : mensagemnaoDoar;

//        if (salary > 5000){
//            resultado = mensagemDoar;
//        }else{
//            resultado = mensagemnaoDoar;
//          }
        System.out.println(resultado);
    }
}
