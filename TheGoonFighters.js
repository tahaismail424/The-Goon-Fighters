class MainPlayer {
	health;
	constructor(h) {
		this.health = h;
	}
	getHealth(){
        return this.health;
    }
	heal(h) {
		this.health += h;
	}
	hit(dmg) {
		this.health -= dmg;
	}
}

class ProblemStorage {
	question;
	answer;
	constructor(q, a) {
		this.question = q;
		this.answer = a;
	}
	
	getQ() {
		return this.question;
	}
	getA() {
		return this.answer;
	}
}

class MathEnemy {
	name;
	health;
	func;
	pow;
    time;
    healthfull;
	
	constructor(n, h, f, p, t) {
		this.name = n;
		this.health = h;
		this.func = f;
		this.pow = p;
        this.time = t;
        this.healthfull = this.health;
	}
	
	derivative() {
		var question = "";
		var answer = "";
		var terms = Math.ceil(Math.random() * 4) + 1;
		for(var i = terms - 1; i >= 0; i--) {
			var coeff = Math.ceil(Math.random() * 10);
			if(i > 2) {
				question = question + coeff + "x ^ " + i + " + ";
				answer = answer + (coeff * i) + "x ^ " + (i - 1) + " + ";
			} else if(i == 2) {
				question = question + coeff + "x ^ " + i + " + ";
				answer = answer + (coeff * i) + "x + ";
			} else if(i == 1) {
				question = question + coeff + "x + ";
				answer = answer + coeff;
			} else if(i == 0) {
				question = question + coeff;
			}
		}
		var prob = new ProblemStorage(question, answer);
		return prob;
	}
	
