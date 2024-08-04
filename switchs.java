import java.util.Scanner;

public class switchs {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the day:");
        String day =scanner.nextLine();

        switch(day){
            case "Monday":
                System.out.println("It's Monday!");
                break;
            case "Tuesday":
                System.out.println("It's Tuesday");
                break;
            case "Wednesday":
                System.out.println("It's Wednesday");
                break;
            case "Thursday":
                System.out.println("It's Thursday");
                break;
            case "Friday":
                System.out.println("It's Friday");
                break;
            case "Saturday":
                System.out.println("It's Saturday");
                break;
            case "Sunday":
                System.out.println("It's Sunday");
                break;
            default:
                System.out.println("Invalid input");
            
        }
    }
    
}
