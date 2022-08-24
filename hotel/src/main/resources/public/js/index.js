let searchBtn = document.querySelector('.search-btn');
searchBtn.addEventListener('click', function (e) {
    e.preventDefault();
    let loc = document.querySelector('#hotel-locations');
    if(loc.value=='choose'){
        alert("Kindly select a valid city!")
        return;
    }
        
    localStorage.setItem("city", loc.value);
    window.location.href = `http://localhost:8080/html/hotel.html`
})

