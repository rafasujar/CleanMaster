let navbar = document.querySelector('img#navbar');
let nav =  document.querySelector('nav');
let close = document.querySelector('img#close');
navbar.addEventListener('click', () => {
    navbar.style.display = 'none';
    nav.style.display = 'flex';
});

close.addEventListener('click', () => {
    nav.style.display = 'none';
    navbar.style.display = 'block';
});