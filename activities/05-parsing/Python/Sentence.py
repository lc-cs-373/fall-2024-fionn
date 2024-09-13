#Sentence:top#
#Sentence:import#

# <sentence> ::= <subject> <verb> <noun> PERIOD
class Sentence(_Start): #Sentence:class#

    className = "Sentence"
    ruleString = "<sentence> ::= <subject> <verb> <noun> PERIOD"
    subject = None
    verb = None
    noun = None

    def __init__(subject, verb, noun):
        #Sentence:init#
        self.subject = subject
        self.verb = verb
        self.noun = noun

#Sentence#
