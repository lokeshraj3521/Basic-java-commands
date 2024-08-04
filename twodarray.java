public class twodarray {
    public static void main(String[] args) {
        
        String[][] cars ={  {"Honda","Ford","Kia"},
                            {"Civic","Ecosport","Sonet"}
                        };
		
			
		for(int i=0; i<cars.length; i++) {
			System.out.println();
            for(int j=0;j< cars[i].length;j++){
                System.out.println(cars[i][j]+" ");      

            }
		}

    }
    
}
