public class Insertion {
    public static void Insert(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];  // ✅ Store the value to be inserted
            int prev = i - 1;   // ✅ Start comparing from the previous element

            // Shift elements that are greater than 'curr' to the right
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];  // ✅ Shift larger elements one position to the right
                prev--;  // ✅ Move to the previous index
            }

            // Insert the current element in its correct position
            arr[prev + 1] = curr;

           
        }
    }

    // Method to display array elements
    public static void display(int arr[]) {
        for (int num : arr) {//for each loop
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {64, 22, 34, 56, 32};

        System.out.print("Original array: ");
        display(arr);

        Insert(arr);  // Sorting the array

        System.out.print("Sorted array: ");
        display(arr);
    }
}
