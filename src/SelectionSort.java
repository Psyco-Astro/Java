//Selection sort identifies the smallest element with each iteration & swaps ony once per iteration
// time complexity O(n^2)
import java.util.Scanner;
public class SelectionSort {
    public static void main(String[] args){
        System.out.print("Selection Sort");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        for (int j = 0 ; j < arr.length - 1 ; j++){
            int  minIndex = j;
            for ( int k = j + 1; k < arr.length ; k++ ) {
                if ( arr[k] < arr[minIndex] ) {
                    minIndex = k;
                }
            }
            int temp =  arr[j];
            arr[j] = arr[minIndex];
            arr[minIndex] = temp;
        }

        for (int num : arr ) {
            System.out.print( num + " ");
        }
    }
}
