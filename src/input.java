
import java.util.Scanner;

public class input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //Scanner is a class, sc is an object(variable name)
        // new : create a new object inn memory
        // System.in : for input
        System.out.print("Enter Age : ");
        int age = sc.nextInt();
        System.out.println("Age : " + age );
        sc.nextLine();
        System.out.println("Enter Full name: ");
        String name = sc.nextLine(); // sc.next() : for single string input , sc.nextLine() : for reading full line
        System.out.println("Full Name : " + name );

        System.out.print("Enter Percentage");
        double percentage = sc.nextDouble();
        System.out.println("Percentage : " + percentage);
        sc.close();
    }
}
