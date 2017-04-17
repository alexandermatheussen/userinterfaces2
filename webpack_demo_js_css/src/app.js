// Javascript imports
import $ from 'jquery';
import * as grts from './js/greeting';

// CSS imports
import './css/style.css';

$("h1").click(function() {
    console.log("Hello, H1!");
    grts.greeting();
});
