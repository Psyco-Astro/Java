import java.util.Arrays;
import  java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args){

        // Binary Search can ony be done on sorted arrays.
        // Find the middle element check middle element , left & right n then move to the relevant half.
        // lets say if low & high integer values are v large, it can result in memory overflow as integer cannot store
        // their addition

        // Use formula : low + (high - low ) / 2;
        System.out.println("Binary Search Implementation: Enter 10 random no");
        Scanner sc = new Scanner(System.in);

        int Binaryarr[] = new int[10];
        for (int i = 0 ; i < Binaryarr.length ; i++){
            Binaryarr[i] = sc.nextInt();
        }
        Arrays.sort(Binaryarr);




    }
}
