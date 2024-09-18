#ListMany:top#
#ListMany:import#

# <numbers>:ListMany ::= COMMA NUM <numbers>
class ListMany(Numbers): #ListMany:class#

    className = "ListMany"
    ruleString = "<numbers>:ListMany ::= COMMA NUM <numbers>"
    numbers = None

    def __init__(numbers):
        #ListMany:init#
        self.numbers = numbers

#ListMany#
