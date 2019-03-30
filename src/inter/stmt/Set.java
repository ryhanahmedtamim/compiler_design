
package inter.stmt;

import inter.expr.Expr;
import inter.expr.Id;
import symbol.Type;


//Loc
public class Set extends Stmt {
    
    Id id;
    Expr expr;
    
    public Set(Id id, Expr expr) {
        this.id = id;
        this.expr = expr;
        if (check(id.type, expr.type) == null) {
            error("type error ");
        }
    }
    
    public Type check(Type p1, Type p2) {
        if (Type.isNumeric(p1) && Type.isNumeric(p2)) {
            return p2;
        } else if (p1 == Type.BOOLEAN && p2 == Type.BOOLEAN) {
            return p2;
        } else {
            return null;
        }
    }
    
    public void gen(int b, int a)
    {
    	emit(id.toString()+" "+expr.gen().toString());
    	
    }
    
}
