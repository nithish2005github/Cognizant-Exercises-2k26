const events = [
    {
        name: "Music Festival",
        category: "Music",
        seats: 20
    },
    {
        name: "Food Fair",
        category: "Food",
        seats: 15
    }
];

function displayEvent(eventName = "Unknown Event") {
    return eventName;
}

const clonedEvents = [...events];

const output = document.getElementById("output");

clonedEvents.forEach(event => {

    const { name, category, seats } = event;

    output.innerHTML += `
        <p>
            Event: ${displayEvent(name)}
            <br>
            Category: ${category}
            <br>
            Seats: ${seats}
        </p>
    `;

});

const musicEvents = clonedEvents.filter(
    event => event.category === "Music"
);

console.log(musicEvents);