public class swaptwovariables {
    public static void main(String[] args){
        String x="Water";
        String y="Fire";
        String temp;
        
        temp=x;
        x=y;
        y=temp;

        System.out.println("x:"+x);
        System.out.println("y:"+y);
    }
}
