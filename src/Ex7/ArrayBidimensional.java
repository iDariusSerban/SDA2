package Ex7;

public class ArrayBidimensional {
    public static void main(String[] args) {

        int[][] matrice = {
                {10, 11, 12, 13, 14},
                {20, 21, 22, 23, 24},
                {30, 31, 32, 33, 34},
        };

//        for (int i = 0; i < matrice.length; i++) {
//            for (int j = 0; j < matrice[i].length-1; j++) {
//                int temp = matrice[i][j];
//                matrice[i][j] = matrice[i][j+1];
//                matrice[i][j+1] = temp;
//            }
//        }
        shiftMatrix(matrice, 0, 3);

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] shiftMatrix(int[][] matrice, int a, int b) {

        for (int i = 0; i < matrice.length; i++) {
            int temp = matrice[i][a];
            matrice[i][a] = matrice[i][b];
            matrice[i][b] = temp;
        }


        return matrice;
    }
}