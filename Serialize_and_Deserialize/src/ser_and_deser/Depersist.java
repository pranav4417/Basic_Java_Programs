package ser_and_deser;
import java.io.*;

public class Depersist {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fin = new FileInputStream("/Users/pranavkandakurthi/Documents/Java_Full_Stack/test/Ser.txt");
		ObjectInputStream oin = new ObjectInputStream(fin);
		Persist s = (Persist)oin.readObject();
		System.out.println(s);
	}

}
