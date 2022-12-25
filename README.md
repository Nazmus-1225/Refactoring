# Refactoring
Refactoring assignment
Removed code smell from the codes of the following repository:
https://github.com/stanlylau/refactoring-workshop/tree/master/java/src/main/java/workshop

FizzBuzz:
Removed unnecessary variable StrReturn and increased readability

PlaintextToHtmlConverter:
Removed unnecessary methods: private String stashNextCharacterAndAdvanceThePointer(), private void pushACharacterToTheOutput(), protected String read()
Removed switch statements and replaced it with if-else statements
Decomposed private String basicHtmlEncode(String source)  into two mwthods to avoid long methods
Chnged datatype of Character To Convert from String to char

TriviaGame:
Removed unnecessary methods: public String createRockQuestion(int index), public int howManyPlayers(), protected void announce(Object message)
In private String currentCategory() method, number of if conditions are reduced
Decomposed public void roll(int roll)  into two mwthods to avoid long methods
