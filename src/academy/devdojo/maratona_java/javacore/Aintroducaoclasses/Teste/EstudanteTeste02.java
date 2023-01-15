package academy.devdojo.maratona_java.javacore.Aintroducaoclasses.Teste;

import academy.devdojo.maratona_java.javacore.Aintroducaoclasses.Dominio.BancoDados.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante1 = new Estudante();

        estudante.nome = "joao carlos de paiva ";
        estudante.idade = 24;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println("----------------");
        System.out.println(estudante1.nome);
        System.out.println(estudante1.idade);
        System.out.println(estudante1.sexo);

    }
}
