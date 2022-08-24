const submitForm = document.querySelector('#submit-form');

function submitContactForm(e) {

    e.preventDefault();
    const fName = document.getElementById('fname').value;
    const lName = document.querySelector('#lname').value;
    const sub = document.querySelector('#subject').value;
    const msg = document.querySelector('#message').value || '';
    if (!fName || !lName || !sub) {
        console.log(fName)
        console.log(lName)
        console.log(sub)
        alert("Please enter mandatory fields!")
    } else {
        fetch(`http://localhost:8080/hotel/feedback`, {
            method: "POST",
            body: JSON.stringify({
                "firstName": `${fName}`,
                "lastName": `${lName}`,
                "subject": `${sub}`,
                "message": `${msg}`
            }),
            headers: {
                "Content-type": "application/json; charset=UTF-8"
            }
        })
            .then(response => response.json())
            .then(json => console.log(json));

            alert(`Hi ${fName}!\nThanks for contacting us. We'll get back to you soon!`)
        }
    }
    


submitForm.addEventListener('click', submitContactForm)
