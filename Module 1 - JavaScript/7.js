const events = [
    { name: "Music Festival", seats: 20 },
    { name: "Food Fair", seats: 15 },
    { name: "Sports Meet", seats: 10 }
];

const container = document.querySelector("#eventContainer");

events.forEach(event => {

    const card = document.createElement("div");

    card.innerHTML = `
        <h3>${event.name}</h3>
        <p>Seats: <span>${event.seats}</span></p>
        <button>Register</button>
        <button>Cancel</button>
    `;

    const registerBtn = card.children[2];
    const cancelBtn = card.children[3];
    const seatDisplay = card.querySelector("span");

    registerBtn.onclick = function () {
        if (event.seats > 0) {
            event.seats--;
            seatDisplay.textContent = event.seats;
        }
    };

    cancelBtn.onclick = function () {
        event.seats++;
        seatDisplay.textContent = event.seats;
    };

    container.appendChild(card);

});