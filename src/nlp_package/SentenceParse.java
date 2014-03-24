package nlp_package;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


import opennlp.tools.parser.Parser;
import opennlp.tools.parser.ParserFactory;
import opennlp.tools.parser.ParserModel;
import opennlp.tools.util.InvalidFormatException;

public class SentenceParse {
	
	public ParserModel parseModel(String file) throws InvalidFormatException, IOException{
		
		InputStream modelInParse = new FileInputStream (file);
		ParserModel parseModel = new ParserModel(modelInParse);
			
		return parseModel;
	}
	
	public Parser parser(ParserModel modelParser){
	
		Parser parser = ParserFactory.create(modelParser);
		
		return parser;
	}

}
