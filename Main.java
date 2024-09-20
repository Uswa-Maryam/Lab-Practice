public class Main {
    public static void main(String args[]) {
      
        Artist artist1 = new Artist("Uswa Maryam");

       
        Artwork artwork1 = new Artwork("Landscape painting", 2013, artist1);
        Artwork artwork2 = new Artwork("The Last Supper", 1498);

        
        System.out.println("Original Artwork Details:");
        artwork1.displayInfo();
        artwork2.displayInfo();

        
        
        System.out.println("\nAfter Modifying Artwork2:");
        artwork2 = new Artwork("Modified Last Supper", 1500);
        artwork2.displayInfo();

     
        Artwork shallowCopy = artwork1.shallowCopy();

        
        Artwork deepCopy = artwork1.deepCopy();

        
        System.out.println("\nShallow Copy Details:");
        shallowCopy.displayInfo();
        System.out.println("\nDeep Copy Details:");
        deepCopy.displayInfo();

        if(artwork1==artwork2)
			System.out.println("?");
		else
			System.out.println("Not same");       
          
     
        artist1 = new Artist("Iqra");

        
        System.out.println("\nAfter Modifying Original Artist's Name:");
        artwork1.displayInfo();
        shallowCopy.displayInfo();
        deepCopy.displayInfo();
    }
}  