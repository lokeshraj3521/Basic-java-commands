import java.util.ArrayList;

public class arraylist {
    public static void main(String[]args){

        ArrayList<String> food = new ArrayList<String>();

        food.add("Biryani");
        food.add("Parrota");
        food.add("Saalna");

        food.set(0, "Pizza");
        food.remove(2);
        //food.clear();

        for(int i=0;i<food.size();i++){
            System.out.println(food.get(i));
        }
    } 
}
