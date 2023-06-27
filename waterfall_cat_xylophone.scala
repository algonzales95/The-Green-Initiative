//1
import scala.math

//2
object TheGreenInitiative {
 
  //3
  def calculateCarbonFootprint(energyUsage: Double): Double = {
    energyUsage * 0.055
  }
 
  //4
  def calculateCarbonSavings(energyUsage: Double, energySaved: Double): Double = {
    calculateCarbonFootprint(energyUsage) - calculateCarbonFootprint(energySaved)
  }
 
  // 5
  def calculateEnergySavings(energyBefore: Double): Double = {
    val energyAfter = energyBefore - (energyBefore * 0.1)
    energyAfter
  }
 
  //6
  def calculateCarbonSavingsForHouse(numberOfHouses: Int): Double = {
    val houseSize = 1200
    val energyBefore = houseSize * numberOfHouses
    val energySaved = calculateEnergySavings(energyBefore)
    calculateCarbonSavings(energyBefore, energySaved)
  }
 
  //7
  def calculateCarbonSavingsForSchool(numberOfSchools: Int): Double = {
    val schoolSize = 350
    val energyBefore = schoolSize * numberOfSchools
    val energySaved = calculateEnergySavings(energyBefore)
    calculateCarbonSavings(energyBefore, energySaved)
  }
 
  //8
  def calculateCarbonSavingsForIndustry(numberOfFactories: Int): Double = {
    val factorySize = 1000
    val energyBefore = factorySize * numberOfFactories
    val energySaved = calculateEnergySavings(energyBefore)
    calculateCarbonSavings(energyBefore, energySaved)
  }
 
  //9
  def calculateTotalCarbonSavings(numberOfHouses: Int, numberOfSchools: Int, numberOfFactories: Int): Double = {
    val houseSavings = calculateCarbonSavingsForHouse(numberOfHouses)
    val schoolSavings = calculateCarbonSavingsForSchool(numberOfSchools)
    val factorySavings = calculateCarbonSavingsForIndustry(numberOfFactories)
    houseSavings + schoolSavings + factorySavings
  }
 
  //10
  def main(args: Array[String]): Unit = {
    val numberOfHouses = args(0).toInt
    val numberOfSchools = args(1).toInt
    val numberOfFactories = args(2).toInt
 
    val totalSavings = calculateTotalCarbonSavings(
      numberOfHouses,
      numberOfSchools,
      numberOfFactories
    )
    println("Total carbon savings: " + totalSavings)
  }
}

//11
case class Building(val squareFeet: Int)

//12
class House(override val squareFeet: Int) extends Building(squareFeet) {

//13
  override def toString: String = {
    "[House] Square Feet: " + squareFeet
  }
}

//14
class School(override val squareFeet: Int) extends Building(squareFeet) {

//15
  override def toString: String = {
    "[School] Square Feet: " + squareFeet
  }
}

//16
class Factory(override val squareFeet: Int) extends Building(squareFeet) {

//17
  override def toString: String = {
    "[Factory] Square Feet: " + squareFeet
  }
}

//18  
class GreenOnlineAssessment() {

//19
  def calculateBuildingEmissions(building: Building): Double = {
    building.squareFeet * 0.055
  }

//20
  def calculateTotalEmissions(buildings: List[Building]): Double = {
    buildings.map(building => calculateBuildingEmissions(building)).sum
  }

//21
  def calculateEmissionsSaved(buildings: List[Building], savedEnergyPerSF: Double): Double = {
    buildings.map(building => building.squareFeet * savedEnergyPerSF).sum
  }

//22
  def calculateTotalEmissionsSaved(buildings: List[Building], savedEnergyPerSF: Double): Double = {
    calculateTotalEmissions(buildings) - calculateEmissionsSaved(buildings, savedEnergyPerSF)
  }

//23
  def saveEmissions(buildings: List[Building], energySavedPercent: Double): Double = {
    val savedEnergyPerSF = energySavedPercent * 0.055
    calculateTotalEmissionsSaved(buildings, savedEnergyPerSF)
  }

//24
  def main(args: Array[String]): Unit = {
    val numberOfHouses = args(0).toInt
    val numberOfSchools = args(1).toInt
    val numberOfFactories = args(2).toInt
 
    val houses = (1 to numberOfHouses).map(_ => new House(1200)).toList
    val schools = (1 to numberOfSchools).map(_ => new School(350)).toList
    val factories = (1 to numberOfFactories).map(_ => new Factory(1000)).toList
    val buildings = houses ::: schools ::: factories
    val totalEmissionsSaved = saveEmissions(buildings, 0.1)
    println("Total carbon savings: " + totalEmissionsSaved)
  }
}