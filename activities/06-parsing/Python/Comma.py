#Comma:top#
#Comma:import#

# <numbers>:Comma ::= COMMA <numbers>
class Comma(Numbers): #Comma:class#

    className = "Comma"
    ruleString = "<numbers>:Comma ::= COMMA <numbers>"
    numbers = None

    def __init__(numbers):
        #Comma:init#
        self.numbers = numbers

#Comma#
