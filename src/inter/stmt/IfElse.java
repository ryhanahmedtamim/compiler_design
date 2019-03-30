
package inter.stmt;

import inter.expr.Expr;
import symbol.Type;


public class IfElse extends Stmt {

    Expr expr;
    Stmt stmt;
    Stmt stmt2;

    public IfElse(Expr e, Stmt s1, Stmt s2) {
        this.expr = e;
        this.stmt = s1;
        this.stmt2 = s2;
        if (expr.type != Type.BOOLEAN) {
            expr.error("boolean required in if");
        }
    }
    
    public void gen(int b, int a)
    {
    	int lebel1 = newlabel();
    	int lebel2 = newlabel();
    	expr.jumping(0, lebel2);
    	emitlabel(lebel1);
    	emitlabel(lebel2);
    	
    }

}
