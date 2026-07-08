function submitForm(event){

    // Stop page refresh
    event.preventDefault();

    // Show popup
    document.getElementById("popup").style.display = "block";

}

function closePopup(){

    // Hide popup
    document.getElementById("popup").style.display = "none";

}