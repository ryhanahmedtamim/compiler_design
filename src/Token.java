import java.util.ArrayList;

public abstract class Token {
	public static String SPACE = " ";
	public static String COMMA = ",";
	public static String SEMICOLNE = ";";
	public static String OPENGINGFIRSTBRACKET = "(";
	public static String CLOSINGFIRSTBRACKET = ")";
	public static String OPENGINGSECONDBRACKET = "{";
	public static String CLOSINGSECONDBRACKET = "}";
	public static String OPENGINGTHIRDBRACKET = "[";
	public static String CLOSINGTHIRDBRACKET = "]";
	public static String QUOTE = "\"";
	
	public static ArrayList<String> getAllToken()
	{
		ArrayList<String> allToken = new ArrayList<String>();
		allToken.add(SPACE);
		allToken.add(COMMA);
		allToken.add(SEMICOLNE);
		
		allToken.add(OPENGINGFIRSTBRACKET);
		allToken.add(CLOSINGFIRSTBRACKET);
		
		allToken.add(OPENGINGSECONDBRACKET);
		allToken.add(CLOSINGSECONDBRACKET);
		
		allToken.add(OPENGINGTHIRDBRACKET);
		allToken.add(CLOSINGTHIRDBRACKET);
		allToken.add(QUOTE);
		
		return allToken;
	}
	
}
