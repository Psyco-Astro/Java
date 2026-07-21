
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args){
        System.out.println("LinearSearchImplementation ,Enter 5 no for array:");
        Scanner sc = new Scanner(System.in);
        int[] find = new int[5];
        for( int i = 0 ; i < find.length ; i++){
            find[i] = sc.nextInt();
        }
        System.out.println(" Enter No to be found");
        int number = sc.nextInt();
        for (int j = 0 ; j < find.length ; j++){
            if (number == find[j]){
                System.out.println("No found at Index :" + j );
                break;
            }
        }
        sc.close();
    }
}
