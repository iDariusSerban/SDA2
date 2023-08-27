package Ex3;

public class NumarulDeTriplete {
    public static void main(String[] args) {
        int[] numbers ={4,9,7,6,5,3,4,5,2,6,7,8};
        System.out.println(checkNumberOfTriplets(numbers));
    }

    public static int checkNumberOfTriplets(int[] numbers) {
        int tripletCounter = 0;
        for (int i = 0; i < numbers.length - 2; i++) {
            if (numbers[i] - numbers[i + 1] == -1 && numbers[i + 1] - numbers[i + 2] == -1) {
                tripletCounter++;
            }
        }
        return tripletCounter;
    }
}
