package edu.towson.cis.cosc455.fsaint1.project1.implementation;



// lexical checks only for valid tokens

public class MyCompiler {
	public static String mkdFile;
	
	public static void main(String args[]) {
		if(args.length == 0) {
			System.out.println("Please provide file name");
			exit();
		}
		
		else {
			mkdFile = args[0];
		}
		
		MyLexicalAnalyzer lex = new MyLexicalAnalyzer(mkdFile);
		
		MySyntaxAnalyzer syn = new MySyntaxAnalyzer(lex);
		
		try {
			syn.start();
		} catch (CompilerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void exit() {
		System.exit(0);
	}

}
