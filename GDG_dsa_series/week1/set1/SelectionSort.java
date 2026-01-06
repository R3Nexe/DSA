public class SelectionSort {
                public static void selectionSort(int arr[]) {
                                for (int i = 0; i < arr.length; i++) {
                                                int minidx = i;
                                                for (int j = i + 1; j < arr.length; j++) {
                                                                if (arr[j] < arr[minidx]) {
                                                                                minidx = j;
                                                                }
                                                }
                                                int temp = arr[minidx];
                                                arr[minidx] = arr[i];
                                                arr[i] = temp;
                                }
                }
}
