package mp.maven;

/**
 * Hello world!
 *
 */

import java.util.*;
public class App {

	
		

			
			    public static void main( String[] args )
			    {
			    	
			    	SortedMap<String, String> marketProjects = new TreeMap<String,String>();

			       
			        marketProjects.put("US", "Project A");
			        marketProjects.put("EU", "Project B");
			        marketProjects.put("ASIA", "Project C");
			        System.out.println(marketProjects.entrySet());

			        
			    }
			



	

}
