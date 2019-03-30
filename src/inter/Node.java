package inter;

import lexer.Lexer;


public class Node {
    
    private int lexline;
    static int labels = 0;
    
    public int newlabel()
    {
    	return ++labels;
    }
    
    public void emitlabel(int i)
    {
    	System.out.println("L"+i+":");
    }
    public void emit(String s)
    {
    	System.out.println("\t"+s);
    }

    public Node() {
        lexline = Lexer.line;
    }
    
    public void error(String s) {
        throw new Error("near line " + lexline + ": " + s);
    }
}
