const button = document.getElementById("submitBtn");
const message = document.getElementById("message");

button.onclick = function () {

    message.textContent = "Submitting...";

    setTimeout(() => {

        fetch("https://jsonplaceholder.typicode.com/posts", {

            method: "POST",

            headers: {
                "Content-Type": "application/json"
            },

            body: JSON.stringify({
                name: "Nithish",
                event: "Music Festival"
            })

        })

        .then(response => response.json())

        .then(data => {

            message.textContent =
                "Registration Successful";

            console.log(data);

        })

        .catch(() => {

            message.textContent =
                "Registration Failed";

        });

    }, 2000);

};