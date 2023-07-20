import scala.collection.mutable

// The Green Initiative
// This project is intended to encourage organizations to take action to reduce waste and energy consumption.

// Main Objectives
// 1. Encourage organizations to take action to reduce waste and energy consumption.
// 2. Create a network of organizations focused on sustainability and green initiatives.
// 3. Increase public awareness of sustainability and green initiatives through education and communication.

// Data Structures
// Create a datastructure to store information.
case class Organization(name: String, actionTaken: List[String], challengeAccepted: Boolean)

// Store information in a map
val organizationsMap: mutable.Map[String, Organization] = mutable.Map.empty

// Functions
// Function to add an organization to the map
def addOrganization(name: String, actionTaken: List[String], challengeAccepted: Boolean): Unit = {
  val organization = Organization(name, actionTaken, challengeAccepted)
  organizationsMap.update(name, organization)
}

// Function to remove an organization from the map
def removeOrganization(name: String): Unit = organizationsMap.remove(name)

// Function to update an organization's information in the map
def updateOrganization(name: String, actionTaken: List[String], challengeAccepted: Boolean): Unit = {
  organizationsMap.update(name, Organization(name, actionTaken, challengeAccepted))
}

// Function to show all organizations
def showOrganizations(): Unit = {
   println("Organizations:")
   organizationsMap.foreach { case (name, org) => 
     println(s"Name: $name, Actions Taken: ${org.actionTaken}, Challenge Accepted?: ${org.challengeAccepted}")
   }
}

// Function to show all organizations that have accepted the challenge
def showChallengeAcceptedOrganizations(): Unit = {
  println("Organizations that have accepted the challenge:")
  organizationsMap.foreach { case (name, org) => 
    if (org.challengeAccepted) {
      println(s"Name: $name, Actions Taken: ${org.actionTaken}")
    }
  }
}

// Test
addOrganization("Company 1", List("Installed solar panels"), true)
addOrganization("Company 2", List("Switched to LED lighting"), false)
addOrganization("Company 3", List("Recycled paper"), true)

showOrganizations()
showChallengeAcceptedOrganizations()

updateOrganization("Company 2", List("Switched to LED lighting","Reduced plastic usage"), true)

showOrganizations()
showChallengeAcceptedOrganizations()