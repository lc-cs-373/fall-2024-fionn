//Tree:top//
//Tree:import//
import java.util.*;

public abstract class Tree extends _Start /*Tree:class*/ {

    public static final String $className = "Tree";
    public static Tree parse(Scan scn$, Trace trace$) {
        Token t$ = scn$.cur();
        Token.Match match$ = t$.match;
        switch(match$) {
        case LPAR:
            return Node.parse(scn$,trace$);
        case NUM:
            return Number.parse(scn$,trace$);
        default:
            throw new PLCCException(
                "Parse error",
                "Tree cannot begin with " + t$.errString()
            );
        }
    }

//Tree//
}
