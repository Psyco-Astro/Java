import java.util.Scanner;

public class Arrays {
    public static void main(String[] args){
        int[] marks =  new int[5];
        int[] marks_input =  new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 5 integers : ");

        for (int j = 0 ; j < 5; j++){
            marks_input[j] = sc.nextInt();
        }

        for (int k = 0 ; k < 5 ; k++){
            System.out.println( "The array index is :" + marks_input[k]);
        }
        sc.nextLine();

        String[] names = new String[5];
        System.out.print("Enter 5 names for string array: ");

        for (int s = 0; s < names.length ; s++){
            names[s] = sc.nextLine();
        }
        System.out.println("\n Names are : ");
        for (int t = 0 ; t < names.length; t++){
            System.out.println("String input names: " + names[t]);
        }
        marks[0] = 85;
        marks[1] = 185;
        marks[2] = 285;
        marks[3] = 385;
        marks[4] = 485;

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        for(int i = 0 ; i < 5 ; i++ ){
            System.out.println(marks[i]);
        }

    }
}
