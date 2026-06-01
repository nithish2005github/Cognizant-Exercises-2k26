const events = [
    "Music Festival",
    "Food Fair",
    "Sports Meet"
];

events.push("Workshop on Baking");

const musicEvents = events.filter(
    event => event.toLowerCase().includes("music")
);

const formattedEvents = events.map(
    event => `<p>${event}</p>`
);

document.getElementById("output").innerHTML =
    formattedEvents.join("");

console.log("Music Events:", musicEvents);