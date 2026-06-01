const events = [];

function addEvent(name, category) {
    events.push({ name, category });
}

function registerUser(eventName) {
    console.log(`User registered for ${eventName}`);
}

function filterEventsByCategory(category, callback) {
    const filteredEvents = events.filter(
        event => event.category === category
    );

    callback(filteredEvents);
}

function registrationTracker() {

    let totalRegistrations = 0;

    return function () {
        totalRegistrations++;
        return totalRegistrations;
    };
}

const musicRegistrations = registrationTracker();

addEvent("Music Festival", "Music");
addEvent("Food Fair", "Food");
addEvent("Rock Concert", "Music");

registerUser("Music Festival");

console.log("Music Registrations:", musicRegistrations());
console.log("Music Registrations:", musicRegistrations());

filterEventsByCategory("Music", function (events) {

    const output = document.getElementById("output");

    events.forEach(event => {
        output.innerHTML += `<p>${event.name}</p>`;
    });

});