package Ex8;

//        Input : 7
//        Output :
//
//        *******
//        **   **
//        * * * *
//        *  *  *
//        * * * *
//        **   **
//        *******
public class Ex8 {
    public static void main(String[] args) {
        printPattern(7);
        printPattern(9);
    }

    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==j || i + j == n-1 || i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
