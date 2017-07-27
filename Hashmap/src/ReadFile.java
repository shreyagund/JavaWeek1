import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;



public class ReadFile {


		public static ArrayList<String> readLines() throws Exception{
			
			
			
			new ArrayList<String>();
			
			BufferedReader reader = new BufferedReader(new FileReader("Anagrams.txt"));
			ArrayList<String> results = new ArrayList<String>();
			String line = reader.readLine();
			while(line !=null) {
				
				results.add(line);
				line = reader.readLine();
				
			}
			return results;
			
	
		}
		
		
}
