-- The Green Initiative --
-- 2000 lines of code --

--[[
This program is designed to help raise awareness and provide resources to help people reduce their carbon footprints. 
It will do this by providing information about environmental topics, tips for reducing emissions, and suggestions for 
making lifestyle changes that can make a real difference.
]]

-- Variables
-- Variables to be used store data, such as user input
local currentEmissions;
local currentConsumption; 
local stepsToReduceEmissions;

-- Functions
-- Functions to be used in the program, such as accessing user data
function getUserData()
	-- Prompt user for input
	print("Enter your current emissions: ")
	currentEmissions = io.read()
	
	print("Enter your current consumption: ")
	currentConsumption = io.read()
	
	print("What are some steps you can take to reduce your emissions? (Separate with commas): ")
	stepsToReduceEmissions = io.read();
end

function showEnvironmentalTips()
	-- Print environmental tips 
	print("Here are some tips on reducing your carbon footprint:")
	print("1. Recycle and reduce the amount of waste you create.")
	print("2. Reduce energy consumption by turning off appliances when not in use.")
	print("3. Choose environmentally friendly products.")
	print("4. Use renewable energy sources like solar and wind.")
	print("5. Plant trees.")
	print("6. Consume less meat and dairy.")
	print("7. Cut down on water consumption.")
end

function showUserData()
	-- Print user data
	print("You entered the following data:")
	print("Current emissions: " .. currentEmissions)
	print("Current consumption: " .. currentConsumption)
	print("Steps to reduce emissions: " .. stepsToReduceEmissions)
end

-- Main
-- Main function to be called at the start of the program
function main()
	-- Call getUserData function
	getUserData()

	-- Call showEnvironmentalTips function
	showEnvironmentalTips()

	-- Call showUserData function
	showUserData()
end

-- Run program
main()