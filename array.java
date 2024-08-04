public class array {
    public static void main(String[] args) {
        
        String[] cars = {"Honda","Ford","Kia"};
		
		cars[2] = "Tesla";
			
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}

    }
    
}
