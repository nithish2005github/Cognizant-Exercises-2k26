const events = [
    { name: "Music Festival", category: "Music" },
    { name: "Rock Concert", category: "Music" },
    { name: "Food Fair", category: "Food" }
];

const eventsDiv = document.getElementById("events");
const category = document.getElementById("category");
const search = document.getElementById("search");

function displayEvents(list) {

    eventsDiv.innerHTML = "";

    list.forEach(event => {

        const card = document.createElement("div");

        card.innerHTML = `
            <p>${event.name}</p>
            <button onclick="registerEvent('${event.name}')">
                Register
            </button>
        `;

        eventsDiv.appendChild(card);
    });
}

function registerEvent(eventName) {
    alert(`Registered for ${eventName}`);
}

category.onchange = function () {

    const filtered =
        category.value === "All"
        ? events
        : events.filter(
            event => event.category === category.value
        );

    displayEvents(filtered);
};

search.addEventListener("keydown", function () {

    const filtered = events.filter(event =>
        event.name.toLowerCase()
        .includes(search.value.toLowerCase())
    );

    displayEvents(filtered);
});

displayEvents(events);