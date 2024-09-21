//Nonterma:top//
//Nonterma:import//
import java.util.*;

// <solution>:Nonterma ::= NONTERM
public class Nonterma extends Solution /*Nonterma:class*/ {

    public static final String $className = "Nonterma";
    public static final String $ruleString =
        "<solution>:Nonterma ::= NONTERM";



    public Nonterma() {
//Nonterma:init//

    }

    public static Nonterma parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<solution>:Nonterma", scn$.lno);
        scn$.match(Token.Match.NONTERM, trace$);
        return new Nonterma();
    }

//Nonterma//
}
