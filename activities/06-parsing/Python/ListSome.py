#ListSome:top#
#ListSome:import#

# <numbers>:ListSome ::= NUM <numbers>
class ListSome(Numbers): #ListSome:class#

    className = "ListSome"
    ruleString = "<numbers>:ListSome ::= NUM <numbers>"
    numbers = None

    def __init__(numbers):
        #ListSome:init#
        self.numbers = numbers

#ListSome#
