#Number:top#
#Number:import#

# <numbers>:Number ::= NUM <numbers>
class Number(Numbers): #Number:class#

    className = "Number"
    ruleString = "<numbers>:Number ::= NUM <numbers>"
    numbers = None

    def __init__(numbers):
        #Number:init#
        self.numbers = numbers

#Number#
