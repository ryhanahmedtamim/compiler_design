import java.util.ArrayList;

import javax.swing.text.AbstractDocument.LeafElement;

public class LexicalAnalyser {
	

	private ArrayList<String>  syntaxsList = new ArrayList<String>(); 
	private int numberOfSyntax = 0;
	private int numberOfVariable = 0;
	ArrayList<String> leximList = new ArrayList<String>();
	ArrayList<Identifier> identifiers = new ArrayList<Identifier>();

	public LexicalAnalyser() 
	{
		// TODO Auto-generated constructor stub
	}
	
	public void addSyntax(String syntax)
	{
		this.syntaxsList.add(syntax);
		++numberOfSyntax;
	}
	
	public void analysis()
	{
		
		for(int i=0; i<numberOfSyntax; i++)
		{
			String syntax = syntaxsList.get(i);
			
			String lexim = "";
			//ArrayList<Character> l
			
			
			//System.out.println(syntax);
			for(int j=0; j<syntax.length(); j++)
			{
				//System.out.println(divideBytoke(syntax.charAt(j)));
				String commentString = "";
				if(j<syntax.length()-1)
					commentString = ""+syntax.charAt(j)+syntax.charAt(j+1);
				
				if(commentString.equals("//"))
				{
					break;
				}

				if(divideBytoke(syntax.charAt(j)))
				{
					if(!lexim.equals("") && !lexim.equals(" "))
					{
						 leximList.add(lexim);
						  lexim = "";
						  
					}
						
					 
						lexim = lexim + syntax.charAt(j);
						
						if(j<syntax.length()-1)
						{
							String douleOperatorString = lexim + syntax.charAt(j+1);
							
							if(doubleOperator(douleOperatorString))
							{
								lexim = douleOperatorString;
								j++;
							}
						}

						if(!lexim.equals("") && !lexim.equals(" "))
						{
							 leximList.add(lexim);
							  lexim = "";
							  
						}
												 
						if(lexim.equals(" ") || lexim.equals("\t"))
						{
							lexim = "";
						}
				}
				else 
				{
					if(lexim.equals("\t"))
					{
						lexim = "";
					}
					
					
					
					lexim += syntax.charAt(j);
					
					
				}
				
				//System.out.print(lexim);
			}
			
			leximList.add("\n");
			
		}
		makeTokenForm();
	}
	
	
	
	
	public ArrayList<String> getLeximList() {
		return leximList;
	}

	public void isError()
	{
		
		for(int i=0; i<identifiers.size(); i++)
		{
			
			Identifier identifier = identifiers.get(i);
			
			if(!identifier.getAttributeValue().equals(identifier.getIdentifierName()))
			{
				String s = "";
				s += identifier.getIdentifierName().charAt(0);
				
				//System.out.println(s);
				
				if(isNumeric(s) || isToken(s)||isOperator(s))
				{
					identifiers.get(i).setAttributeValue("error");
					identifiers.get(i).setIdentifier(identifier.getIdentifierName());
					
				}
			}
			
		}
		
	}
	
	private boolean doubleOperator(String operator )
	{
		if(operator.equals(Operator.EQUALEQUAL) || operator.equals(Operator.GREATEROREQUAL) || operator.equals(Operator.LESSOREQUAL) || operator.equals(Operator.NOTEQUAL) 
				|| operator.equals(Operator.PLUSPLUS) || operator.equals(Operator.MINUSMINUS) || operator.equals(Operator.PLUSEQUAL) 
				|| operator.equals(Operator.MINUSEQUAL) || operator.equals(Operator.MULTIPLICATIONEQUAL) || operator.equals(Operator.DIVIDEEQUAL)   
				)
		{
			return true;
		}
		return false;
	}
	
	private boolean divideBytoke(char tokenChar)
	{
		//
		
		String token = String.valueOf(tokenChar);
		//System.out.println(token);
		if((token.equals( Token.COMMA))|| (token.equals(Token.SEMICOLNE)) || (token.equals(Token.SPACE)) 
				|| (token.equals(Operator.PLUS)) || (token.equals(Operator.MINUS)) || (token.equals(Operator.MULTIPLICATION))
				|| (token.equals(Operator.DIVIDE)) || (token.equals(Operator.EQUALTO)) || (token.equals(Operator.GREATERTHAN)) 
				|| (token.equals(Operator.LESSTHAN)) || (token.equals(Operator.NOT) )
				|| token.equals("{" ) || token.equals("}") || token.equals("(") || token.equals("}") || token.equals(")")
				)
		{
			return true;
		}
		return false;
	}
	
