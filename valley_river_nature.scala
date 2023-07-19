//The Green Initiative

import scala.collection.mutable.ListBuffer

//Defining a type alias for a list of tuples of Strings 
type StringTupleList = List[(String, String)]

object TheGreenInitiative {

  //Function to print a message related to green message
  def printGreenMessage(message: String): Unit = 
    println(s"\nWe are part of TheGreenInitiative ---> $message\n")

  //Function to print a environmental initiative
  def printEnvironmentalInitiative(initiative: String): Unit = 
    println(s"\nTheGreenInitiative encourages environmental initiatives like this: $initiative\n")

  //Defining a method which will count the number of green words in a string
  def countGreenWords(phrase: String): Int = {
    val greenWords = List("climate", "green", "eco-friendly", "renewable", "durable")
    phrase.split(" ").filter(word => greenWords.contains(word)).length
  }

  //Function to print the number of green words in a sentence
  def printGreenWordsCount(phrase: String): Unit = 
    println(s"\nThe number of green words in the sentence '$phrase' is: ${countGreenWords(phrase)}\n")

  //Function to print out a message related to the environment and an environmental initiative
  def printEnvironmentalMessage(message: String, initiative: String): Unit = {
    printGreenMessage(message)
    printEnvironmentalInitiative(initiative)
  }

  //Function to convert a StringTupleList to a List of Strings
  def stringTupleListToStringList(list: StringTupleList): List[String] = 
    list.flatMap(tup => List(tup._1, tup._2))

  //Function to filter a StringTupleList based on a predicate
  def filterStringTupleList(list: StringTupleList, predicate: String => Boolean): StringTupleList =
    list.filter(tup => predicate(tup._1) && predicate(tup._2))

  //Function to reduce Strings to their longest common prefix
  def reduceStringToLongestCommonPrefix(str1: String, str2: String): String = {
    val len = str1.zip(str2).takeWhile(tup => tup._1 == tup._2).length
    str1.substring(0, len)
  }

  //Function to reduce a StringTupleList to its longest common prefix
  def reduceStringTupleListToLongestCommonPrefix(list: StringTupleList): String = 
    list.map(tup => reduceStringToLongestCommonPrefix(tup._1, tup._2)).reduceLeft((acc, str) => reduceStringToLongestCommonPrefix(acc, str))

  //Function to create a list of StringTuples
  def createStringTupleList(listOfStrings: List[String]): StringTupleList = {
    val listTuple = ListBuffer[(String, String)]()
    for (idx <- 0 until listOfStrings.length - 1)
      listTuple += ((listOfStrings(idx), listOfStrings(idx + 1)))
    listTuple.toList
  }

  //Function to print a longest common prefix from a List of Strings
  def printLongestCommonPrefix(listOfStrings: List[String]): Unit = {
    val stringTupleList = createStringTupleList(listOfStrings)
    val longestCommonPrefix = reduceStringTupleListToLongestCommonPrefix(stringTupleList)
    println(s"The longest common prefix of the list $listOfStrings is '$longestCommonPrefix'\n")
  }

  //Function to count the number of 'green words' in a list of strings
  def countGreenWordsInStringList(listOfStrings: List[String]): Int = 
    listOfStrings.flatMap(str => str.split(" ")).filter(word => countGreenWords(word) > 0).length

  //Function to print the number of 'green words' in a list of strings
  def printGreenWordsCountInStringList(listOfStrings: List[String]): Unit = 
    println(s"\nThe number of green words in the list of strings $listOfStrings is: ${countGreenWordsInStringList(listOfStrings)}\n")

  //Function to delete an environment related word from a StringTupleList
  def deleteEnvironmentRelatedWord(list: StringTupleList, environmentRelatedWord: String): StringTupleList = 
    filterStringTupleList(list, str => !(str == environmentRelatedWord))

  //Function to print a StringTupleList without and environment related word
  def printStringTupleListWithoutEnvironmentRelatedWord(list: StringTupleList, environmentRelatedWord: String): Unit = 
    println(s"\nThe list without the environment related word '$environmentRelatedWord' is: ${deleteEnvironmentRelatedWord(list, environmentRelatedWord)}\n")

}


 §§ COM


//Main method to demonstrate the usage of the TheGreenInitiative object
object TheGreenInitiativeApplication extends App {

  println("\nWelcome to TheGreenInitiative object! \n")

  //Printing a message and an environmental initiative
  TheGreenInitiative.printEnvironmentalMessage("Let's Save The Environment Together!", 
                                              "Using renewable energy sources instead of fossil fuels")

  //Printing number of green words in a sentence
  TheGreenInitiative.printGreenWordsCount("We should use climate-friendly solutions")

  //Printing the longest common prefix in a list of strings
  TheGreenInitiative.printLongestCommonPrefix(List("climate-friendly", "climate-oblivious", "climate-change"))

  //Printing the number of green words in a list of strings
  TheGreenInitiative.printGreenWordsCountInStringList(List("Renewable energy sources are eco-friendly", 
                                                          "Fossil fuels are bad for the environment"))

  //Printing a StringTupleList without an environment related word
  TheGreenInitiative.printStringTupleListWithoutEnvironmentRelatedWord(List(("Renewable", "Energy"), 
                                                                          ("Fossil", "Fuels")),
                                                                        "Fossil")

}