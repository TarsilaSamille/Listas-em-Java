import java.util.*;  
public class Mapa {  
    public static void main(String[] args) {  
        //Below Line will create HashMap with initial size 10 and 0.5 load factor  
        Map<String, Integer>empSal = new HashMap<String, Integer>(10, 0.5f);  
        //Adding employee name and salary to map  
        empSal.put("Ramesh", 10000);  
        empSal.put("Suresh", 20000);  
        empSal.put("Mahesh", 30000);  
        empSal.put("Naresh", 1000);  
        empSal.put("Nainesh", 15000);  
        empSal.put("Rakesh", 10000); // Duplicate Value also allowed but Keys should not be duplicate  
        empSal.put("Nilesh", null); //Value can be null as well  
        System.out.println("Original Map: "+ empSal);// Printing full Map   
        //Adding new employee the Map to see ordering of object changes  
        empSal.put("Rohit", 23000);  
        //Removing one key-value pair  
        empSal.remove("Nilesh");  
        System.out.println("Updated Map: "+empSal);// Printing full Map   
        //Printing all Keys  
        System.out.println(empSal.keySet());  
        //Printing all Values  
        System.out.println(empSal.values());  
        
        System.out.println("\n\n\n\n"); 

        
      //Creating Map of Fruit and price of it  
        Map<String, Integer> tMap = new TreeMap<String, Integer>();  
        tMap.put("Orange", 12);  
        tMap.put("Apple", 25);  
        tMap.put("Mango", 45);  
        tMap.put("Chicku", 10);  
        tMap.put("Banana", 4);  
        tMap.put("Strawberry", 90);  
        System.out.println("Sorted Fruit by Name: "+tMap);  
        tMap.put("Pinapple", 87);  
        tMap.remove("Chicku");  
        System.out.println("Updated Sorted Fruit by Name: "+tMap);  
    
        System.out.println("\n\n\n\n"); 

        
        // Set text in a string  
        String text = "Good morning class. Have a good learning class. Enjoy learning with fun!";  
        // Create a TreeMap to hold words as key and count as value  
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();  
        String[] words = text.split(" "); //Splitting sentance based on String   
        for (int i = 0; i < words.length; i++) {  
            String key = words[i].toLowerCase();  
            if (key.length() > 0) {  
                if (map.get(key) == null) {  
                    map.put(key, 1);  
                } else {  
                    int value = map.get(key).intValue();  
                    value++;  
                    map.put(key, value);  
                }  
            }  
        }  
        System.out.println(map);  
        
        
        System.out.println("\n\n\n\n"); 
        
        //Here Insertion order maintains   
        Map<Integer, String>lmap = new LinkedHashMap<Integer, String>();  
        lmap.put(12, "Mahesh");  
        lmap.put(5, "Naresh");  
        lmap.put(23, "Suresh");  
        lmap.put(9, "Sachin");  
        System.out.println("LinkedHashMap before modification" + lmap);  
        System.out.println("Is Employee ID 12 exists: " +lmap.containsKey(12));  
        System.out.println("Is Employee name Amit Exists: "+lmap.containsValue("Amit"));  
        System.out.println("Total number of employees: "+ lmap.size());  
        System.out.println("Removing Employee with ID 5: " + lmap.remove(5));  
        System.out.println("Removing Employee with ID 3 (which does not exist): " + lmap.remove(3));  
        System.out.println("LinkedHashMap After modification" + lmap);  
    
        
        
  
    }  
}