package nlp_package;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import opennlp.tools.tokenize.Tokenizer;
import opennlp.tools.tokenize.TokenizerME;
import opennlp.tools.tokenize.TokenizerModel;
import opennlp.tools.util.InvalidFormatException;



public class SentenceTokenize {
	
	public TokenizerModel tokenizerModel(String file) throws InvalidFormatException, IOException {
		
		InputStream modelInTOK = new FileInputStream (file);
		TokenizerModel modelTOK = new TokenizerModel(modelInTOK);
	
		return modelTOK;
		
	}
	
		
	public Tokenizer tokenizer(TokenizerModel modelTOK) {
		
		Tokenizer tokenizer = new TokenizerME(modelTOK);
		
		return tokenizer;
		
	}
	

}
