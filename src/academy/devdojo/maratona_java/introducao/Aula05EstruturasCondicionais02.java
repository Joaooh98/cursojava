package academy.devdojo.maratona_java.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && < 18 categoria juvenil
        // idade >= 18 categoria adulto
        int idade = 24;
        String Categoria;
        if (idade <15) {
            Categoria = "infantil";
        } else if (idade >=15 && idade < 18){
            Categoria = "juvenil";
        }else {
            Categoria = "Adulto";
        }
        // sintase (if) (else if) (else) ultilizando modelo de operador ternario
        // Categoria = idade < 15 ? "infantil" : idade >= 15 && idade < 18 ? "juvenil" : "Adulto"
        System.out.println(Categoria);
    }
}