const form = document.getElementById("registrationForm");

form.addEventListener("submit", function(event){

    event.preventDefault();

    console.log("Form submission started");

    const name =
        document.getElementById("name").value;

    console.log("Name:", name);

    const payload = {
        name: name,
        event: "Music Festival"
    };

    console.log("Payload:", payload);

    fetch("https://jsonplaceholder.typicode.com/posts", {

        method: "POST",

        headers: {
            "Content-Type": "application/json"
        },

        body: JSON.stringify(payload)

    })

    .then(response => response.json())

    .then(data => {

        console.log("Response:", data);

        alert("Registration Successful");

    })

    .catch(error => {

        console.log("Error:", error);

    });

});