const eventName = "Music Festival";
const eventDate = "10 June 2026";

let availableSeats = 50;

let eventInfo =
`${eventName} is scheduled on ${eventDate}. Available Seats: ${availableSeats}`;

document.getElementById("eventInfo").innerHTML = eventInfo;

availableSeats--;

console.log("Seats Remaining:", availableSeats);