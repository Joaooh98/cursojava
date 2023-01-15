package academy.devdojo.maratona_java.introducao;

public class Aula04operadores {
    public static void main(String [] args){
        int numero1 = 10;
        int numero2 = 20;
        System.out.println(numero2-numero1);///diminui
        System.out.println(numero2+numero1);/// soma
        System.out.println("concatena quando tem uma String entre ( ) resultado = "+numero2+numero1); // sinal + passa a ser concatenacao
        System.out.println("o resultado e ="+(numero2+numero1));
        System.out.println("o resultado e ="+(numero2-numero1));
        double numero3 = 20;
        double numero4 = 10;
        double resultado = numero3/numero4;
        System.out.println(numero3/numero4);
        System.out.println(resultado);
        /// OBS:o resultado de operacoes de 2 valores inteiros sempre vai ser um valo inteiro///
        // % OPERADOR DE RESTO DA DIVISAO
        int resto = 21 % 7;
        System.out.println( "Rsultado do resto da divisao e = "+resto);

//        -----------------------------------------------------// operadoress //------------------------------------------------------------------------------

        // OBS: Operadores sempre vao retornar um valor boleano.
        // nao e possivel comparar String com valor numerico
        // < > <= >= == != //
        boolean isMaiorQue = numero1 > numero2;
        System.out.println("10 e maior que 20 "+isMaiorQue);
        boolean isMenorQue = numero1 < numero2;
        System.out.println("10 e menor que 20 "+isMenorQue);
        boolean isMenorOuIgual = numero1 <= numero2;
        System.out.println("10 e menor ou igual a 20 "+isMenorOuIgual);
        boolean isMaiorOuIgual = numero1 >= numero2;
        System.out.println("10 maior ou  igual 20 "+isMaiorOuIgual);
        boolean isIgualigual = numero1 == numero2;
        System.out.println("10 e igual 20 "+isIgualigual); // == atribui o valor
        boolean IgualouDiferent = numero1 != numero2;
        System.out.println("10 e igual ou diferente 20"+IgualouDiferent);

        //--------------------------------------------------------//Operadores-logicos//----TABELA-VERDADE------------------------------------------------------
        //          (&& (AND))           -
        // A       B       S             -
        // FALSE FALSE = FALSE           -
        // FALSE TRUE  = FALSE           -
        // TRUE  FALSE = FALSE           -
        // TRUE  TRUE  = TRUE            -
        //--------------------------------

        //          (|| (OR))            -
        // A       B       S             -
        // FALSE FALSE = FALSE           -
        // FALSE TRUE  = TRUE            -
        // TRUE  FALSE = TRUE            -
        // TRUE  TRUE  = TRUE            -
        //--------------------------------

        //          (! (NOT))            -
        // A       B       S             -
        // FALSE = TRUE                  -
        // TRUE  = FALSE                 -
        //--------------------------------

        // && // --------- INTRODUCAO

        int idade = 35;
        float salario = 3500;
        boolean isDentrodaLeiMaiorqueTrinta = idade > 34 && salario >= 3400;
        boolean isDentrodaLeiMenorqueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentrodaLeiMaiorqueTrinta ="+isDentrodaLeiMaiorqueTrinta);
        System.out.println("isDentrodaLeiMenorqueTrinta ="+isDentrodaLeiMenorqueTrinta);

        // OR // --------- INTRODUCAO

        double ValorTotalContaCorrente = 200;
        double ValorTotalPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlayCompraFeita = ValorTotalContaCorrente > valorPlaystation || ValorTotalPoupanca > valorPlaystation;

        System.out.println(isPlayCompraFeita+" vc pode comprar o play ");

            //        OPERADORES DE ATRIBUICAO          //

        double bonus = 1800;
        bonus += 1000;
        System.out.println(" operador bonus += 1000 = "+bonus);
        bonus -= 1000;
        System.out.println(" operador bonus -= 1000 = "+bonus);
        bonus *= 2;
        System.out.println(" operador bonus *= 2 = "+bonus);
        bonus /= 2;
        System.out.println(" operador bonus /= 2 = "+bonus);
        bonus %= 2;
        System.out.println(" operador bonus %= 2 = "+bonus);

        int contador = 0;
        contador += 1;
        System.out.println(contador);
        contador ++;
        System.out.println(contador);
        contador--;
        System.out.println(contador);
        --contador;
        System.out.println(contador);
        ++contador;
        System.out.println(contador);

        // OBS: Quando e inserido o encrementador antes ele primeiro da o valor depois imprime a variavel, quando e colocado o encrementador dps primeiro ele mostra o valor dps encrementa


    }
}
