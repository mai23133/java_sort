import java.util.ArrayList;
import java.util.Collections;

public class BucketSortExample {
    public static void main(String[] args) {
        float[] arr = {0.897f, 0.565f, 0.656f, 0.1234f, 0.665f, 0.3434f};

        System.out.println("ก่อนเรียง (Bucket Sort):");
        printArray(arr);

        bucketSort(arr, arr.length);

        System.out.println("หลังเรียง (จากน้อยไปมาก):");
        printArray(arr);
    }

    static void bucketSort(float[] arr, int n) {
        if (n <= 0) return;

        ArrayList<Float>[] buckets = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<Float>();
        }

        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) (arr[i] * n);
            buckets[bucketIndex].add(arr[i]);
        }

        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }

        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                arr[index++] = buckets[i].get(j);
            }
        }
    }

    static void printArray(float[] arr) {
        for (float value : arr) {
            System.out.print(value + "  ");
        }
        System.out.println("\n");
    }
}