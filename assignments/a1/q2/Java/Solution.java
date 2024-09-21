//Solution:top//
//Solution:import//
import java.util.*;

public abstract class Solution /*Solution:class*/ {

    public static final String $className = "Solution";
    public static Solution parse(Scan scn$, Trace trace$) {
        Token t$ = scn$.cur();
        Token.Match match$ = t$.match;
        switch(match$) {
        case TOKEN:
            return Tokena.parse(scn$,trace$);
        case SKIP:
            return Skipa.parse(scn$,trace$);
        case DIVIDER:
            return Dividera.parse(scn$,trace$);
        case NONTERM:
            return Nonterma.parse(scn$,trace$);
        default:
            throw new PLCCException(
                "Parse error",
                "Solution cannot begin with " + t$.errString()
            );
        }
    }

//Solution//
}
