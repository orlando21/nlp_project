package nlp_package;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import opennlp.tools.sentdetect.SentenceDetectorME;
import opennlp.tools.sentdetect.SentenceModel;
import opennlp.tools.util.InvalidFormatException;


public class SentenceDetect {
	
	
	public SentenceModel sentenceModel(String file) throws InvalidFormatException, IOException{
		
		
		InputStream sentenceModelIn = new FileInputStream(file);
		SentenceModel sentenceModel = new SentenceModel(sentenceModelIn);
			
		return sentenceModel;
	}
	
	public SentenceDetectorME detector(SentenceModel sentModel){
	
		SentenceDetectorME detector = new SentenceDetectorME(sentModel);
		
		return detector;
	}
		
		
}