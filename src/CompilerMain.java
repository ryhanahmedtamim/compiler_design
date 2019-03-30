import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import lexer.Lexer;
import parser.Parser;

public class CompilerMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		
		System.setIn(new FileInputStream(new File("input.txt")));
        Lexer lexer = new Lexer();
        //System.out.println(lexer.toString());
        Parser parser = new Parser(lexer);
        parser.program();
		
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * LexicalAnalyser lexicalAnalyser = new LexicalAnalyser(); String lineString =
		 * ""; Scanner inFile = null;
		 * 
		 * 
		 * 
		 * try { FileInputStream textFile = new FileInputStream ("input.txt"); inFile =
		 * new Scanner (textFile);
		 * //System.out.println("File data.txt has been opened.");
		 * 
		 * while(inFile.hasNextLine()) { lineString = inFile.nextLine();
		 * lexicalAnalyser.addSyntax(lineString); //System.out.println(oneLine); }
		 * 
		 * } catch (FileNotFoundException fnfe) {
		 * System.out.println("File data.txt was not found!"); }
		 * 
		 * 
		 * 
		 * lexicalAnalyser.analysis();
		 * 
		 * System.out.println(lexicalAnalyser.toString());
		 */
	}

}
