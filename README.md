<html lang="en">
<h2>Java NLP Project Using Apache OpenNLP</h2>
<p>
This repository contains Java demonstration code for implementing <a href="https://opennlp.apache.org/">Apache OpenNLP 1.5.3.</a> I wrote this code as a first experience with Natural Language Processing. Note there are many different ways of implementing NLP, but the Open NLP library is a good place to start for beginners.
</p>
<p>
This repository was uploaded with all necessary Java, OpenNLP, and Maven libraries and is more or less ready to go.
</p>
<h3>Goals</h3>
<p>The goal was to read an input.txt text file (small size because running these classes on longer text can take a loooong time), and write the NLP analysis to an output.txt file. Also the appropriate OpenNLP English-language model was used for analysis. This code does the following:</p>
<ul>
<li>Reads the sentences of input.txt</li>
<li>Writes the sentences as a text string to console</li>
<li>Writes the number of sentences found to both console and to output.txt</li>
<li>Writes the number of tokens (words, punctuation, numbers, etc.) found to both console and to output.txt/li>
<li>Writes the proper names of individuals found to console/li>
<li>Writes POS tags to output.txt</li>
<li>Writes chunks to output.txt</li>
<li>Writes parse results to output.txt</li>
</ul>

<p>This is actually a small subset of what one can do with these classes. For example, you can parse sentences for grammatical structure and much more.</p>


<h3>Features</h3>
<p>
This code contains the following features:</p>
<ul>
<li>Sentence detector</li>
<li>Sentence tokenizer</li>
<li>Name finder to detect named entities</li>
<li>Part-ofspeech tagger</li>
<li>Chunker</li>
<li>Parser</li>
</ul>

<p>As mentioned above, the appropriate OpenNLP English-language model is used to do these tasks.</p>

<h3>Structure</h3>
<p>
The <code>main[]</code> method is implemented in OpenNLP_App.java, which executes the following classes:
<ul>
<li>ReadInput.java for reading the contents of input.txt</li>
<li>SentenceDetect.java for detecting sentence boundaries</li>
<li>SentenceTokenize.java for detecting words and punctuation</li>
<li>NamedEntityRecognition.java for finding names in sentences</li>
<li>TaggerPOS.java for assigning English grammar categories to detected words</li>
<li>SentenceChunk.java for organizing sentences into chunks, based on detected tokens</li>
<li>SentenceParse.java for iteratively parsing a sentence according to parts of speech</li>
<li>PrintOutput.java for writing results to output.txt</li>
</ul>
</p>
<h3>Other Features</h3>
<p>
This code uses Maven dependency. See the OpenNLP documentation for more information.
</p>
</body>
</html>