	unitCircle() {
		var question = "";
		var answer = "";
		var func = Math.ceil(Math.random() * 6);
		var numer = Math.ceil(Math.random() * 11);
		var denom = Math.ceil(Math.random() * 5);
		if(denom == 5) {
			denom = 6;
		}
		if(func == 1) {
			question = "sin(" + numer + "pi/" + denom + ")";
			//answer = Double.toString(Math.sin(numer * Math.PI / denom));
			var coeff = numer / denom;
			coeff = coeff % 2;
			if(coeff == (1.0/6.0) || coeff == (5.0/6.0)) {
				answer = "1 / 2";
			} else if(coeff == (7.0/6.0) || coeff == (11.0/6.0)){
				answer = "-1 / 2";
			} else if(coeff == 1.0 || coeff == 0.0) {
				answer = "0";
			} else if(coeff == (1.0/2.0)) {
				answer = "1";
			} else if(coeff == (3.0/2.0)) {
				answer = "-1";
			} else if(coeff == (1.0/4.0) || coeff == (3.0/4.0)) {
				answer = "sqrt2 / 2";
			} else if(coeff == (1.0/3.0) || coeff == (2.0/3.0)) {
				answer = "sqrt3 / 2";
			} else if(coeff == (5.0/4.0) || coeff == (7.0/4.0)) {
				answer = "-sqrt2 / 2";
			} else if(coeff == (4.0/3.0) || coeff == (5.0/3.0)) {
				answer = "-sqrt3 / 2";
			}
		} else if(func == 2) {
			question = "cos(" + numer + "pi/" + denom + ")";
			//answer = Double.toString(Math.cos(numer * Math.PI / denom));
			var coeff = numer / denom;
			coeff = coeff % 2;
			if(coeff == (1.0/3.0) || coeff == (5.0/3.0)) {
				answer = "1 / 2";
			} else if(coeff == (2.0/3.0) || coeff == (4.0/3.0)){
				answer = "-1 / 2";
			} else if(coeff == (1.0/2.0) || coeff == (3.0/2.0)) {
				answer = "0";
			} else if(coeff == 0.0) {
				answer = "1";
			} else if(coeff == 1.0) {
				answer = "-1";
			} else if(coeff == (1.0/4.0) || coeff == (7.0/4.0)) {
				answer = "sqrt2 / 2";
			} else if(coeff == (1.0/6.0) || coeff == (11.0/6.0)) {
				answer = "sqrt3 / 2";
			} else if(coeff == (5.0/4.0) || coeff == (3.0/4.0)) {
				answer = "-sqrt2 / 2";
			} else if(coeff == (5.0/6.0) || coeff == (7.0/6.0)) {
				answer = "-sqrt3 / 2";
			}
		} else if(func == 3) {
			question = "csc(" + numer + "pi/" + denom + ")";
			//answer = Double.toString(1/(Math.sin(numer * Math.PI / denom)));
			var coeff = numer / denom;
			coeff = coeff % 2;
			if(coeff == (1.0/6.0) || coeff == (5.0/6.0)) {
				answer = "2";
			} else if(coeff == (7.0/6.0) || coeff == (11.0/6.0)){
				answer = "-2";
			} else if(coeff == 1.0 || coeff == 0.0) {
				answer = "undefined";
			} else if(coeff == (1.0/2.0)) {
				answer = "1";
			} else if(coeff == (3.0/2.0)) {
				answer = "-1";
			} else if(coeff == (1.0/4.0) || coeff == (3.0/4.0)) {
				answer = "sqrt2";
			} else if(coeff == (1.0/3.0) || coeff == (2.0/3.0)) {
				answer = "2sqrt3 / 3";
			} else if(coeff == (5.0/4.0) || coeff == (7.0/4.0)) {
				answer = "-sqrt2";
			} else if(coeff == (4.0/3.0) || coeff == (5.0/3.0)) {
				answer = "-2sqrt3 / 3";
			}
		} else if(func == 4) {
			question = "sec(" + numer + "pi/" + denom + ")";
			//answer = Double.toString(1/(Math.cos(numer * Math.PI / denom)));
			var coeff = numer / denom;
			coeff = coeff % 2;
			if(coeff == (1.0/3.0) || coeff == (5.0/3.0)) {
				answer = "2";
			} else if(coeff == (2.0/3.0) || coeff == (4.0/3.0)){
				answer = "-2";
			} else if(coeff == (1.0/2.0) || coeff == (3.0/2.0)) {
				answer = "undefined";
			} else if(coeff == 0.0) {
				answer = "1";
			} else if(coeff == 1.0) {
				answer = "-1";
			} else if(coeff == (1.0/4.0) || coeff == (7.0/4.0)) {
				answer = "sqrt2";
			} else if(coeff == (1.0/6.0) || coeff == (11.0/6.0)) {
				answer = "2sqrt3 / 3";
			} else if(coeff == (5.0/4.0) || coeff == (3.0/4.0)) {
				answer = "-sqrt2";
			} else if(coeff == (5.0/6.0) || coeff == (7.0/6.0)) {
				answer = "-2sqrt3 / 3";
			}
		} else if(func == 5) {
			question = "tan(" + numer + "pi/" + denom + ")";
			//answer = Double.toString(Math.tan(numer * Math.PI / denom));
			var coeff = numer / denom;
			coeff = coeff % 2;
			if(coeff == 1.0 || coeff == 0.0) {
				answer = "0";
			} else if(coeff == (1.0/2.0) || coeff == (3.0/2.0)) {
				answer = "undefined";
			} else if(coeff == (1.0/4.0) || coeff == (5.0/4.0)) {
				answer = "1";
			} else if(coeff == (3.0/4.0) || coeff == (7.0/4.0)) {
				answer = "-1";
			} else if(coeff == (1.0/6.0) || coeff == (7.0/6.0)) {
				answer = "sqrt3 / 3";
			} else if(coeff == (5.0/6.0) || coeff == (11.0/6.0)) {
				answer = "-sqrt3 / 3";
			} else if(coeff == (1.0/3.0) || coeff == (2.0/3.0)) {
				answer = "sqrt3";
			} else if(coeff == (2.0/3.0) || coeff == (5.0/3.0)) {
				answer = "-sqrt3";
			}
		} else if(func == 6) {
			question = "cot(" + numer + "pi/" + denom + ")";
			//answer = Double.toString(Math.tan(numer * Math.PI / denom));
			var coeff = numer / denom;
			coeff = coeff % 2;
			if(coeff == 1.0 || coeff == 0.0) {
				answer = "undefined";
			} else if(coeff == (1.0/2.0) || coeff == (3.0/2.0)) {
				answer = "0";
			} else if(coeff == (1.0/4.0) || coeff == (5.0/4.0)) {
				answer = "1";
			} else if(coeff == (3.0/4.0) || coeff == (7.0/4.0)) {
				answer = "-1";
			} else if(coeff == (1.0/6.0) || coeff == (7.0/6.0)) {
				answer = "sqrt3";
			} else if(coeff == (5.0/6.0) || coeff == (11.0/6.0)) {
				answer = "-sqrt3";
			} else if(coeff == (1.0/3.0) || coeff == (2.0/3.0)) {
				answer = "sqrt3 /3";
			} else if(coeff == (2.0/3.0) || coeff == (5.0/3.0)) {
				answer = "-sqrt3 /3";
			}
		}
		var prob = new ProblemStorage(question, answer);
		return prob;
	}

