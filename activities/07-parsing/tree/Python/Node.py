#Node:top#
#Node:import#

# <tree>:Node ::= LPAR TAG <tree>:left <tree>:right RPAR
class Node(Tree): #Node:class#

    className = "Node"
    ruleString = "<tree>:Node ::= LPAR TAG <tree>:left <tree>:right RPAR"
    left = None
    right = None

    def __init__(left, right):
        #Node:init#
        self.left = left
        self.right = right

#Node#
