package nlp_package;

import java.io.*;

public class ReadInput {
	
	public String returnString(String inputFile) throws IOException{
		
		FileInputStream fileStream = new FileInputStream(inputFile);
		DataInputStream dataIn = new DataInputStream(fileStream) ;
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(dataIn));
		String returnString = bufferedReader.readLine();
		bufferedReader.close();
		
		return returnString;
		
	}

}
