package ser_and_deser;
import java.io.*;
public class Persist implements Serializable {
	String name;
	int id;
	int fees;
	
	public Persist(String name,int id,int fees)    {
		this.name = name;
		this.id = id;
		this.fees = fees;
		
	}
	public String toString()    {
		return id+" "+name+" "+fees+" "+"\n";
	}
	
	public static void main(String[] args) throws IOException {
		FileOutputStream fout = new FileOutputStream("/Users/pranavkandakurthi/Documents/Java_Full_Stack/test/Ser.txt");
		Persist s = new Persist("Pranavv",1,666);
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(s);
		System.out.println("Write Sucessful!");
		out.flush();
		out.close();
		fout.close();
	}

}
