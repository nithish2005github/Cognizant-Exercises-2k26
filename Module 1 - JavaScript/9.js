const eventsDiv = document.getElementById("events");
const loading = document.getElementById("loading");

function fetchEvents() {

    fetch("https://jsonplaceholder.typicode.com/users")

        .then(response => response.json())

        .then(data => {

            loading.style.display = "none";

            data.slice(0, 5).forEach(event => {

                eventsDiv.innerHTML += `
                    <p>${event.name}</p>
                `;
            });
        })

        .catch(error => {
            console.log(error);
        });
}

async function fetchEventsAsync() {

    try {

        loading.style.display = "block";

        const response =
            await fetch("https://jsonplaceholder.typicode.com/users");

        const data = await response.json();

        loading.style.display = "none";

        eventsDiv.innerHTML = "";

        data.slice(0, 5).forEach(event => {

            eventsDiv.innerHTML += `
                <p>${event.name}</p>
            `;
        });

    } catch (error) {

        console.log(error);

    }
}

fetchEventsAsync();