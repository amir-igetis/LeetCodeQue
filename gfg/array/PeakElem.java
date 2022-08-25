package gfg.array;

import java.util.Scanner;

public class PeakElem {
    public static void main(String[] args) {
        // https://practice.geeksforgeeks.org/problems/peak-element/1
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(peakElement(arr, n));
    }

    static int peakElement(int[] arr, int n){
        // same as leetcode peak elem solution
        int start = 0;
        int end = n - 1;
        while (start<end) {
            int mid = start+(end-start)/2;
            if (arr[mid]>arr[mid+1]) {
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
}
