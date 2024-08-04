import java.util.*;

public class twodarraylist {
    public static void main(String[] args) {
        
        ArrayList<String> bakeryList=  new ArrayList();
        bakeryList.add("Garlic Bread");
        bakeryList.add("Milk");
        bakeryList.add("Cake");

        ArrayList<String> drinklist= new ArrayList<>();
        drinklist.add("Coke");
        drinklist.add("Pespsi");
        drinklist.add("Lemon");

        ArrayList<String> vegiies=new ArrayList();
        vegiies.add("Tomato");
        vegiies.add("Radish");
        
        System.out.println(drinklist);

        ArrayList<ArrayList<String>> Groceries = new ArrayList<>();

        Groceries.add(bakeryList);
        Groceries.add(drinklist);
        Groceries.add(vegiies);

        System.out.println(Groceries.get(0).get(0));
    }
}
