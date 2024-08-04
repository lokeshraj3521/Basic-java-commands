import javax.print.attribute.SupportedValuesAttribute;

public class nestedloop {
    public static void main(String[] args) {
        
        int row=5;
        int column=7;
        String symbol="#";

        for(int i=1; i<=row; i++){
            System.out.println();
            for(int j=1; j<=column; j++){
                System.out.print(symbol);
            }
        }
    }
    
}
