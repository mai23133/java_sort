public class SelectionSortExample {
    public static void main(String[] args) {
        int[] arr = {42, 89, 63, 12, 94, 27, 78, 3, 50, 36};
        
        System.out.println("ก่อนเรียง (Selection Sort):");
        printArray(arr);

        selectionSort(arr);

        System.out.println("หลังเรียง:");
        printArray(arr);
    }

    static void selectionSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println("\n");
    }
}