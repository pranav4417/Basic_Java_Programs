package file_Write;
import java.io.*;

public class Filein {

	public static void main(String[] args) throws IOException {
		FileOutputStream fout = new FileOutputStream("/Users/pranavkandakurthi/Documents/Java_Full_Stack/test/hello.txt");
		BufferedOutputStream br = new BufferedOutputStream(fout);
		String s = "PRANAV KANDAKURTHI";
		byte[] b = s.getBytes();
		br.write(b);
		System.out.println("File Written scessfully!!");
		br.close();
		fout.close();

	}

}
