package inter.expr;

import org.omg.CORBA.PUBLIC_MEMBER;

import inter.Node;
import lexer.Token;
import symbol.Type;


public class Expr extends Node{
    
    public Token token;
    public Type type;

    public Expr(Token token, Type type) {
        this.token = token;
        this.type = type;
    }
    
    public Expr gen()
    {
    	return this;
    }
    
    public Expr reduce()
    {
    	return this;
    }
    
    public void jumping(int t,int f)
    {
    	emitjumps(toString(),t,f);   
    }

	private void emitjumps(String string, int t, int f) {
		
		if(t!=0 && f != 0)
		{
			emit("if " + string+ " goto L" + t);
			emit("goto L" +f);
		}
		else if(t !=0) {
			emit("if " + string+ " goto L" + t);
		}
		else if(f!=0)
		{
			emit("iffalse " + string+ " goto L" + t);
		}
		
		
		
	}
	
	public String toString()
	{
		return token.toString();
	}
    
}
