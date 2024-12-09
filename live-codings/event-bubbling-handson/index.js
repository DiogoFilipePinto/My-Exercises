window.addEventListener('load', () => {

    const child = document.querySelector('#child');
    handleEvent(child, 'lightgreen');

    const parent = document.querySelector('#parent');
    handleEvent(parent, 'lightcoral');

    const grandparent = document.querySelector('#grandparent');
    handleEvent(grandparent, 'lightblue');



})
function handleEvent(div, color) {
    div.addEventListener('click', clickEvent);
}

function clickEvent(event) {

    event.stopPropagation();
    console.log(event);
    console.log(`${div.id} Clicked`);
    div.style.backgroundColor = color;
}