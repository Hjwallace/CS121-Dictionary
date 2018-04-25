package test;

public class Dictionary {

	String word;
	String def;
	String author;

	public Dictionary(String w, String d, String a) {
		this.word = w;
		this.def = d;
		this.author = a;
	}
	

	public String getDef(String w) {
		String statement = def + "\n Author: " + author + "\n Added on: TIME";
		return statement;

	}

	public void addDef(String w, String d, String a) {
		this.def = d;
		this.author = a;
		// Add a def to the dictionary for word
	}

}
