
package inter.stmt;

import inter.Node;

public class Stmt extends Node {

    public Stmt() {
    
    }
    public static Stmt Null = new Stmt();
    public static Stmt Enclosing = Stmt.Null; 
    
    int after = 0;
}
