package academy.devdojo.maratona_java.introducao;

public class Aula06EstruturasDeRepeticoes04 {
//    dado o valor de um carro, descubra em quantos ele pode ser parcelado
//    condicao valorParcela >= 1000
    public static void main(String[] args) {
        double ValorTotal = 30000;
        for (int parcela = 1; parcela <= ValorTotal; parcela++){
            double valorParcela = ValorTotal/parcela;
            if(valorParcela<1000){
                break;
            }
            System.out.println("parcela "+ parcela+" R$ "+valorParcela);
        }
    }
}
