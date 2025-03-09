public class ArrayExample {
    public static int SubArray(int num[]) {
        int total = 0;

        for (int i = 0; i < num.length; i++) {  // Start of subarray
            for (int j = i; j < num.length; j++) {  // End of subarray
                
                for (int k = i; k <= j; k++) {  // Print elements from i to j
                    System.out.print(num[k] + " ");
                }
                total++;  // Count subarray
                System.out.println(); // Move to next line
            }
        }

        System.out.println("Total subarrays: " + total);
        return total;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Largest number: " + getLarge(numbers));
        System.out.println("Smallest number: " + getSmaller(numbers));

        int num[] = {2, 4, 6, 8, 10};
        SubArray(num);
    }

    // Find the largest number in the array
    public static int getLarge(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    // Find the smallest number in the array
    public static int getSmaller(int numbers[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }
}
