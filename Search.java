//Edit the package name
package com.samuel;

public class Search {

    public int linearSearch(int[] arr, int key) {
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(int[] arr, int key) {
        int len = arr.length;
        int first = 0;
        int last = len -1;
        int index = 0;
        int middle = (first + last)/2;
        while(first <= last) {
            if (arr[middle] < key) {
                first = middle + 1;
            }
            else if ( arr[middle] == key) {
                index = middle;
                break;
            }
            else{
                last = middle - 1;
            }
            middle = (first + last)/2;
        }
        if (first > last) {
            index = -1;
        }
        return index;
    }

}
