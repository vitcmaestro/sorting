/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

import java.util.Scanner;

/**
 *
 * @author MS
 */
public class QuickSort {
    private static int partition(int[] arr, int low, int high) {
        int piv = arr[high];
        int j = low-1;
        int temp;
        for(int i=low;i<high;i++)
        {
            if(arr[i] <= piv)
            {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        temp = arr[high];
        arr[high] = arr[j+1];
        arr[j+1] = temp;
        return (j+1);
    }
      private static void sorter(int[] arr, int low, int high) {
          if(low<high){
        int pivot = partition(arr,low,high);
        sorter(arr,low,pivot-1);
        sorter(arr,pivot+1,high);
        for(int i = 0;i<arr.length;i++)
            System.out.println(arr[i]);
          }
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the size of the array to be sorted by quick sort");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++)
            arr[i] = scan.nextInt();
        sorter(arr,0,n-1);
    }

    

  
    
}
    
