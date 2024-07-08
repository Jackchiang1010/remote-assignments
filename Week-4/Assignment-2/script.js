function ajax(src, callback) {
    // your code here
    var xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function() {
        if(xhr.readyState === 4 && xhr.status === 200) {
            callback(xhr.response);
        }
    }
    xhr.open('GET', src);
    xhr.send();
}
function render(data) {
    // your code here
    // document.createElement() and appendChild() methods are preferred.
    let jsonData = JSON.parse(data);
    for( let i = 0; i < jsonData.length; i++ ) {

        let keyName = Object.keys(jsonData[i]);
        let liText='';

        let ul = document.createElement('ul');

        document.getElementsByTagName('main')[0].appendChild(ul);

        for( let j = 0; j < keyName.length; j++ ) {
            liText = `${keyName[j]}: ${jsonData[i][keyName[j]]} `;

            let li = document.createElement('li');
            li.textContent = liText;

            document.getElementsByTagName('ul')[i].appendChild(li);
        }
        
       
    }
}
ajax(
    'https://remote-assignment.s3.ap-northeast-1.amazonaws.com/products',
    function (response) {
        render(response);
    }
); // you should get product information in JSON format and render data in the page