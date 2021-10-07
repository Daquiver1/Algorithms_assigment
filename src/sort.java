public class sort {

    public static int[] selection_sort(int A[]){
        int n = A.length;

        for (int i = 0; i <= n - 2; i++){
            int min = i;

            for (int j = i+1; j <= n - 1; j++){
                if (A[j] < A[min]) min = j;
            }
            int h = A[i];
            A[i] = A[min];
            A[min] = h;
        }

        return A;
    }


    public static int[] insertionSort(int A[]){
        int n = A.length;

        for (int i = 1; i < n; i++){
            int v = A[i];
            int j = i - 1;

            while(j >= 0 && A[j] > v){
                A[j+1] = A[j];
                j = j - 1;
            }
            A[j+1] = v;
        }
        return A;
    }



    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = (start - 1);

        for (int j = start; j <= end - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;
        return (i + 1);
    }

    private static void quick(int[] arr, int start, int end) {
        if (start < end) {
            int part = partition(arr, start, end);
            quick(arr, start, part - 1);
            quick(arr, part + 1, end);
        }
    }

    // quickSort
    public static void quickSort(int[] arr) {
        int start = 0;
        int end = (arr.length - 1);
        quick(arr, start, end);
    }

    public static void shellSort(int[] arr) {
        int n = arr.length;

        for (int gap = n/2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int key = arr[i];
                int j = i;
                while (j >= gap && arr[j-gap] > key) {
                    arr[j] = arr[j-gap];
                    j -= gap;
                }
                arr[j] = key;

            }
        }
    }



}

