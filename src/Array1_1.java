
import java.util.Scanner;
// Maximum . Minimum & Average
public class Array1_1 {
    public static  void main(String[] args){
        int[] maximum_find = new int[5];
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter Input Numbers:");
        for (int i = 0 ; i < maximum_find.length ; i++){
            maximum_find[i] = sc.nextInt(); // for input
        }

        int max = maximum_find[0];
        int min = maximum_find[0];

        for ( int j = 0 ; j < maximum_find.length ; j++ ){
            sum += maximum_find[j];
            if(maximum_find[j] > max){
                max = maximum_find[j];
            }
            if(maximum_find[j] < min){
                min = maximum_find[j];
            }
        }
        double average = (double) sum / maximum_find.length;

        System.out.println("\nMaximum Marks = " +  max );
        System.out.println("\nMinimum Marks = " +  min );
        System.out.println("\nAverage Marks = " +  average );

        sc.close();
    }
}
