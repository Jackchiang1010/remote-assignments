const xhr = new XMLHttpRequest();

function callSum() {

    let number = document.getElementsByTagName("input")[0].value;
    let html = `http://localhost:3000/data?number=${number}`;
    console.log(html);

    xhr.open("GET", html);

    xhr.send();

    let text = document.getElementsByTagName("p")[0];
    xhr.onreadystatechange = function() {
        if (xhr.readyState === 4) {
            text.innerHTML = `<p>計算總和為: ${xhr.responseText}</p>`;
        }
    }
}

