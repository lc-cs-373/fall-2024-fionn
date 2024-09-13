#Subject:top#
#Subject:import#

# <subject> ::= <noun>
class Subject(): #Subject:class#

    className = "Subject"
    ruleString = "<subject> ::= <noun>"
    noun = None

    def __init__(noun):
        #Subject:init#
        self.noun = noun

#Subject#
