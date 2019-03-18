import java.util.ArrayList;

public abstract class Operator {
	
	public static String PLUS = "+";
	public static String MULTIPLICATION = "*";
	public static String MINUS = "-";
	public static String DIVIDE = "/";
	
	public static String EQUALTO = "=";
	public static String GREATERTHAN = ">";
	public static String LESSTHAN = "<";
	public static String NOT = "!";
	
	
	public static String NOTEQUAL = "!=";
	public static String LESSOREQUAL = "<=";
	public static String GREATEROREQUAL = ">=";
	public static String EQUALEQUAL = "==";
	
	public static String PLUSPLUS = "++";
	public static String MINUSMINUS = "--";
	public static String PLUSEQUAL = "+=";
	public static String MINUSEQUAL = "-=";
	public static String DIVIDEEQUAL = "/=";
	public static String MULTIPLICATIONEQUAL = "*=";
	
	
	public static ArrayList<String> getAllOperator()
	{
		ArrayList<String> allOperator = new ArrayList<String>();
		allOperator.add(PLUS);
		allOperator.add(MULTIPLICATION);
		allOperator.add(MINUS);
		allOperator.add(DIVIDE);
		
		allOperator.add(EQUALTO);		
		allOperator.add(GREATERTHAN);
		allOperator.add(LESSTHAN);
		allOperator.add(NOT);
		
		allOperator.add(NOTEQUAL);
		allOperator.add(LESSOREQUAL);		
		allOperator.add(GREATEROREQUAL);
		allOperator.add(EQUALEQUAL);
		
		
		allOperator.add(PLUSPLUS);
		allOperator.add(MINUSMINUS);
		allOperator.add(PLUSEQUAL);
		allOperator.add(MINUSEQUAL);
		allOperator.add(DIVIDEEQUAL);
		allOperator.add(MULTIPLICATIONEQUAL);	
		
		return allOperator;
	}
	
	
	
	
	
}