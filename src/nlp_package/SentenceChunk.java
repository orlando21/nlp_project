package nlp_package;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import opennlp.tools.chunker.ChunkerME;
import opennlp.tools.chunker.ChunkerModel;
import opennlp.tools.util.InvalidFormatException;

public class SentenceChunk {
		
	public ChunkerModel chunkModel(String file) throws InvalidFormatException, IOException {
			
		InputStream modelInChunk = new FileInputStream (file);
		ChunkerModel modelChunk = new ChunkerModel(modelInChunk);
		
		return modelChunk;
			
	}
		
			
	public ChunkerME chunker(ChunkerModel modelChunk) {
			
		ChunkerME chunker = new ChunkerME(modelChunk);
			
		return chunker;
			
	}
	

}
