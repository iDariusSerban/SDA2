package Ex5;

public class Ex5 {

    public static void main(String[] args) {
        int[] numbers = {4, 2, 5, 3, 4, 2, 7, 8, 5, 9, 4};
        int n = 4;
        int k = 3;

        System.out.println(findNumberOfAppearances(numbers, n));
        System.out.println(findIndexForNumberOfAppearances(numbers, n,k));
    }

    public static int findNumberOfAppearances(int[] numbers, int n) {
        int numberOfAppearances = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (n == numbers[i]) {
                numberOfAppearances++;
            }

        }
        return numberOfAppearances;
    }
    public static int findIndexForNumberOfAppearances(int[] numbers, int n, int k) {
        int numberOfAppearances = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (n == numbers[i]) {
                numberOfAppearances++;
            }
            if (numberOfAppearances ==k){
                return i;
            }

        }
        return -1;
    }
}
