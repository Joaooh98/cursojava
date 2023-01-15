package academy.devdojo.maratona_java.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main (String[] args) {
        // if so e executado se a condicao dele for true caso contrario vai executar o else ou o proximo bloco
        double Salary = 2500D;
        double BillsToPay = 6000;
        if(Salary >= BillsToPay){
            System.out.println("you will be able to settle your bills");
        } else ; {
            System.out.println("fucked up");
        }
    }
}
