import java.util.ArrayList;

public abstract class Keyword {
	
	public static String MAIN = "main";
	
	public static String INT = "int";
	public static String FLOAT = "float";
	public static String BOOL = "bool";
	public static String DOUBLE = "double";
	public static String CHAR  = "char";
	
	public static String IF = "if";
	public static String ELSE = "else";	
	public static String FOR = "for";
	public static String WHILE = "while";
	public static String DO = "do";
	
	public static String SCANF = "scanf";
	public static String PRINTF = "printf";
	
	public static String SQRT = "sqrt";
	public static String POW = "pow";
	
	public static String STRUC = "struc";
	public static String GOTO = "goto";
	
	public static String CONSTANT = "const";
	public static String BREAK = "break";
	
	public static String CONTINUE = "continue";
	public static String DEFAULT =  "default" ;
	public static String CASE =  "case";
	public static String SWITCH =  "switch";
	public static String EXTERN =  "extern";
	public static String AUTO =  "auto";
	public static String ENUM =  "enum";
	public static String LONG =  "long";
	public static String REGISTER =  "register";
	public static String RETURN =  "return";
	public static String SHORT =  "short";
	public static String SIZEOF =  "sizeof";
	public static String TYPEDEF =  "typedef";
	public static String UNION =  "union";
	public static String UNSIGNED =  "unsigned";
	public static String VOID =  "void";
	public static String VOLATILE =  "volatile";
	
	
	public static ArrayList<String> getAllKeyWord()
	{
		ArrayList<String> allKeyWord = new ArrayList<String>();
		allKeyWord.add(MAIN);
		allKeyWord.add(INT);
		allKeyWord.add(FLOAT);
		allKeyWord.add(BOOL);
		allKeyWord.add(DOUBLE);
		allKeyWord.add(CHAR);
		
		allKeyWord.add(IF);
		allKeyWord.add(ELSE);
		allKeyWord.add(FOR);
		allKeyWord.add(WHILE);
		allKeyWord.add(DO);
		
		allKeyWord.add(SCANF);
		allKeyWord.add(PRINTF);
		allKeyWord.add(SQRT);
		allKeyWord.add(POW);
		allKeyWord.add(STRUC);
		allKeyWord.add(GOTO);
		allKeyWord.add(CONSTANT);
		allKeyWord.add(BREAK);

		allKeyWord.add(CONTINUE);
		allKeyWord.add(DEFAULT);
		allKeyWord.add(CASE);
		allKeyWord.add(SWITCH);
		allKeyWord.add(EXTERN);
		allKeyWord.add(AUTO);
		allKeyWord.add(ENUM);
		allKeyWord.add(LONG);
		allKeyWord.add(REGISTER);
		allKeyWord.add(RETURN);
		allKeyWord.add(SHORT);
		allKeyWord.add(SIZEOF);
		allKeyWord.add(TYPEDEF);
		allKeyWord.add(UNION);
		allKeyWord.add(UNSIGNED);
		allKeyWord.add(VOID);
		allKeyWord.add(VOLATILE);
		
		//System.out.println(allKeyWord.size());
		return allKeyWord;
	}
	
}
