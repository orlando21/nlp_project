package nlp_package;

import java.io.*;
import java.util.Arrays;
import opennlp.tools.cmdline.parser.ParserTool;
import opennlp.tools.parser.Parse;
import opennlp.tools.postag.POSSample;

public class PrintOutput {
	
	
	public FileOutputStream openFileOutput(String file) throws FileNotFoundException {
	
		FileOutputStream fout=new FileOutputStream(file);
		
		return fout;
	
		}
	
	public void writeBlankLine(FileOutputStream fout) throws IOException {
		
		fout.write(System.getProperty("line.separator").getBytes());
		
	}
	
	public void writeNumberofSentences(FileOutputStream fout, String sentences[]) throws IOException {
		
		fout.write(("Number of sentences: " + sentences.length).getBytes());
		this.writeBlankLine(fout);
		this.writeBlankLine(fout);
		
	}
	
	public void writeNumberofTokens(FileOutputStream fout, String tokens[]) throws IOException {
		
		fout.write(("Number of tokens: " + tokens.length + "\n").getBytes());
		this.writeBlankLine(fout);
		this.writeBlankLine(fout);
		
	}
	
	public void writePOSTags(FileOutputStream fout, POSSample listPOS) throws IOException {
		
		fout.write(("Here are the POS tags: " + listPOS).getBytes());
		this.writeBlankLine(fout);
		this.writeBlankLine(fout);
		
	}
	
	public void writeChunks(FileOutputStream fout, String chunks[]) throws IOException {
		
		fout.write(("Next on, here are the chunks: " + Arrays.toString(chunks)).getBytes());
		this.writeBlankLine(fout);
		this.writeBlankLine(fout);
		
	}
	
	public void writeParses(FileOutputStream fout, String sentences[], SentenceParse sentenceParse) throws IOException {
		
		fout.write(("Next on, here are the parse results:" + "\n").getBytes());
		this.writeBlankLine(fout);
		for (int i=0; i<sentences.length-1;i++){
			Parse topParses[] = ParserTool.parseLine(sentences[i], sentenceParse.parser(sentenceParse.parseModel("C:/workspace/nlp_project/bin/en-parser-chunking.bin")), 1);
			for (Parse p: topParses){
				StringBuffer result = new StringBuffer();
				p.show(result); //Output Parse object to StringBuffer result, instead of to console
				fout.write((" " + result.toString()).getBytes());
			}
			this.writeBlankLine(fout);
		}
		
	}
	
	public void closeOutputFile(FileOutputStream fout) throws IOException {
		
		fout.close();
		
	}
	
	
}
