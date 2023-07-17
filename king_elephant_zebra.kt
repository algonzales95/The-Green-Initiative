//Main1.kt

//Create a function called 'theGreenInitiative'
fun theGreenInitiative() {
    //Declare local variables
    var treeCount = 0
    var recyclingCount = 0
    
    //Initialize the Green Initiative 
    println("Welcome to The Green Initiative!")
    
    //Prompt user to decide if they'd like to plant a tree or recycle.
    println("Would you like to plant a tree or recycle?")
    
    //Set up a loop so that the user can plant trees/recycle multiple times
    loop@ while(true) {
        //Use 'readLine' to get user input
        when(readLine()) { 
            //If they decide to plant a tree
            "plant" -> {
                treeCount++
                println("You have planted a tree! You have planted $treeCount trees so far.")
            }
            //If they decide to recycle
            "recycle" -> {
                recyclingCount++
                println("You have recycled something! You have recycled $recyclingCount things so far.")
            }
            //If they decide to exit
            "exit" -> {
                println("Thank you for contributing to The Green Initiative! You have planted $treeCount trees and recycled $recyclingCount things so far.")
                break@loop
            }
            //If they enter an invalid input
            else -> println("Please enter a valid command.")
        }
    }
}

//Create the main function
fun main() {
    //Call the 'theGreenInitiative' function
    theGreenInitiative()
}