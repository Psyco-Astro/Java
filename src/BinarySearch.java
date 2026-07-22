import java.util.Arrays;
import  java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args){

        // Binary Search can ony be done on sorted arrays.
        // Find the middle element check middle element , left & right n then move to the relevant half.
        // lets say if low & high integer values are v large, it can result in memory overflow as integer cannot store
        // their addition

        // Use formula : low + (high - low ) / 2;
        System.out.println("Binary Search Implementation: Enter 5 random no");
        Scanner sc = new Scanner(System.in);

        int Binaryarr[] = new int[10];
        for (int i = 0 ; i < Binaryarr.length ; i++){
            Binaryarr[i] = sc.nextInt();
        }
        Arrays.sort(Binaryarr);
        for ( int num : Binaryarr){
            System.out.print(num + " ");
        }

        System.out.print("\n ENTER THE NUMBER TO SEARCH");
        int target = sc.nextInt();

        int low = 0;
        int  high = Binaryarr.length - 1;
        int answer = -1;

        while ( low <= high ){
            int mid = low + (high - low)/2;

            if (Binaryarr[mid] == target){
                System.out.println("Element found at Index" + mid);
                // I am modifying this code to find the first occurance of 2 if their are multiple 2 in sorted the array
                //return;
                answer = mid;
                high = mid - 1;

                // for last occurance
                // answer = mid;
                // low =  mid + 1;
            } else if (Binaryarr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (answer != -1){
           System.out.println("First Occurance " + answer);
        }
        else{
            System.out.println("Element not found");
        }

        // count occurances :   last occurance - first occurance + 1

        sc.close();





    }
}
