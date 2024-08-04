public class overloadedmethod {
    public static void main(String[] args) {
        
        int x= add(3,4,5,7);
        System.out.println(x);

        double y=add(1.3,2.4,3.0);
        System.out.println(y);

    }
    static int add(int a,int b){
        System.out.println("#1");
        return a+b;
    }
    static int add(int a,int b,int c){
        System.out.println("#2");
        return a+b+c;
    }
    static int add(int a,int b,int c,int d){
        System.out.println("#3");
        return a+b+c+d;
    }
    static double add(double a,double b){
        System.out.println("#4");
        return a+b;
    }
    static double add(double a,double b,double c){
        System.out.println("#5");
        return a+b+c;
    }
    static double add(double a,double b,double c,double d){
        System.out.println("#3");
        return a+b+c+d;
    }
}
