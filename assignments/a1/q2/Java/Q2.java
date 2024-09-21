//Q2:top//
//Q2:import//
import java.util.*;

// <q2> ::= <solution>
public class Q2 extends _Start /*Q2:class*/ {

    public static final String $className = "Q2";
    public static final String $ruleString =
        "<q2> ::= <solution>";

    public Solution solution;

    public Q2(Solution solution) {
//Q2:init//
        this.solution = solution;
    }

    public static Q2 parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<q2>", scn$.lno);
        Solution solution = Solution.parse(scn$, trace$);
        return new Q2(solution);
    }

//Q2//
}
