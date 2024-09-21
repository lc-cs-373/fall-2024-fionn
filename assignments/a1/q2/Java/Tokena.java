//Tokena:top//
//Tokena:import//
import java.util.*;

// <solution>:Tokena ::= TOKEN
public class Tokena extends Solution /*Tokena:class*/ {

    public static final String $className = "Tokena";
    public static final String $ruleString =
        "<solution>:Tokena ::= TOKEN";



    public Tokena() {
//Tokena:init//

    }

    public static Tokena parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<solution>:Tokena", scn$.lno);
        scn$.match(Token.Match.TOKEN, trace$);
        return new Tokena();
    }

//Tokena//
}
