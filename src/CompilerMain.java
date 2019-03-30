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
		
		
	}

}