	basic() {
		var answer = Math.ceil(Math.random() * 10);
		var question = answer;
		var terms = Math.ceil(Math.random() * 4) + 1;
		for(var i = 0; i < terms - 1; i++) {
			var operator = Math.ceil(Math.random() * 10);
			var operation = Math.ceil(Math.random() * 2);
			if(operation == 1) {
				answer += operator;
				question = question + " + " + operator;
			} else if(operation == 2) {
				answer -= operator;
				question = question + " - " + operator;
			}
		}
		var prob = new ProblemStorage(question, answer.toString());
		return prob;
	}

	ask() {
		var q = null;
		if(this.func == 1) {
			q = this.basic();
		} else if(this.func == 2) {
			q = this.unitCircle();
		} else {
			q = this.derivative();
		}
		return q;
	}
	
	getName() {
		return this.name;
	}
	getHealth() {
		return this.health;
	}
	getFunction() {
		return this.func;
	}
	hit(dmg) {
		this.health -= dmg;
	}
	getPow() {
		return this.pow;
	}
	getTime() {
		return this.time;
    }
    reset(){
        this.health = this.healthfull;
    }
}


window.onload = alert("You awaken in a grassy field, ringed by a forest. In the far, far distance, you see mountains. \
You are not sure where you are, or how you got there, but you know you need to get out of the wilderness.");

let countStepVert = 0;
let scene = 0;

let countStepHor = 0;
function eastButtonClick() {
    alert ("Move East");
    countStepHor++;
    if(decideCombat()){
        combat();
    }
    checkBounds();
}
function westButtonClick() {
    alert ("Move West");
    countStepHor--;
    if(decideCombat()){
        combat();
    }
    checkBounds();
}
function northButtonClick() {
    alert ("Move North");
    countStepVert++;
    if(decideCombat()){
        combat();
    }
    checkBounds();
}
function southButtonClick(){
    alert ("Move South");
    countStepVert--;
    if(decideCombat()){
        combat();
    }
    checkBounds();   
}

function quit(){
    window.close();
}

function decideCombat(){
    num1 = Math.ceil(Math.random() * 3);
    num2 = Math.ceil(Math.random() * 3);
    if(num1 == num2){
        return true;
    } else {
        return false;
    }
}

const sprite = new MathEnemy("Sprite", 500, 1, 50, 10);
const witch = new MathEnemy("Witch", 750, 2, 100, 30);
const troll = new MathEnemy("Troll", 1000, 3, 150, 20);
const p = new MainPlayer(500);
var prob = sprite.ask();
var enemy = null;
var start = null;
var end = null;

