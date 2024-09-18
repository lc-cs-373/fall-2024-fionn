//Node:top//
//Node:import//
import java.util.*;

// <tree>:Node ::= LPAR TAG <tree>:left <tree>:right RPAR
public class Node extends Tree /*Node:class*/ {

    public static final String $className = "Node";
    public static final String $ruleString =
        "<tree>:Node ::= LPAR TAG <tree>:left <tree>:right RPAR";

    public Tree left;
    public Tree right;

    public Node(Tree left, Tree right) {
//Node:init//
        this.left = left;
        this.right = right;
    }

    public static Node parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<tree>:Node", scn$.lno);
        scn$.match(Token.Match.LPAR, trace$);
        scn$.match(Token.Match.TAG, trace$);
        Tree left = Tree.parse(scn$, trace$);
        Tree right = Tree.parse(scn$, trace$);
        scn$.match(Token.Match.RPAR, trace$);
        return new Node(left, right);
    }

//Node//
}
