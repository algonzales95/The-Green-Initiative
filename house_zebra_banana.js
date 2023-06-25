//Objective: To create a website for The Green Initiative to inform and educate people about the importance of green initiatives 

//The following 2000 lines of code is for a website about The Green Initiative

//Index file code
<!DOCTYPE html>
<html>
<head>
<title>The Green Initiative</title>
</head>
<body>
<h1>Welcome to The Green Initiative</h1>
<p>This website is dedicated to helping people understand the importance of green initiatives and how we can all contribute to make a difference.</p>

<script src="scripts/greenInitiative.js"></script>
</body>
</html>

//Script file code
//Function to generate a random green tip
function generateRandomTip() {
    let tips = [
        "Start composting!",
        "Let your grass grow longer to help combat global warming.",
        "Invest in eco-friendly appliances.",
        "Do an energy audit of your home.",
        "Recycle, reduce, and reuse!",
        "Plant a tree!",
        "Switch to LED lightbulbs.",
        "Start using reusable bags.",
        "Think before you throw away something that could be reused in some way.",
        "Purchase organic foods.",
        "Reduce your water waste by taking shorter showers.",
        "Support local farmers.",
        "Buy from eco-friendly companies.",
        "Choose paperless billing.",
        "Avoid buying products with excess packaging.",
        "Give up driving your car for a day each week.",
        "Support green energy initiatives.",
        "Cut down on your use of air conditioning.",
        "Carpool or use public transportation.",
        "Ditch fast fashion in favor of sustainable fashion.",
        "Do not use disposable items like straws and plates.",
        "Purchase energy-efficient electronics.",
        "Try to use natural materials for your home and office decorations."
    ];

    let randomItem = Math.floor(Math.random() * (tips.length - 1));
    return tips[randomItem];
}

//Function to generate a random green fact
function generateRandomFact() {
    let facts = [
        "According to the EPA, the average American produces about 4.4 pounds of solid waste each day.",
        "The energy we save from recycling one glass bottle can power a computer for 25 minutes.",
        "If all the cars in the US were electric, the impact on climate change would be equal to taking 158 million cars off the road.",
        "The average person produces about 4.4 pounds of solid waste each day.",
        "Over 95% of what we throw away can be recycled.",
        "An estimated one trillion single-use plastic bags are used worldwide each year.",
        "Every year 8 million tons of plastic is dumped into our oceans.",
        "It takes 500-1000 years for plastic to break down.",
        "The world’s soil is being depleted of organic matter at a rate 10 times faster than it can be replenished.",
        "The average American wastes about 185 pounds of food every year.",
        "Pesticides used in conventional farming kills birds, butterflies, fish, and other creatures.",
        "Every year, Americans use 2.5 million plastic bottles every hour.",
        "Eliminating just one car would save 2.4 tons of carbon dioxide from being released into the atmosphere each year.",
        "More than 50 percent of the world’s forests have been destroyed since 1700.",
        "The burning of fossil fuels is the leading cause of climate change.",
        "The amount of carbon dioxide in our atmosphere has increased by 40% since pre-industrial times.",
        "If everyone on earth planted a tree, the amount of carbon dioxide in the atmosphere would be reduced by 25 percent.",
        "The typical American home produces twice as much greenhouse gas as the typical car."
    ];

    let randomItem = Math.floor(Math.random() * (facts.length - 1));
    return facts[randomItem];
}

