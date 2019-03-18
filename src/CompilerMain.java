import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CompilerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		LexicalAnalyser lexicalAnalyser = new LexicalAnalyser();
		String lineString = "";		
		Scanner inFile = null;
		
		
		
			try
			{
				FileInputStream textFile = new FileInputStream ("input.txt");
				inFile = new Scanner (textFile);
				//System.out.println("File data.txt has been opened.");
				
				while(inFile.hasNextLine())
				{
					lineString = inFile.nextLine();
					lexicalAnalyser.addSyntax(lineString);
					//System.out.println(oneLine);
				}
				
			}
			catch (FileNotFoundException fnfe)
			{
				System.out.println("File data.txt was not found!");
			}
		
		
		
		lexicalAnalyser.analysis();
		
		System.out.println(lexicalAnalyser.toString());

	}

}
