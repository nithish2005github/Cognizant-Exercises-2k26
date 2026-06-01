$(document).ready(function () {

    $("#registerBtn").click(function () {

        alert("Registration Successful");

    });

    $("#showBtn").click(function () {

        $("#eventCard").fadeIn();

    });

    $("#hideBtn").click(function () {

        $("#eventCard").fadeOut();

    });

    $("#framework").text(
        "React and Vue help build reusable components and improve maintainability."
    );

});