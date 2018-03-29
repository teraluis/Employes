package helloworldapp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
public class IODemo {
	public void readString()  {
		String str=null;
		BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));
		try {
			str = entree.readLine();
			System.out.println("Reading...."+str);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
