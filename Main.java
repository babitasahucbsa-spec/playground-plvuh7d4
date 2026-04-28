public class Main {
    public static int findMissingNumber(int[] numbers, int maxExpected) {
        boolean[] seen = new boolean[maxExpected + 1];

        for (int n : numbers) {
            if (n >= 1 && n <= maxExpected) {
                seen[n] = true;
            }
        }

        for (int i = 1; i <= maxExpected; i++) {
            if (!seen[i]) {
                return i;
            }
        }

        return -1; // nothing missing
    }

    public static void main(String[] args) {
        // Array of 10 elements where numbers should be from 1..10.
        // Here, 9 is missing and 10 appears twice.
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 10, 10};

        int missing = findMissingNumber(numbers, 10);

        if (missing == -1) {
            System.out.println("No missing number found.");
        } else {
            System.out.println("Missing number is: " + missing);
        }
    }
}
