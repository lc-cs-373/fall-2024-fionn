//Dividera:top//
//Dividera:import//
import java.util.*;

// <solution>:Dividera ::= DIVIDER
public class Dividera extends Solution /*Dividera:class*/ {

    public static final String $className = "Dividera";
    public static final String $ruleString =
        "<solution>:Dividera ::= DIVIDER";



    public Dividera() {
//Dividera:init//

    }

    public static Dividera parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<solution>:Dividera", scn$.lno);
        scn$.match(Token.Match.DIVIDER, trace$);
        return new Dividera();
    }

//Dividera//
}
