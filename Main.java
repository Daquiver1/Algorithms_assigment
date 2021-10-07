//Edit the package name
package com.samuel;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a1 = {10, 20, 4, 30, 50, 70};
	    Sort srt = new Sort();
        srt.shellSort(a1);
        System.out.println(Arrays.toString(a1));
    }
}
