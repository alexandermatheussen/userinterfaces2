import $ from 'jquery';
import * as grts from './js/greeting';

import 'bootstrap/dist/css/bootstrap.css';

$("h1").click(event => {
    console.log("Hello, H1!");
    grts.greeting();
});
