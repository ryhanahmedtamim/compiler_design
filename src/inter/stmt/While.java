
package inter.stmt;

import inter.expr.Expr;
import symbol.Type;

public class While extends Stmt{
    Expr expr; Stmt stmt;

    public While() {
        expr= null;
        stmt=null;
    }

    public void init(Expr e, Stmt s) {
        this.expr = e;
        this.stmt = s;
        if (expr.type != Type.BOOLEAN) {
            expr.error("boolean required in while");
        }
    }
    
    public void gen(int b, int a)
    {
    	after = a;
    	int lebel = newlabel();
    	
    	expr.jumping(0, a);
    	emitlabel(lebel);
    	emit("goto L" + b);
    	
    }
    
    
}
