//Skipa:top//
//Skipa:import//
import java.util.*;

// <solution>:Skipa ::= SKIP
public class Skipa extends Solution /*Skipa:class*/ {

    public static final String $className = "Skipa";
    public static final String $ruleString =
        "<solution>:Skipa ::= SKIP";



    public Skipa() {
//Skipa:init//

    }

    public static Skipa parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<solution>:Skipa", scn$.lno);
        scn$.match(Token.Match.SKIP, trace$);
        return new Skipa();
    }

//Skipa//
}
