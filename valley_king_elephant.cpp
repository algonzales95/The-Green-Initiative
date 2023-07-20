#include <iostream>
#include <string>

// This program is part of The Green Initiative, it is designed to help reduce everyone's waste, and make sure that we are all recycling and using sustainable products.

// Variables for Waste Reduction
int plasticBottles = 0;
int plasticContainers = 0;
int paperWaste = 0;
int glassWaste = 0;
int cardboardWaste = 0;
int aluminumWaste = 0;
int compostWaste = 0;

// Variables for Sustainable Products
int reusableBags = 0;
int refillableProducts = 0;
int clothRags = 0;
int reusableFoodContainers = 0;
int reusableToGoContainers = 0;
int sustainablePaperProducts = 0;
int reusableWaterBottles = 0;

// Variables for Recycling
int recyclablePaper = 0;
int recyclableGlass = 0;
int recyclablePlastic = 0;
int recyclableAluminum = 0;
int recyclableCardboard = 0;

// Function to Gather Waste Reduction Stats
void getWasteReductionStats()
{
	std::cout << "How many plastic bottles and containers do you have to recycle? ";
	std::cin >> plasticBottles;
	plasticContainers = plasticBottles;
	
	std::cout << "How much paper waste do you have to recycle? ";
	std::cin >> paperWaste;
	
	std::cout << "How much glass waste do you have to recycle? ";
	std::cin >> glassWaste;

	std::cout << "How much cardboard do you have to recycle? ";
	std::cin >> cardboardWaste;
	
	std::cout << "How much aluminum do you have to recycle? ";
	std::cin >> aluminumWaste;
	
	std::cout << "How much compostable waste do you have to dispose of? ";
	std::cin >> compostWaste;
}

// Function to Gather Sustainable Product Stats
void getSustainableProductStats()
{
	std::cout << "How many reusable bags do you use? ";
	std::cin >> reusableBags;
	
	std::cout << "How many refillable products do you use? ";
	std::cin >> refillableProducts;
	
	std::cout << "How many cloth rags do you use? ";
	std::cin >> clothRags;
	
	std::cout << "How many reusable food containers do you use? ";
	std::cin >> reusableFoodContainers;
	
	std::cout << "How many reusable to-go containers do you own? ";
	std::cin >> reusableToGoContainers;
	
	std::cout << "How many sustainable paper products do you use? ";
	std::cin >> sustainablePaperProducts;
	
	std::cout << "How many reusable water bottles do you use? ";
	std::cin >> reusableWaterBottles;
}

// Function to Gather Recycling Stats
void getRecyclingStats()
{	
	std::cout << "How much paper do you have to recycle? ";
	std::cin >> recyclablePaper;
	
	std::cout << "How much glass do you have to recycle? "; 
	std::cin >> recyclableGlass;
	
	std::cout << "How much plastic do you have to recycle? ";
	std::cin >> recyclablePlastic;
	
	std::cout << "How much aluminum cans do you have to recycle? ";
	std::cin >> recyclableAluminum;
	
	std::cout << "How much cardboard do you have to recycle? ";
	std::cin >> recyclableCardboard;
}

// Summary Function
void printSummary() 
{
	int totalWasteReduction = plasticBottles + plasticContainers + paperWaste + glassWaste + cardboardWaste + aluminumWaste + compostWaste;
	int totalSustainableProducts = reusableBags + refillableProducts + clothRags + reusableFoodContainers + reusableToGoContainers + sustainablePaperProducts + reusableWaterBottles;
	int totalRecycling = recyclablePaper + recyclableGlass + recyclablePlastic + recyclableAluminum + recyclableCardboard;
	
	std::cout << "You have recycled or reused a total of " << totalWasteReduction << " items since joining The Green Initiative.\n";
	std::cout << "You have purchased " << totalSustainableProducts << " sustainable products since joining The Green Initiative.\n";
	std::cout << "You have recycled a total of " << totalRecycling << " items since joining The Green Initiative.\n";
}

// Main Function
int main()
{
	std::cout << "Welcome to The Green Initiative!\n";
	
	// Get Information
	getWasteReductionStats();
	getSustainableProductStats();
	getRecyclingStats();
	
	// Print Summary
	printSummary();
	
	return 0;
}