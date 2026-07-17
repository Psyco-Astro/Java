import java.util.*; //package for input
public class Firstclass{
    public static void main(String[] args){
        //output
        System.out.println("Hello World"); //println is used to print in another line.
        System.out.print("Hello World\nfrom Ishaan"); //print is a function in java and system is a class
// \n is also for new line
// TIP: type sout and press enter : will have entire system.out.println fn
        System.out.println();

        // Variables

        int a =25;
        int b = 20;
        double car = 20.25;
        String name = "Tony Stark";

        //java is a typed language : we need to specify the data type of every variable.

        //INPUT

        Scanner sc = new Scanner(System.in); // we have created an object of scanner class
//        String nam = sc.next(); // we are storing the name in it
//        // the function 'next()' in the object of scanner class is used to take input
//        // NOTE: this next() function takes only 1 token : means agar input "tony stark" hai toh output: "tony" aayega
//        // Input entire line :: String nam = sc.nextLine();
//        // nextInt() : to input integers
//        // nextFloat() : to input Float
//        System.out.println(nam);


        int One = sc.nextInt();
        int two = sc.nextInt();

        int sum = One + two;
        System.out.println(sum);



    }
}