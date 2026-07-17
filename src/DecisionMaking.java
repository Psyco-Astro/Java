import java.sql.SQLOutput;

public class DecisionMaking {
    public static void  main(String[] args){
        int age = 25;
        int marks = 82;
        if(age > 18){
            System.out.println("Can Vote");
        }
        else {
            System.out.println("Can't Vote");
        }

        if (age % 2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

        if(marks >= 90){
            System.out.println("Grade A");
        }
        else if (marks >= 80) {
            System.out.println("Grade B");
        }
        else if (marks >= 70) {
            System.out.println("Grade C");
        }
        else{
            System.out.println("Fail");
        }

    }
}
