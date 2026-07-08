const firstName = document.getElementById("fname");
const lastName = document.getElementById("lname");
const contact = document.getElementById("contact");
const email = document.getElementById("email");
const address = document.getElementById("address");
const button = document.querySelector("button");

button.addEventListener("click", function () {

    if (firstName.value === "") {
        alert("Please enter your first name.");
        return;
    }

    if (lastName.value === "") {
        alert("Please enter your last name.");
        return;
    }

    if (contact.value === "") {
        alert("Please enter your contact number.");
        return;
    }

    if (email.value === "") {
        alert("Please enter your email.");
        return;
    }

    if (address.value === "") {
        alert("Please enter your address.");
        return;
    }

    alert("Signup Successful!");
});