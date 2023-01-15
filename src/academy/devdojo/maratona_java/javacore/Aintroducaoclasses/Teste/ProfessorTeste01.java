package academy.devdojo.maratona_java.javacore.Aintroducaoclasses.Teste;

import academy.devdojo.maratona_java.javacore.Aintroducaoclasses.Dominio.BancoDados.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {

        Professor professor = new Professor();
        professor.nome = "Coach Carter";
        professor.idade = 45;
        professor.sexo = 'M';
        professor.materia = "Basquete";

        System.out.println(" Nome: " + professor.nome +"\n idade: "+ professor.idade+ "\n Sexo: "+professor.sexo+"\n Materia: "+ professor.materia);
    }
}
