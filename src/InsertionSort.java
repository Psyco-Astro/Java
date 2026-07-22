// divide the array into 2 halves ( sorted | unsorted ) eg. ( 2 8 10 | 7 9 ) & we want to pass 7 inside it.
// store the element you want to pass as key, then pass it inside by comparing with the sorted part right to left.
// step 1. compare with 10 --> if 7<10 then shift 10 to right  , the array becomes ( 2 8 10 10 9 )
// step 2 . compare with 8 --> same as step 1 as earlier ( 2 8 8 10 9 )
// compare with 2 , since 7 >  2 , stop. & pass the key in the last successful case ( 2 7 8 10 9 )
// this way insertion sort performs shifts , not repeated swaps

// store key = 7  --->
// Move every element greater than key one position right -->
// Insert key into the empty position

import java.util.Scanner;
public class InsertionSort {
    public static void main(String[] args){
        System.out.print("Insertion Sort : Enter 5 numbers");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for(int m = 0 ; m < arr.length ; m++){
            arr[m] = sc.nextInt();
        }
// Ascending
        for (int i = 1 ; i < arr.length ; i++){
            int key = arr[i]; // element to be inserted
            int j = i - 1; // last index of sorted portion
            while ( j >= 0 && arr[j] > key ) {
                arr[j + 1] = arr[j];
                j--;
            }
            // Insert key into its correct position
            arr[ j + 1 ] = key;
        }
        System.out.println("Ascending Sorted");
        for (int num : arr){
            System.out.print(num + " ");
        }

//Descending
        for (int i = 1 ; i < arr.length ; i++){
            int key = arr[i]; // element to be inserted
            int j = i - 1; // last index of sorted portion
            while ( j >= 0 && arr[j] < key ) {
                arr[j + 1] = arr[j];
                j--;
            }
            // Insert key into its correct position
            arr[ j + 1 ] = key;
        }
        System.out.println();
        System.out.println("Descending Sorted");
        for (int num : arr){
            System.out.print(num + " ");
        }
    }
}
