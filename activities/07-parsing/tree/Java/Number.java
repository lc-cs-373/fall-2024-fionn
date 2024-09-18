//Number:top//
//Number:import//
import java.util.*;

// <tree>:Number ::= NUM
public class Number extends Tree /*Number:class*/ {

    public static final String $className = "Number";
    public static final String $ruleString =
        "<tree>:Number ::= NUM";



    public Number() {
//Number:init//

    }

    public static Number parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<tree>:Number", scn$.lno);
        scn$.match(Token.Match.NUM, trace$);
        return new Number();
    }

//Number//
}
