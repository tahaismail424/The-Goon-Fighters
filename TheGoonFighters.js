
window.onload = alert("You awaken in a grassy field, ringed by a forest. In the far, far distance, you see mountains. \
You are not sure where you are, or how you got there, but you know you need to get out of the wilderness.");

let countStepVert = 0;
let scene = 0;

let countStepHor = 0;
function eastButtonClick() {
    alert ("Move East");
    countStepHor++;
    checkBounds();
}
function westButtonClick() {
    alert ("Move West");
    countStepHor--;
    checkBounds();
}
function northButtonClick() {
    alert ("Move North");
    countStepVert++;
    checkBounds();
   
    }
function southButtonClick(){
    alert ("Move South");
    countStepVert--;
    checkBounds();
}


function checkBounds() {

    if ((Math.abs(countStepVert) > 2 || Math.abs(countStepHor) > 2) && scene == 0) {
        alert("You emerge from the field, into a forest.");
        scene++;
        my_function(scene);
    }
    else if ((Math.abs(countStepVert) <= 2 && Math.abs(countStepHor) <= 2) && scene == 1) {
        alert("You return back to the field from the forest.");
        scene--;
        my_function(scene);
    }
    else if ((Math.abs(countStepVert) > 5 || Math.abs(countStepHor) > 5 ) && scene == 1) {
        alert("You cross the bridge, away from the forest and into the mountains.");
        scene++;
        my_function(scene);

    }
    else if ((Math.abs(countStepVert) <= 5 && Math.abs(countStepHor) <= 5 ) && scene == 2) {
        alert("You cross back over the bridge, into the forest.");
        scene--;
        my_function(scene);

    }
}
/*
function changeToForest(){
   prettyStuff.getElementById('page_body').className = "forest.png";
}


var background = $('body');

       var backgrounds = new Array(
        'url(img/fields.jpg)',
        'url(img/forest.png)',
        'url(img/mountain.jpg)'
    );

    var current = 0;
    function nextBackground(){
        current++;
        current = current % backgrounds.length;
        background.css('background-image', backgrounds[current]);
    }

    background.css('background-image', backgrounds[0]);

$(function() {
    

});
*/
