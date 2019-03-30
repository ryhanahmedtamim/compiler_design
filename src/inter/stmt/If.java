
package inter.stmt;

import inter.expr.Expr;
import symbol.Type;

public class If extends Stmt {

    public Expr expr;
    public Stmt stmt;

    public If(Expr e, Stmt s) {
        this.expr = e;
        this.stmt = s;
        if (expr.type != Type.BOOLEAN) {
            expr.error("boolean required in if");
        }
    }
    
    public void gen(int b, int a)
    {
    	int lebel = newlabel();
    	expr.jumping(0, a);
    	emitlabel(lebel);
    	
    }

}
