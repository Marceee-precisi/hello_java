public class App {

    /**
     * Display elements of an array
     * @param arr the array to display
     */
    public static void printArray(int arr[]) {
        System.out.print("Array: ");
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();

    }

    /**
     * Swaps the two values in an array.
     * @param arr the array whose values to swap
     * @throws IllegalArgumentException if arr is null or its length is not 2
     */
    public static void swap_values(int[] arr) {
        if (arr == null || arr.length != 2) {
            throw new IllegalArgumentException("Array must have only 2 elements");
        }

        int first = arr[0];
        arr[0] = arr[1];
        arr[1] = first;
    }

    public static void main(String[] args) throws Exception {
        
        // initialize array of length 2
        int[] x = new int[]{1,2};

        // print the elements of the array
        printArray(x);

        // TO DO: write method to swap the values
        swap_values(x);

        // print the elements of the array
        printArray(x);

    }
}
