import java.util.Arrays;
public class QuickSort {
    public static int partition(int[] a, int low, int high) {
        int pivot = a[high];
        int i = low - 1;
            for (int j = low; j < high; j++) {
                if (a[j] < pivot) {
                    i++;
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        int temp = a[i + 1];
        a[i + 1] = a[high];
        a[high] = temp;
        return i + 1;
    }
    public static void quick(int[] a, int low, int high) {
        if (low < high) {
            int pivot = partition(a, low, high);
            quick(a, low, pivot - 1);
            quick(a, pivot + 1, high);
        }
    }
    public static void main(String[] args) {
        int[] a = {11,9,26,13,87,69 };
        System.out.println("Before sorting:"+ Arrays.toString(a));
        quick(a, 0, a.length - 1);
        System.out.println("After sorting:"+ Arrays.toString(a));
    }
}
