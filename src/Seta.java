import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

public class Seta {
	public static void main(String[] args) {
		 
	    System.out.println("HashSet");  
		
		 HashSet<String> hs = new HashSet<String>();  
		    // Adding element to HashSet  
		    hs.add("M");  
		    hs.add("B");  
		    hs.add("C");  
		    hs.add("A");  
		    hs.add("M");  
		    hs.add("X");  
		            System.out.println("Size of HashSet=" + hs.size());  
		            System.out.println("Original HashSet:" + hs);  
		            System.out.println("Removing A from HashSet: " + hs.remove("A"));  
		            System.out.println("Trying to Remove Z which is not present: "  
		                    + hs.remove("Z"));  
		           System.out.println("Checking if M is present=" + hs.contains("M"));  
		  System.out.println("Updated HashSet: " + hs);  
		
		    System.out.println("TreeSet");  


		    TreeSet<String> playerSet = new TreeSet<String>();  
		    playerSet.add("Sachin");  
		    playerSet.add("Zahir");  
		    playerSet.add("Mahi");  
		    playerSet.add("Bhajji");  
		    playerSet.add("Viru");  
		    playerSet.add("Gautam");  
		    playerSet.add("Ishant");  
		    playerSet.add("Umesh");  
		    playerSet.add("Pathan");  
		    playerSet.add("Virat");  
		    playerSet.add("Sachin"); // This is duplicate element so will not be added again  
		    //below will print list in alphabetic order  
		    System.out.println("Original Set:" + playerSet);  
		    System.out.println("First Name: "+ playerSet.first());  
		    System.out.println("Last Name: "+ playerSet.last());  
		    TreeSet<String> newPlySet = (TreeSet<String>) playerSet.subSet("Mahi", "Virat");  
		    System.out.println("Sub Set: "+ newPlySet);  
		    
		    System.out.println("LinkedHashSet");  
		    
		    
	        LinkedHashSet<String> linkedset = new LinkedHashSet<String>();  
	        // Adding element to LinkedHashSet  
	        linkedset.add("Maruti");  
	        linkedset.add("BMW");  
	        linkedset.add("Honda");  
	        linkedset.add("Audi");  
	        linkedset.add("Maruti"); //This will not add new element as Maruti already exists  
	        linkedset.add("WalksWagon");  
	        System.out.println("Size of LinkedHashSet=" + linkedset.size());  
	        System.out.println("Original LinkedHashSet:" + linkedset);  
	        System.out.println("Removing Audi from LinkedHashSet: " + linkedset.remove("Audi"));  
	        System.out.println("Trying to Remove Z which is not present: "  
	                + linkedset.remove("Z"));  
	        System.out.println("Checking if Maruti is present=" + linkedset.contains("Maruti"));  
	        System.out.println("Updated LinkedHashSet: " + linkedset);  
		    
		    
		    
		
		Random r = new Random();
	 
		Collection<Integer> hashSet = new HashSet<Integer>();  //não duplica
		Collection<Integer> treeSet = new TreeSet<Integer>();//não duplica e é ordenado
		LinkedHashSet<Integer> linkedSet = new LinkedHashSet<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer> ();
        
		// start time
		long startTime = System.nanoTime();
	
		for (int i = 0; i < 1000; i++) {
			int x = r.nextInt(1000 - 10) + 10;
			hashSet.add(x);
		}
		// end time
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		System.out.println("HashSet: " + duration);
	

		 
		// start time
		startTime = System.nanoTime();
	 
		for (int i = 0; i < 1000; i++) {
			int x = r.nextInt(1000 - 10) + 10;
			arrayList.add(x);
		}
		// end time
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("arrayList: " + duration);
	 
	 
	 

	 
		// start time
		startTime = System.nanoTime();
	 
		for (int i = 0; i < 1000; i++) {
			int x = r.nextInt(1000 - 10) + 10;
			treeSet.add(x);
		}
		// end time
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("TreeSet: " + duration);
	 
	 
	 
	 
		// start time
		startTime = System.nanoTime();
	 
		for (int i = 0; i < 1000; i++) {
			int x = r.nextInt(1000 - 10) + 10;
			linkedSet.add(x);
		}
		// end time
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("LinkedHashSet: " + duration);
	 
	}

}

