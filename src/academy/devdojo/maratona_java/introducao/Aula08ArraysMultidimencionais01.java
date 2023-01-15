package academy.devdojo.maratona_java.introducao;

public class Aula08ArraysMultidimencionais01 {
    public static void  main (String [] args){
//        arrays Multidimencionais sao arrays de arrays
// o primeniro[] define a quantidade da arrays Multidimencionais sera criado
        int [][] dias  = new int[3][3];
       dias [0][0] = 31;
       dias [0][1] = 30;
       dias [0][2] = 29;


        dias [1][0] = 0;
        dias [1][1] = 1;
        dias [1][2] = 2;


        dias [2][0] = 00;
        dias [2][1] = 01;
        dias [2][2] = 02;


        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("------------------------------------------");

        for (int[]arrBase:dias) {
            for (int num:arrBase){
                System.out.println(num);
            }
        }
    }
}
