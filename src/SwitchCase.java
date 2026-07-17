public class SwitchCase {
    public static void main(String[] args){
        int day = 3;
        String browser = "Chrome";
        switch(day)
        {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid");

        }

        switch(browser)
        {
            case "Chrome":
                System.out.println("Chrome");
                break;

            case "Edge":
                System.out.println("Edge");
                break;

            case "Safari":
                System.out.println("Safari");
                break;
            default:
                System.out.println("unknown browser name");

        }
    }
}
