// heaviest element is a bubble in water, so it rises to the top.
// we swap adjacent elements & take the largest element to the last of array , so on to the next....
// time complexity : o(n^2)
import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args){
        System.out.println("Bubble Sort: enter 5 numbers to be sorted");
        Scanner sc = new Scanner(System.in);
        int[] bubblesort = new int[5];
        for (int k = 0 ; k < bubblesort.length ; k++){
            bubblesort[k] = sc.nextInt();
        }

        for (int i = 0 ; i < bubblesort.length - 1 ; i++){
            boolean swapped = false;
            for ( int j = 0 ; j < bubblesort.length - 1 - i ; j++) {
                if (bubblesort[j] > bubblesort[j + 1]) {
                    int temp = bubblesort[j];
                    bubblesort[j] = bubblesort[j + 1];
                    bubblesort[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break; }
        }


        for (int num : bubblesort ) {
            System.out.print( num + " ");
        }

    }
}
