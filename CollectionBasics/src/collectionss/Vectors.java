package collectionss;

import java.util.Vector;

public class Vectors {
	
	public static void main(String args[])	{
		Vector<Integer> v = new Vector(10,5);
		for(int i =0;i<21;i++)	{
			v.add(i);
		}
		System.out.println(v.size());
		System.out.println(v.capacity());
	}
}
