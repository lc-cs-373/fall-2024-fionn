#WithComma:top#
#WithComma:import#

# <lon>:WithComma ::= LEFTBRACKET <number> RIGHTBRACKET
class WithComma(Lon): #WithComma:class#

    className = "WithComma"
    ruleString = "<lon>:WithComma ::= LEFTBRACKET <number> RIGHTBRACKET"
    number = None

    def __init__(number):
        #WithComma:init#
        self.number = number

#WithComma#
