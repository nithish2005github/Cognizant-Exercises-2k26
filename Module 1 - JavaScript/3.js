const events = [
    { name: "Music Festival", seats: 20, upcoming: true },
    { name: "Food Fair", seats: 0, upcoming: true },
    { name: "Sports Meet", seats: 15, upcoming: true },
    { name: "Old Workshop", seats: 10, upcoming: false }
];

const eventList = document.getElementById("eventList");

events.forEach(event => {

    if (event.upcoming && event.seats > 0) {
        eventList.innerHTML +=
            `<p>${event.name} - Seats Available: ${event.seats}</p>`;
    }

});

function registerEvent(eventName) {

    try {

        const event = events.find(e => e.name === eventName);

        if (!event) {
            throw new Error("Event not found");
        }

        if (event.seats <= 0) {
            throw new Error("No seats available");
        }

        event.seats--;

        console.log(
            `${eventName} registered successfully. Remaining Seats: ${event.seats}`
        );

    } catch (error) {

        console.log("Registration Error:", error.message);

    }
}

registerEvent("Music Festival");
registerEvent("Food Fair");