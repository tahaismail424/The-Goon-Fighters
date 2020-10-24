
class MathEnemy {
	private String name;
	private int health;
	private int function;
	
	public MathEnemy(String n, int h, int f) {
		name = n;
		health = h;
		function = f;
	}
	
	public Problem derivative() {
		String question = "";
		String answer = "";
		int terms = ((int) Math.ceil(Math.random() * 4)) + 1;
		for(int i = terms - 1; i >= 0; i--) {
			int coeff = (int) Math.ceil(Math.random() * 10);
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
		Problem prob = new Problem(question, answer);
		return prob;
	}
	
	public Problem unitCircle() {
		String question = "";
		String answer = "";
		int func = (int) Math.ceil(Math.random() * 6);
		int numer = (int) Math.ceil(Math.random() * 11);
		int denom = (int) Math.ceil(Math.random() * 5);
		if(denom == 5) {
			denom = 6;
		}
		if(func == 1) {
			question = "sin(" + numer + "pi/" + denom + ")";
			//answer = Double.toString(Math.sin(numer * Math.PI / denom));
			double coeff = (double)numer / (double)denom;
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
			double coeff = (double)numer / (double)denom;
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
			double coeff = (double)numer / (double)denom;
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
			double coeff = (double)numer / (double)denom;
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
			double coeff = (double)numer / (double)denom;
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
			double coeff = (double)numer / (double)denom;
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
		Problem prob = new Problem(question, answer);
		return prob;
	}

	public Problem basic() {
		int answer = (int)Math.ceil(Math.random() * 10);
		String question = Integer.toString(answer);
		int terms = (int)Math.ceil(Math.random() * 4) + 1;
		for(int i = 0; i < terms - 1; i++) {
			int operator = (int) Math.ceil(Math.random() * 10);
			int operation = (int)Math.ceil(Math.random() * 2);
			if(operation == 1) {
				answer += operator;
				question = question + " + " + operator;
			} else if(operation == 2) {
				answer -= operator;
				question = question + " - " + operator;
			}
		}
		Problem prob = new Problem(question, Integer.toString(answer));
		return prob;
	}

	public Problem ask() {
		Problem q;
		if(function == 1) {
			q = basic();
		} else if(function == 2) {
			q = unitCircle();
		} else {
			q = derivative();
		}
		System.out.println(q.getQ());
		return q;
	}
	
	public String getName() {
		return name;
	}
	public int getHealth() {
		return health;
	}
	public int getFunction() {
		return function;
	}
	public void hit(int dmg) {
		health -= dmg;
	}
}
