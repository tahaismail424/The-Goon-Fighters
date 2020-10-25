window.onload=displayOpeningMessage()

displayOpeningMessage{
    alert("You awaken in a grassy field, ringed by a forest. In the far, far distance, you see mountains. \
    You aren’t sure where you are, or how you got there, but you know you need to get out of the wilderness.")
}
var countStepVert=0;
var countStepHor=0;
function eastButtonClick() {
    alert ("Move East");
    countStepHor++;
}
function westButtonClick() {
    alert ("Move West")
    countStepHor--;
}
function northButtonClick(){
    alert ("Move North")
    countStepVert++;
}
function southButtonClick(){
    alert ("Move South")
    countStepVert--;
}
if (Math.abs(countStepVert)>2){
    alert()
}