
package Lab4Project5;
public class TerminalExpression implements Expression {
    private String data;
    public TerminalExpression(){
        
    }
    public boolean interpret(){
        return data;
    }
}
