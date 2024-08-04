import java.util.ArrayList;

public class foreachloop {
    public static void main(String[] args) {
        
        //String[] animals={"Dog","cat","rat","bat"};
        ArrayList<String> animals= new ArrayList();

        animals.add("cat");
        animals.add("cat");
        animals.add("cat");
        
        for(String i: animals){
            System.out.println(i);
        }
        
    }
    
}
