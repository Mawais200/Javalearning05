public class bubble {
    // Bubble Sort method
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
        System.out.print(arr[i] + " "); // Proper spacing
    }
    System.out.println();
}

// Main method to test Bubble Sort
public static void main(String[] args) {
    int arr[] = {5, 1, 4, 2, 3};
    
    System.out.print("Original array: ");
    display(arr);
    
    bubbleSort(arr);
    
    System.out.print("Sorted array: ");
    display(arr);
}

}
