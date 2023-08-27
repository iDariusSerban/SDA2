package Ex2;

public class Ex2 {
    public static void main(String[] args) {
        int[] numbers = {4,2, 5, 3, 2, 7, 8, 5, 9,  4};
        int n = 4;
        int m = 2;
        System.out.println(checkIfPair(numbers, n, m));
    }
    //parcurg sirul si caut primul numar
    //daca il gasesc verifica numerele de langa el daca sunt egale cu al doilea numar

    public static boolean checkIfPair(int[] numbers, int n, int m) {
        if (numbers[0] == n) {
            if (numbers[1] == m) {
                return true;
            }
        }
        if (numbers[numbers.length-1] == n) {
            if (numbers[numbers.length-2] == m) {
                return true;
            }
        }

        for (int i = 1; i < numbers.length - 1; i++) {
            if (numbers[i] == n) {
                if (numbers[i + 1] == m || numbers[i - 1] == m) {
                    return true;
                }
            }

        }
        return false;
    }
}
