/**
 * Test application for Apache OpenNLP 1.5 series class libraries
 */

package nlp_package;

//Import as many Java and openNLP libraries as necessary
import java.io.*;
import java.util.Arrays;
import opennlp.tools.postag.POSSample;
import opennlp.tools.util.Span;

//Main application constructor
public class OpenNLP_App {
	
	public static void main(String[] args) throws IOException {
		
		//Initialize java io and NLP objects
		ReadInput readInput = new ReadInput();
		SentenceDetect sentenceDetect = new SentenceDetect();
		SentenceTokenize sentenceTokenize = new SentenceTokenize();
		NamedEntityRecognition namedEntityRecognition = new NamedEntityRecognition();
		TaggerPOS taggerPOS = new TaggerPOS();
		SentenceChunk sentenceChunk = new SentenceChunk();
		SentenceParse sentenceParse = new SentenceParse();
		PrintOutput printOutput = new PrintOutput();
		
		//Read text file and convert to Java String
		String inputText = readInput.returnString("C:/workspace/nlp_project/src/nlp_package/input.txt"); //input file of text
		System.out.println(inputText); //print to console for test purposes
		
		try {
		//Load arrays with data from NLP objects
		String sentences[] = sentenceDetect.detector(sentenceDetect.sentenceModel("C:/workspace/nlp_project/bin/en-sent.bin")).sentDetect(inputText);
		String tokens[] = sentenceTokenize.tokenizer(sentenceTokenize.tokenizerModel("C:/workspace/nlp_project/bin/en-token.bin")).tokenize(inputText);
		Span names[] = namedEntityRecognition.nameFinder(namedEntityRecognition.namedEntityRecognitionModel("C:/workspace/nlp_project/bin/en-ner-person.bin")).find(tokens);
		String tags[] = taggerPOS.tagger(taggerPOS.modelPOS("C:/workspace/nlp_project/bin/en-pos-maxent.bin")).tag(tokens);
		String chunks[] = sentenceChunk.chunker(sentenceChunk.chunkModel("C:/workspace/nlp_project/bin/en-chunker.bin")).chunk(tokens, tags);
		
		FileOutputStream fout = printOutput.openFileOutput("C:/workspace/nlp_project/src/nlp_package/output.txt");
		
		//In output file, write number of sentences in input text
		System.out.println("\n" + "Number of sentences: " + sentences.length + "\n"); //print to console for test purposes
		printOutput.writeBlankLine(fout);
		printOutput.writeNumberofSentences(fout, sentences);
		
		//In the output file, write number of tokens in input text
		printOutput.writeBlankLine(fout);
		System.out.println("\n" + "Number of tokens: " + tokens.length + "\n"); //print to console for test purposes
		printOutput.writeNumberofTokens(fout, tokens);
		
		//Find proper names individuals by parsing tokens, and display names as strings in Eclipse console
		System.out.println("Found entity: " + Arrays.toString(Span.spansToStrings(names, tokens))); //print to console for test purposes
		
		//Output POS tags to file
		POSSample listPOS = new POSSample(tokens, tags);
		printOutput.writePOSTags(fout, listPOS);
		
		//Output chunks to file
		printOutput.writeChunks(fout, chunks);
		
		//Now for some parsing action, output to file
		printOutput.writeParses(fout, sentences, sentenceParse);
		
		printOutput.closeOutputFile(fout);
		
		}	//try bracket
		
		catch (IOException e) {
		e.printStackTrace();
		}
	
		}
}