function combat(){
    hideMove();
    showGame();
    alert("Combat!");
    sprite.reset();
    witch.reset();
    troll.reset();
    if(scene == 0){
        enemy = sprite;
		alert("Suddenly, you hear a tinkling, malicious laugh. A glitter light coalesces in front of you, " + 
		 "forming a wicked sprite. They move to attack, and you get ready to fight back.");
    }
    if(scene == 1){
        enemy = witch;
		alert("Suddenly, you hear a cackling voice. Emerging from the darkness is an old crone. " + 
		"The witch readies her potions, in position to confront you. You prepare yourself to fight back.");
    }
    if(scene == 2){
        enemy = troll;
		alert("Suddenly, you hear an angry grunt, and look up to see a troll looming over you. " + 
		"He raises his spiked bat, and you know you have a fight ahead of you, but you’ve come this far and you’re not going back.");
    }
    let enemyhealthfield = document.getElementById("enemyhealth");
    enemyhealthfield.innerHTML = "Enemy Health: " + enemy.getHealth();
    let playerhealthfield = document.getElementById("playerhealth");
    playerhealthfield.innerHTML = "Player Health: " + p.getHealth();
    start = Date.now();
    prob = enemy.ask();
    let questionfield = document.getElementById("question");
    questionfield.innerHTML = "Question: " + prob.getQ();
    let damagedealtfield = document.getElementById("damagedealt");
    damagedealtfield.innerHTML = "Damage Dealt: ";
    let timetakenfield = document.getElementById("timetaken");
    timetakenfield.innerHTML = "Time Taken: ";
}

function submit(){ 
    var ans = document.getElementById("answer").value;
    end = Date.now();
    var time = end - start;
    let damagedealtfield = document.getElementById("damagedealt");
    if(ans.toString() == prob.getA().toString()) {
        let timetakenfield = document.getElementById("timetaken");
        var t = time / 1000;
        if(t > enemy.getTime()) {
            damagedealtfield.innerHTML = "Damage Dealt: None, you took too long.";
        } else {
            var dmg = 300 - (Math.ceil(t * (300 / enemy.getTime())));
            enemy.hit(dmg);
            damagedealtfield.innerHTML = "Damage Dealt: " + dmg;
        }
        timetakenfield.innerHTML = "Time Taken: " + t + " seconds";
    } else {
        console.log(ans + "    " + prob.getA());
        damagedealtfield.innerHTML = "Damage Dealt: None, you missed the question."
        p.hit(100);
    }
    document.getElementById("answer").value = "";
    if(enemy.getHealth() > 0 && p.getHealth() > 0) {
        let enemyhealthfield = document.getElementById("enemyhealth");
        enemyhealthfield.innerHTML = "Enemy Health: " + enemy.getHealth();
        let playerhealthfield = document.getElementById("playerhealth");
        playerhealthfield.innerHTML = "Player Health: " + p.getHealth();
        start = Date.now();
        prob = enemy.ask();
        let questionfield = document.getElementById("question");
        questionfield.innerHTML = "Question: " + prob.getQ();   
    } else if(enemy.getHealth() <= 0) {
        alert("Win!");
        showMove();
        hideGame();
    } else {
        alert("Lose!");
        window.close();
    }
}

function checkBounds() {
    if ((Math.abs(countStepVert) > 2 || Math.abs(countStepHor) > 2) && scene == 0) {
        combat();
        alert("You emerge from the field, into a forest.");
        scene++;
        background_switch(scene);
    }
    else if ((Math.abs(countStepVert) <= 2 && Math.abs(countStepHor) <= 2) && scene == 1) {
        alert("You return back to the field from the forest.");
        scene--;
        background_switch(scene);
    }
    else if ((Math.abs(countStepVert) > 5 || Math.abs(countStepHor) > 5 ) && scene == 1) {
        combat();
        alert("You cross the bridge, away from the forest and into the mountains.");
        scene++;
        background_switch(scene);
    }
    else if ((Math.abs(countStepVert) <= 5 && Math.abs(countStepHor) <= 5 ) && scene == 2) {
        alert("You cross back over the bridge, into the forest.");
        scene--;
        background_switch(scene);
    }
}

