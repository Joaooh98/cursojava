package academy.devdojo.maratona_java.introducao;
//continue ignora completamente a proxima validaco e continua executando o for
public class Aula06EstruturasDeRepeticoes05 {
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--){
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("parcela"+parcela+" R$ "+valorParcela);
        }
    }
}

//    double ValorTotal = 30000;
//        for (int parcela = 1; parcela <= ValorTotal; parcela++){
//            double valorParcela = ValorTotal/parcela;
//            if(valorParcela<1000){
//                    continue;
//        }
//        System.out.println("parcela "+ parcela+" R$ "+valorParcela);