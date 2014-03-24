package nlp_package;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import opennlp.tools.namefind.NameFinderME;
import opennlp.tools.namefind.TokenNameFinderModel;

public class NamedEntityRecognition {
	
	public TokenNameFinderModel namedEntityRecognitionModel(String file) throws IOException {
		
		InputStream modelInNER = new FileInputStream (file);
		TokenNameFinderModel modelNER = new TokenNameFinderModel(modelInNER);
	
		return modelNER;
		
	}
	
	public NameFinderME nameFinder(TokenNameFinderModel modelNER) {
		
		NameFinderME nameFinder = new NameFinderME(modelNER);
		
		return nameFinder;
		
	}

}
