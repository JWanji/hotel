
let cityImages = {
    'New York': '../images/newyork.jpeg',
    'Washington DC': '../images/washingtonDC.jpeg',
    'Chicago': '../images/chicago.jpeg',
    'New Jersey': '../images/chicago.jpeg',
    'Staton Island': '../images/statonIsland.jpeg',

}

fetch('http://localhost:8080/hotel/locations')
    .then(response => response.text())
    .then(data => {
        console.log(data)
        data=JSON.parse(data)
        for (var i = 0; i < data.length; i++) {
            console.log(data[i])
            $('.locations').append(`<div class='loc-container'>
            <img src = ${cityImages[data[i]]} class = "loc-images"  alt= \'${data[i]}\' width="500px" height="300px"/>
            <button value = "${data[i]}" class="location-btn">${data[i]}</button>
            </div>`)            
        }
        let locationBtns = document.querySelectorAll('.location-btn');
        locationBtns.forEach(btn => {
            btn.addEventListener('click', event=> {
                console.log(event.target.value);
                localStorage.setItem("city", event.target.value);
                window.location.href = `http://localhost:8080/html/hotel.html`
            } )
        })
            
        
});
        