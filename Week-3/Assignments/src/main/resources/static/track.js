const xhr = new XMLHttpRequest();

let text = document.getElementsByTagName("p")[0];

let cookie = document.cookie;

if( document.getElementsByTagName("button")[0] != null ) {
    document.getElementsByTagName("button")[0].addEventListener('click', trackName);
} else {
    text.innerHTML = `<p>cookie為: ${document.cookie}</p>`;
}

function trackName() {

    let name = document.getElementsByTagName("input")[0].value;
    let html = `http://localhost:3000/trackName?name=${name}`;

    xhr.open("GET", html);

    xhr.send();

    xhr.onreadystatechange = function() {
        if (xhr.readyState === 4 && xhr.status === 200) {

            document.cookie = `username=${name}`;
            // text.innerHTML = `<p>cookie為: ${document.cookie}</p>`;
            document.location.href = 'http://localhost:3000/myName';

        } else {

            console.log("error" + xhr.readyState);

        }
    }
}