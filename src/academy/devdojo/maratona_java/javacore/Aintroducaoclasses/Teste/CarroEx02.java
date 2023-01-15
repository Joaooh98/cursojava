package academy.devdojo.maratona_java.javacore.Aintroducaoclasses.Teste;

import academy.devdojo.maratona_java.javacore.Aintroducaoclasses.Dominio.BancoDados.Carro;

public class CarroEx02 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.Nome = "320i";
        carro1.Modelo = "BMW";
        carro1.Ano = 2022;
        carro1.TabelaFipe = 150f;

        Carro carro2 = new Carro();

        carro2.Nome = "Golf GTI";
        carro2.Modelo = "Volksvagem";
        carro2.Ano = 2022;
        carro2.TabelaFipe = 110f;

        System.out.println("\ncarro1-\n");
        System.out.println("NOME: "+carro1.Nome+" \nMODELO: "+carro1.Modelo+"\nANO: "+carro1.Ano+"\nTABELA FIPE: R$ "+carro1.TabelaFipe+" Mil");
        System.out.println("---------------------------------");
        System.out.println("\ncarro2-\n");
        System.out.println("NOME: "+carro2.Nome+" \nMODELO: "+carro2.Modelo+"\nANO: "+carro2.Ano+"\nTABELA FIPE: R$ "+carro2.TabelaFipe+" Mil");

        carro1 = carro2;

        System.out.println("\n-----realizado esse comando --> carro = carro1; -------------------\n");
        System.out.println("\ncarro1-\n");
        System.out.println("NOME: "+carro1.Nome+" \nMODELO: "+carro1.Modelo+"\nANO: "+carro1.Ano+"\nTABELA FIPE: R$ "+carro1.TabelaFipe+" Mil");
        System.out.println("---------------------------------");
        System.out.println("\ncarro2-\n");
        System.out.println("NOME: "+carro2.Nome+" \nMODELO: "+carro2.Modelo+"\nANO: "+carro2.Ano+"\nTABELA FIPE: R$ "+carro2.TabelaFipe+" Mil");

    }
}
