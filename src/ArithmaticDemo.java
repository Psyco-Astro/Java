public class ArithmaticDemo {
    public static void main(String[] args){
        int a = 20;
        int b = 6;
        int age = 20;
        boolean hasLicense = true;
        double result = 20.0 / b ;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a / b);
        System.out.println(a * b);
        System.out.println(a % b);
        System.out.println(result);
        System.out.println(++a); //pre-increment
        System.out.println(b++); // post-increment
        System.out.println(age > 10);
        System.out.println(age < 10);
        System.out.println(age == 10);
        System.out.println(age > 18 && hasLicense);
        System.out.println(age < 18 || hasLicense); //OR operator
        System.out.println(!hasLicense); //OR operator
    }
}
