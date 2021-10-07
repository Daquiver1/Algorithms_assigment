//Edit the package name
package com.samuel;

public class Sort {

    public void selectionSort(int[] arr) {
        for (int i=0; i<arr.length-1; i++) {
            int index = i;
            for(int j = i + 1; j < arr.length; j++ ) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

    private int partition(int[] arr, int start, int end) {
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

    private void quick(int[] arr, int start, int end) {
        if (start < end) {
            int part = partition(arr, start, end);
            quick(arr, start, part - 1);
            quick(arr, part + 1, end);
        }
    }

    public void quickSort(int[] arr) {
        int start = 0;
        int end = (arr.length - 1);
        quick(arr, start, end);
    }


  public void insertionSort(int[] arr) {
        int n = arr.length;

        for (int j = 1; j < n; j++){
            int key = arr[j];
            int i = j-1;

            while ((i > -1) && (arr[i] > key)) {
                arr[j+1] = arr[i];
                i--;
            }
            arr[i+1] = key;
        }
  }

  public void shellSort(int[] arr) {
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
