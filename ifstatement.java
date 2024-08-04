import java.util.Scanner;

public class ifstatement {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your age:");
        int age=scanner.nextInt();

        if(age >= 18)
        {
            System.out.println("You are eligible for voting");
        }
        else
        {
            System.out.println("You are not eligible for voting");
        }
        
    }
    
}
