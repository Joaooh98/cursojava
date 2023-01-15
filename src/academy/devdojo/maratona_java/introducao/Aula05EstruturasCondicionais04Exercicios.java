package academy.devdojo.maratona_java.introducao;

public class Aula05EstruturasCondicionais04Exercicios {
    public static void main (String[] args){
        double salaryAnual = 30000D;
        double Primeirafaixa = 9.70/100D;
        double SegundaFaixa = 37.35/100D;
        double terceiraFaixa = 49.50/100D;
        double valoImposto;
        if (salaryAnual <= 34712){
            valoImposto = salaryAnual * Primeirafaixa;
        } else if (salaryAnual <=34712 && salaryAnual <= 38507) {
            valoImposto = salaryAnual * SegundaFaixa;
        }else{
            valoImposto = salaryAnual * terceiraFaixa;
        }
        System.out.println("valor de imposto a ser pago esse em ano: R$"+valoImposto);
    }
}
