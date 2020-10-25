
window.onload = alert("You awaken in a grassy field, ringed by a forest. In the far, far distance, you see mountains. \
You are not sure where you are, or how you got there, but you know you need to get out of the wilderness.");

let countStepVert = 0;

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

    if (Math.abs(countStepVert) > 2 || Math.abs(countStepHor) > 2) {
        alert("You emerge from the field, into a forest.");
        changeToForest()
        countStepVert = 0;
        countStepHor = 0;
    }
}
/*function changeToForest(){
   prettyStuff.body.style.backgroundImage = 'Forest.jpg';
}*/