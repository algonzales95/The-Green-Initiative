// The Green Initiative

// File 1: GreenInitiative.kt

// Include packages
import java.util.ArrayList
import java.util.HashMap

// Class to hold information about each initiative
class Initiative {
    var name: String
    var description: String
    var goal: String
    var participants: ArrayList<String> = ArrayList()

    constructor(name: String, description: String, goal: String) {
        this.name = name
        this.description = description
        this.goal = goal
    }
}

// Class to store data about the green initiative
class GreenInitiative {
    val initiativeList: HashMap<String, Initiative> = HashMap()

    fun addInitiative(name: String, description: String, goal: String) {
        val initiative = Initiative(name, description, goal)
        initiativeList.put(name, initiative)
    }

    fun removeInitiative(name: String) {
        initiativeList.remove(name)
    }

    fun getInitiative(name: String): Initiative? {
        return initiativeList.get(name)
    }

    fun addParticipant(name: String, participant: String) {
        if (initiativeList.containsKey(name)) {
            initiativeList.get(name)!!.participants.add(participant)
        } else {
            println("Initiative does not exist")
        }
    }

    fun removeParticipant(name: String, participant: String) {
        if (initiativeList.containsKey(name)) {
            initiativeList.get(name)!!.participants.remove(participant)
        } else {
            println("Initiative does not exist")
        }
    }

    fun getParticipants(name: String): ArrayList<String> {
        if (initiativeList.containsKey(name)) {
            return initiativeList.get(name)!!.participants
        } else {
            println("Initiative does not exist")
            return arrayListOf()
        }
    }

    fun printParticipants(name: String) {
        if (initiativeList.containsKey(name)) {
            val participants = initiativeList.get(name)!!.participants
            println("Participants in $name:")
            for (participant in participants) {
                println(participant)
            }
        } else {
            println("Initiative does not exist")
        }
    }
}

// Main method
fun main(args: Array<String>) {
    val greenInitiative = GreenInitiative()
    greenInitiative.addInitiative("Tree Planting Initiative",
        "Planting trees to combat global warming.",
        "Plant 1 million trees by 2020.")
    greenInitiative.addParticipant("Tree Planting Initiative", "John Doe")
    greenInitiative.addParticipant("Tree Planting Initiative", "Jill Smith")
    greenInitiative.printParticipants("Tree Planting Initiative")
}