import $ from 'jquery';
import * as grts from './js/greeting';  // optional: "".js" extension
// Moet beginnen met ./ (relatief pad, NIET in node_modules)

$("h1").click(function() {
    console.log("Hello, H1!");
    grts.greeting();
});
