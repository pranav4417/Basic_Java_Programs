package collectionss;
import java.util.*;

public class CollectionBasics {

	public static void main(String[] args) {
		 
		Collection c = new ArrayList();
		c.add(7);
		c.add("Pranav");
		c.add(9.9);
		c.add('h');
		
		for (Object o:c)     {
			System.out.println(o);
		}
		String s[] = new String[5];
		s[0] = "Pranav";
		s[1] = "Varun";
		s[2] = "Tejas";
		s[3] = "shubham";
		s[4] = "sumukh";
		for(String so:s)      {
			System.out.println(so);
		}
		

		
		
	}

}
