package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class collection {

	public static void main(String[] args) {
		ArrayList<String> moins = new ArrayList<String>();
		moins.add("janvier");
		moins.add("fevrier");
		moins.add("mars");
		moins.add("avril");
		moins.add("mai");
		moins.add("juin");
		moins.add("juillet");
		moins.add("aout");
		moins.add("septembre");
		moins.add("octobre");
		moins.add("novembre");
		moins.add("decembre");
		//System.out.println(moins.get(5));
		//System.out.println(moins);
		//System.out.println(moins.get(2));
		//System.out.println(moins.get(5));
		
		//for (int i = 0; i < moins.size(); i++) {
		//	System.out.println(moins.get(i));
		//}
		//moins.set(7,"aouuut");
		//System.out.println(moins.get(7));
		//moins.add(0, "hi bro"); //insert first
		//moins.remove(2);
		//System.out.println(moins);
		
		//8
		// Recherche avec 'contains'
	    //System.out.println(moins.contains("octobre")); 
	 
	    // Recherche Avec indexOf
	    // System.out.println (moins.indexOf("juillet"));   
	 
	     // Recherche Avec lastIindexOf
	     //System.out.println (moins.lastIndexOf("mars"));
		
		//9 sort the list
        //Collections.sort(moins);
        //System.out.println(moins);
        
        //clone
        //ArrayList<String> moins2 =  (ArrayList<String>)moins.clone();
        
		//copie
        //ArrayList<String> moins2 = new ArrayList<String>();
        //moins2.addAll(moins);
		
		
		//if (moins.size()>0) {
			//System.out.println("listn'est pas vide");
		//}else{
			//System.out.println("la list vide");
		//}
        
        
        
        //HAshSet
		HashSet<String> moins3 = new HashSet<String>();
		moins3.add("janvier");
		moins3.add("fevrier");
		moins3.add("mars");
		moins3.add("avril");
		moins3.add("mai");
		moins3.add("juin");
		moins3.add("juillet");
		moins3.add("aout");
		moins3.add("septembre");
		moins3.add("octobre");
		moins3.add("novembre");
		moins3.add("decembre");
		//System.out.println(moins3);
		moins3.add("zoubir");
		//System.out.println(moins3);
		
		//for (int i = 0; i < moins3.size(); i++) {
		//	Object[] h = moins3.toArray();
		//	System.out.println(h[i]);
		//} 
		
		
        //System.out.println(moins3.size());
		//moins3.clear();
		//System.out.println(moins3);
        
        
        
        HashMap<String,Integer> m = new HashMap<String,Integer>();
        m.put("simo", 18);
        m.put("imad", 24);
        m.put("ali", 12);
        m.put("karim", 18);
        System.out.println(m.size());
        
        //creat another hashmap
        HashMap<String,Integer> m1 = new HashMap<String,Integer>();
        m1.putAll(m);
        System.out.println(m1);
        m1.remove("simo");
        System.out.println(m1);
        
        
        

	}
	
}
