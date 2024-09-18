#Lon:top#
#Lon:import#

# <lon> ::= LEFTBRACKET <numbers> RIGHTBRACKET
class Lon(_Start): #Lon:class#

    className = "Lon"
    ruleString = "<lon> ::= LEFTBRACKET <numbers> RIGHTBRACKET"
    numbers = None

    def __init__(numbers):
        #Lon:init#
        self.numbers = numbers

#Lon#
