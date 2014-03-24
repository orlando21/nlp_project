package nlp_package;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import opennlp.tools.postag.POSModel;
import opennlp.tools.postag.POSTaggerME;
import opennlp.tools.util.InvalidFormatException;

public class TaggerPOS {
	
	public POSModel modelPOS(String file) throws InvalidFormatException, IOException{
		
		InputStream modelInPOS = new FileInputStream (file);
		POSModel modelPOS = new POSModel(modelInPOS);
			
		return modelPOS;
	}
	
	public POSTaggerME tagger(POSModel modelPOS){
	
		POSTaggerME tagger = new POSTaggerME(modelPOS);
		
		return tagger;
	}

}
