function Event(name, seats) {
    this.name = name;
    this.seats = seats;
}

Event.prototype.checkAvailability = function () {
    return this.seats > 0 ? "Seats Available" : "House Full";
};

const event1 = new Event("Music Festival", 25);
const event2 = new Event("Food Fair", 0);

const output = document.getElementById("output");

[event1, event2].forEach(event => {

    output.innerHTML += `
        <p>${event.name} - ${event.checkAvailability()}</p>
    `;

    Object.entries(event).forEach(([key, value]) => {
        console.log(`${key}: ${value}`);
    });

});