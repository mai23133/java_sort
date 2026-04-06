public class InsertionSortExample {
    public static void main(String[] args) {
        int[] arr = {42, 89, 63, 12, 94, 27, 78, 3, 50, 36};

        System.out.println("ก่อนเรียง (Insertion Sort):");
        printArray(arr);

        insertionSort(arr);

        System.out.println("หลังเรียง:");
        printArray(arr);
    }

    static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println("\n");
    }
}