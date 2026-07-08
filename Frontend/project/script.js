function showPopup() {
    const modal = document.getElementById('popup-modal');
    modal.classList.remove('hidden');
}

document.getElementById('close-popup').addEventListener('click', function() {
    const modal = document.getElementById('popup-modal');
    modal.classList.add('hidden');
});

document.getElementById('rec-form').addEventListener('submit', function(event) {
  
    event.preventDefault();

    const name = document.getElementById('rec-name').value;
    const text = document.getElementById('rec-text').value;

    const list = document.getElementById('recommendation-list');
    const newRec = document.createElement('blockquote');
    newRec.className = 'recommendation';
    newRec.innerHTML = `"${text}" <br><strong>- ${name}</strong>`;

    list.appendChild(newRec);

    document.getElementById('rec-form').reset();

    showPopup();
});