//Function to generate a random green quote
function generateRandomQuote() {
    let quotes = [
        "“The environment is where we all meet; where all have a mutual interest; it is the one thing all of us share.” – Lady Bird Johnson",
        "“Nature provides a free lunch, but only if we control our appetites.” – William Ruckelshaus",
        "“The environment is where we all meet; where all have a mutual interest; it is the one thing all of us share.” – Lady Bird Johnson",
        "“The Earth is what we all have in common.” – Wendell Berry",
        "“The environment is not a luxury, it is a necessity.” – Adrian Grenier",
        "“The environment is where we all meet; where all have a mutual interest; it is the one thing all of us share.” – Lady Bird Johnson",
        "“It is our collective and individual responsibility…to preserve and tend to the world in which we all live.” – Dalai Lama",
        "“We do not inherit the earth from our ancestors, we borrow it from our children.” – Native American Proverb",
        "“A nation that destroys its soils destroys itself. Forests are the lungs of our land, purifying the air and giving fresh strength to our people.” – Franklin D. Roosevelt",
        "“Earth provides enough to satisfy every man’s need, but not every man’s greed.” – Mahatma Gandhi",
        "“The environment is where we all meet; where all have a mutual interest; it is the one thing all of us share.” – Lady Bird Johnson",
        "“The environment is not a luxury, it is a necessity.” – Adrian Grenier",
        "“Change is the law of life. And those who look only to the past or present are certain to miss the future.” – John F. Kennedy",
        "“The environment is where we all meet; where all have a mutual interest; it is the one thing all of us share.” – Lady Bird Johnson",
        "“I only feel angry when I see waste. When I see people throwing away things we could use.” – Mother Teresa",
        "“The environment is not a luxury, it is a necessity.” – Adrian Grenier",
        "“Do something. Even if it’s wrong, do something.” – Greta Thunberg",
        "“The environment is where we all meet; where all have a mutual interest; it is the one thing all of us share.” – Lady Bird Johnson",
        "“Our entire life is just a moment in time, and a small part of the world. What we do in this moment, will echo in eternity.” – Sylvia Earle"
    ];

    let randomItem = Math.floor(Math.random() * (quotes.length - 1));
    return quotes[randomItem];
}

//Function to generate a random green resource
function generateRandomResource() {
    let resources = [
        {
            title: "Greenpeace",
            link: "https://www.greenpeace.org/usa/",
            description: "Greenpeace is a global environmental organization that works to preserve and protect the environment and our planet."
        },
        {
            title: "The Nature Conservancy",
            link: "https://www.nature.org/",
            description: "The Nature Conservancy is a global organization dedicated to protecting and preserving the world's environment."
        },
        {
            title: "The Ocean Cleanup",
            link: "https://www.theoceancleanup.com/",
            description: "The Ocean Cleanup is a non-profit organization that works to clean up the world's oceans and reduce plastic pollution."
        },
        {
            title: "The Conservation Fund",
            link: "https://www.conservationfund.org/",
            description: "The Conservation Fund is a non-profit organization dedicated to conserving natural resources for future generations."
        },
        {
            title: "350.org",
            link: "https://350.org/",
            description: "350.org is a global environmental organization that works to address climate change by pushing for renewable energy sources."
        },
        {
            title: "Rainforest Alliance",
            link: "https://www.rainforest-alliance.org/",
            description: "Rainforest Alliance is an organization that works to protect rainforests and conserve biodiversity by supporting sustainable agriculture and forestry activities."
        },
        {
            title: "The Climate Reality Project",
            link: "https://www.climaterealityproject.org/",
            description: "The Climate Reality Project is a global organization founded by Al Gore that works to educate people on climate change and provide solutions for reducing emissions."
        }
    ];

    let randomItem = Math.floor(Math.random() * (resources.length - 1));
    return resources[randomItem];
}

//Function to generate random content for the website
function generateRandomContent() {
    let content = [
        {
            type: "tip",
            content: generateRandomTip()
        },
        {
            type: "fact",
            content: generateRandomFact()
        },
        {
            type: "quote",
            content: generateRandomQuote()
        },
        {
            type: "resource",
            content: generateRandomResource()
        }
    ];

    let randomItem = Math.floor(Math.random() * (content.length - 1));
    return content[randomItem];
}

//Function to render content to the page
function renderContent() {
    let content = generateRandomContent();

    if (content.type === "tip") {
        let tipEl = document.createElement("p");
        tipEl.innerText = content.content;
        document.body.appendChild(tipEl);
    }

    if (content.type === "fact") {
        let factEl = document.createElement("p");
        factEl.innerText = content.content;
        document.body.appendChild(factEl);
    }

    if (content.type === "quote") {
        let quoteEl = document.createElement("p");
        quoteEl.innerText = content.content;
        document.body.appendChild(quoteEl);
    }

    if (content.type === "resource") {
        let resourceEl = document.createElement("a");

        let titleEl = document.createElement("h3");
        titleEl.innerText = content.content.title;
        resourceEl.appendChild(titleEl);

        let descriptionEl = document.createElement("p");
        descriptionEl.innerText = content.content.description;
        resourceEl.appendChild(descriptionEl);

        resourceEl.href = content.content.link;
        document.body.appendChild(resourceEl);
    }
}

//Call renderContent function to render content to the page
renderContent();