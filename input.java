import java.util.Scanner;
public class input {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("What is your name?");
        String name= scanner.nextLine();
        System.out.println("You're name is "+name);
        
        System.out.println("What is your age?");
        int age=scanner.nextInt();
        System.out.println("Your age is "+age);
            
    }
}
