package collectionss;
import java.util.*;

public class Java_cursors {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		for(int i = 0; i<11;i++)    {
			c.add(i);
		}
		//--------1.Enumerator
		Vector v = new Vector(c);
		Enumeration e = v.elements();
		while(e.hasMoreElements())	{
			Integer in = (Integer)e.nextElement();
			System.out.println(in);
		}
		
		System.out.println("-------Break-------");

		//--------2.Iterator
		Iterator i = c.iterator();
		while(i.hasNext())	{
			System.out.println(i.next());
		}
		
		System.out.println("-------Break-------");

		//--------3.List Iterator
		List<Integer> list = new ArrayList<>(c); // Convert Collection to List
        ListIterator<Integer> li = list.listIterator();
        while (li.hasNext()) {
            System.out.println(li.next());
        }
		
	}

}
