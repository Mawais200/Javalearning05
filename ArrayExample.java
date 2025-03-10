public class ArrayExample {

    // Method to print all subarrays and count them
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

    // Bubble sort method
    public static void bubbleSort(int arr[]) {
        for (int t = 0; t < arr.length - 1; t++) {
            for (int j = 0; j < arr.length - 1 - t; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Method to display array elements
    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // Fixed spacing
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Largest number: " + getLarge(numbers));
        System.out.println("Smallest number: " + getSmaller(numbers));

        int num[] = {2, 4, 6, 8, 10};
        SubArray(num);

        int arr[] = {5, 1, 4, 2, 3};
        bubbleSort(arr);
        System.out.print("Sorted array: ");
        display(arr);
    }
}
