public class method {
    public static void main(String[]args){

        String name="Bro";
        int age=19;
        hello(name,age);

        int a=3;
        int b=4;

        System.out.println(add(a,b));

    }

    static void hello(String namee, int age){
        System.out.println("Hello "+namee);
        System.out.println("Your age is "+age);
    }
    static int add(int a,int b){
        int z= a+b;
        return z;

    }
    
}
