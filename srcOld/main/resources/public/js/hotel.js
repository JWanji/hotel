let city = localStorage.getItem('city')
console.log(city);

fetch(`http://localhost:8080/hotel/hotel/${city}`)
    .then(response => response.text())
    .then(data => {
        data=JSON.parse(data)
        console.log(data)
        console.log(`${data["imageLink"]}`)
        document.querySelector('.hotel-welcome').textContent = `Book your room now at ${data["hotelName"]}`;
        $('.hotel-container').append(`
        
        <img src="${data["imageLink"]}" class="hotel-img" alt="${data["location"]["locationName"]}" width="60%" />
        <div class="facilities">
        <ul>
            <li>&#10004; Free wireless internet access</li>
            <li>&#10004; Car Parking</li>
            <li>&#10004; Swimming Pool/ Jacuzzi</li>
            <li>&#10004; 24 Hours Security</li>
            <li>&#10004; 24-Hour room service</li>
            <li>&#10004; Pool side Bar</li>
            <li>&#10004; Spa</li>
            <li>&#10004; Gift Shop</li>
            <li>&#10004; Laundry service</li>
            <li>&#10004; Meeting facilities</li>
            
        </ul>
        <button value="${city}" class="hotel-btn">Book Now</button>
        </div>
        
        `)
    })