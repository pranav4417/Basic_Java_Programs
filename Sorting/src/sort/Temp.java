package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student    {
	int rollno, year, sem, age;
	
	String name,branch;
	float fees;
	static String clg;
	public Student(int rollno, String name, int year, int sem, int age,String clg ,String branch, float fees) {
		super();
		this.rollno = rollno;
		this.year = year;
		this.sem = sem;
		this.age = age;
		this.name = name;
		this.branch = branch;
		this.fees = fees;
		this.clg = clg;
	}
	public String toString() {
		return "Student [rollno=" + rollno + ", year=" + year +", name=" + name+ ", sem=" + sem + ", age=" + age
				+ ", branch=" + branch + ", fees=" + fees + ", clg=" + clg + "]";
	}
	
}


class AgeComparator implements Comparator	{
	public int compare(Object o1, Object o2)    {
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		if(s1.age == s2.age)
			return 0;
		else if(s1.age > s2.age)
			return 1;
		else
			return -1;

	}
}
class NameComparator implements Comparator<Student>    {
	public int compare(Student s1, Student s2)    {
		return s1.name.compareTo(s2.name);
	}
}
class FeesComparator implements Comparator<Student>   {
	public int compare(Student s1, Student s2)    {
		if(s1.fees == s2.fees)
			return 0;
		else if(s1.fees > s2.fees)
			return 1;
		else
			return -1;
	}
}

public class Temp {
	

	public static void main(String[] args) {
		ArrayList sl = new ArrayList();
		String clg = "PU";
		sl.add(new Student(1,"Pranav",2004,6,20,clg,"CSE",300000));
		sl.add(new Student(2,"Varun",2003,5,19,clg,"CSE",500000));
		sl.add(new Student(3,"Shubham",2002,7,21,clg,"CSE",200000));
		sl.add(new Student(4,"Raju",2005,5,19,clg,"CSE",900000));
		sl.add(new Student(5,"MahaDev",2004,6,20,clg,"CSE",900000));
		
		System.out.println("\n Sorting by Name----");
		System.out.println("_________");
		Collections.sort(sl, new NameComparator());
		Iterator it = sl.iterator();
		while(it.hasNext())		{
			Student st = (Student)it.next();
			System.out.println(st.rollno+" "+st.name+" "+st.fees+" "+st.branch+" "
			+st.year+" "+st.sem+" "+st.age+" "+st.clg);
		}
		System.out.println("\n Sorting by Age----");
		System.out.println("_______");
		Collections.sort(sl, new NameComparator());
		Iterator it1 = sl.iterator();
		while(it1.hasNext())		{
			Student st = (Student)it1.next();
			System.out.println(st.rollno+" "+st.name+" "+st.fees+" "+st.branch+" "
			+st.year+" "+st.sem+" "+st.age+" "+st.clg);
		
	}

		System.out.println("\n Sorting by Fees----");
		System.out.println("_______");
		Collections.sort(sl, new NameComparator());
		Iterator it2 = sl.iterator();
		while(it2.hasNext())		{
			Student st = (Student)it2.next();
			System.out.println(st.rollno+" "+st.name+" "+st.fees+" "+st.branch+" "
			+st.year+" "+st.sem+" "+st.age+" "+st.clg);
		}
}}