	public boolean isKeyword(String keyword)
	{
		ArrayList<String> allTokenList = Keyword.getAllKeyWord();
		
		for(int i=0; i<allTokenList.size(); i++)
		{
			if(keyword.equals(allTokenList.get(i)))
			{
				return true;
			}
		}
		return false;
	}
	
	public boolean isToken(String token)
	{
		ArrayList<String> allTokenList = Token.getAllToken();
		
		for(int i=0; i<allTokenList.size(); i++)
		{
			if(token.equals(allTokenList.get(i)))
			{
				return true;
			}
		}
		return false;
	}
	
	public boolean isOperator(String operator)
	{
		ArrayList<String> allOperator = Operator.getAllOperator();
		
		for(int i=0; i<allOperator.size(); i++)
		{
			if(operator.equals(allOperator.get(i)))
			{
				return true;
			}
		}
		return false;
	}
	
	public Identifier alreadyTokenized(String identifier) 
	{
		
		for(int i=0; i<identifiers.size(); i++)
		{
			if(identifier.equals(identifiers.get(i).getIdentifierName()))
			{
				return identifiers.get(i);
			}
		}
		return null;
	}

	public static boolean isNumeric(String str)  
	{  
	  try  
	  {  
	    double d = Double.parseDouble(str);  
	  }  
	  catch(NumberFormatException nfe)  
	  {  
	    return false;  
	  }  
	  return true;  
	}
	
	public void makeTokenForm()
	{
		int k = 1;
		boolean flag = false;
		for (int i = 0; i < leximList.size(); i++) 
		{
			String lexim = leximList.get(i);
			
			
			if(lexim.equals("int") || lexim.equals("float") || lexim.equals("double") || lexim.equals("char"))
			{
				flag = true;
			}
			else if(lexim.equals(";")) {
				flag = false;
			}
				
			
			if( !isKeyword(lexim) && !isToken(lexim) && !isOperator(lexim) && !isNumeric(lexim))
			{
				//if(identifiers.contains())
				
				
				if(flag)
				{
					//System.out.println(isError(lexim));
					if(isError(lexim))
					{
						Identifier identifier = new Identifier("Error", lexim,lexim);
						
						identifiers.add(identifier);
					}
				}
				else if(alreadyTokenized(lexim) == null)
				{
					Identifier identifier = new Identifier(String.valueOf(k), "id",lexim);
					
					identifiers.add(identifier);
					k++;
				}
				else {
					identifiers.add(alreadyTokenized(lexim));
				}
				
				
			}
			else {
				String idvalueString = "";
				
				if(isKeyword(lexim))
				{
					idvalueString = "keyword";
				}
				else  if(isToken(lexim)){
					idvalueString = "Seperator";
					
				}
				else if (isOperator(lexim)) {
					idvalueString = "operator";
				}
				else  if( isNumeric(lexim) ){
					idvalueString = "number";
				}
				
				Identifier identifier = new Identifier(lexim, idvalueString,lexim);
				
				identifiers.add(identifier);
			}
		}
		
		//isError();
	}
	
	public boolean isError(String str)
	{
		//System.out.println(str);
		if(isKeyword(str))
		{
			return true;
		}
		
		String string =""+ str.charAt(0);
		if(isNumeric(string))
		{
			return true;
		}
		for(int i=0; i<str.length(); i++)
		{
			if(isToken(""+str.charAt(i)) )
			{
				return true;
			}
		}
		
		
		return false;
	}
	
	public String toString() {
		String string = "";
		//System.out.println(identifiers);
		for(int i=0; i<identifiers.size(); i++)
		{
			Identifier identifier = identifiers.get(i);
			
			//System.out.println(identifier.getAttributeValue() +" "+identifier.getIdentifier()+"  "+identifier.getIdentifierName());
			
			if(identifier.getAttributeValue().equals(identifier.getIdentifierName()))
			{
				string+="< "+identifier.getAttributeValue()+" , "+identifier.getIdentifier()+" > ";
			}
			else {
				string+="< "+identifier.getIdentifier()+" , "+identifier.getAttributeValue()+" > ";
			}
			//System.out.println(leximList.get(i));
			if(identifier.getAttributeValue().equals("{") || identifier.getAttributeValue().equals(")") || identifier.getAttributeValue().equals(";") || identifier.getAttributeValue().equals("}"))
			{
				string += "\n\n";
			}
		}
		

		
		return string;
	}

}
