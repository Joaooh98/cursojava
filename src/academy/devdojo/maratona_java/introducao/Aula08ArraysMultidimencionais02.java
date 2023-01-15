package academy.devdojo.maratona_java.introducao;

public class Aula08ArraysMultidimencionais02 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int[][] arrayInt = new int[7][];
        arrayInt[0] = new int[3];
        arrayInt[1] = new int[2];
        arrayInt[2] = new int[5];

        arrayInt[3] = new int[]{0, 0, 0, 0};
        arrayInt[4] = new int[]{0, 0};
        arrayInt[5] = new int[]{0, 0, 0, 0, 0};

        arrayInt[6] = array;

        int[][] arrayInt2 = {{0, 0}, {0, 1, 2, 3}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}};

        for (int[] arrayBase : arrayInt) {
            System.out.println("\n---------");
            for (int num : arrayBase) {
                System.out.print(num + "  ");
            }
        }
        for (int[] arrayBase : arrayInt2) {
            System.out.println("\n---------");
            for (int num : arrayBase) {
                System.out.print(num + "  ");
            }
        }
    }
}