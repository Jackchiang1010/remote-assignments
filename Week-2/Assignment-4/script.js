const header = document.getElementsByClassName('main-header');

const box = document.getElementsByClassName('Box');

const button = document.getElementsByTagName('button');

header[0].addEventListener( 'click', () => {
    header[0].innerHTML = '<h1>Have a Good Time!</h1>'

} );

button[0].addEventListener( 'click', () => {
    for( let i = 4; i < 8; i++) {
        box[i].style.display = 'none';
    }
} )