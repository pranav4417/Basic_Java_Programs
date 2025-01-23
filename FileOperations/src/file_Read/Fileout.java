package file_Read;
import java.io.*;

public class Fileout {

	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("/Users/pranavkandakurthi/Documents/Java_Full_Stack/test/hello.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fin));
		String line;
		while((line = br.readLine())!= null)
			System.out.println("Data Recived from the file is:-- "+line);
		br.close();
		fin.close();
	}

}
