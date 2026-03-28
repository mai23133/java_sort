public class CountingSortExample {
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};

        System.out.println("ก่อนเรียง (Counting Sort):");
        printArray(arr);

        countingSort(arr);

        System.out.println("หลังเรียง:");
        printArray(arr);
    }

    static void countingSort(int[] arr) {
        int n = arr.length;
        
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int[] count = new int[max + 1];

        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (count[i] > 0) {
                arr[index] = i;
                index++;
                count[i]--;
            }
        }
    }

    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println("\n");
    }
}