//Green Initiative Objective: Reduce pollution and carbon emissions 

//Defining Global Variables
let vehiclesInUse;
let vehicleEfficiency;
let emissionsPerMile;
let totalPollution;

//Create the Green Initiative Class
class GreenInitiative {
    constructor(vehiclesInUse, vehicleEfficiency, emissionsPerMile, totalPollution) {
        //Defining instance variables
        this.vehiclesInUse = vehiclesInUse;
        this.vehicleEfficiency = vehicleEfficiency;
        this.emissionsPerMile = emissionsPerMile;
        this.totalPollution = totalPollution;
    }
    
    //Calculate total emissions
    calculateEmissions() {
        let totalEmissions = this.vehiclesInUse * this.vehicleEfficiency * this.emissionsPerMile;
        this.totalPollution = totalEmissions;
        console.log(`Total emissions: ${this.totalPollution}`);
    }
    
    //Push for green car policies
    pushForGreenPolicies() {
        let greenCarIncentives = this.totalPollution * 0.1;
        console.log(`Allocating ${greenCarIncentives} to green car policies.`)
    }
}

//Instantiate the Green Initiative
let greenInitiative = new GreenInitiative(20, 35, 0.2, 0);

//Calling the Green Initiative Methods
greenInitiative.calculateEmissions();
greenInitiative.pushForGreenPolicies();

//Create function to reduce emissions
function reduceEmissions(idlingTime) {
    let emissionsReduction = idlingTime * 0.05;
    console.log(`Reducing emissions by ${emissionsReduction}.`);
}

//Invoke the reduceEmissions() function
reduceEmissions(3);

//Create function to promote awareness
function promoteAwareness(route) {
    let message = `Remember to take the most eco-friendly route when driving on ${route}.`;
    console.log(message);
}

//Invoke the promoteAwareness() function
promoteAwareness('Highway 101');

//Create function to introduce a hybrid option
function introduceHybrid(price) {
    console.log(`Introducing a new Hybrid model for ${price} dollars.`);
}

//Invoke the introduceHybrid() function
introduceHybrid(25000);

//Create function to incentivize green car purchases
function incentivizeGreenCars(taxCredit) {
    let incentiveMessage = `Provide a tax credit of ${taxCredit} dollars for green car purchases.`;
    console.log(incentiveMessage);
}

//Invoke the incentivizeGreenCars() function
incentivizeGreenCars(1000);

//Create an updateEmissions() function
function updateEmissions(updatedEmissions) {
    let newEmissions = updatedEmissions * 0.5;
    console.log(`Reducing emissions by ${newEmissions}.`)
}

//Invoke the updateEmissions() function
updateEmissions(greenInitiative.totalPollution);