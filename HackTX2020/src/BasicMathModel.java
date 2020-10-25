
public class BasicMathModel {
	private MathEnemy e;
	private Player p;
	private Problem prob;
	private long start;
	private long end;
	
	public BasicMathModel() {
		p = new Player(500);
		e = new MathEnemy("Sprite", 500, 1, 50, 10);
	}
	public BasicMathModel(MathEnemy enemy, Player play) {
		e = enemy;
		p = play;
	}
	
	public void updateHealth() {
		BasicFXApplet.getView().setEnemyHealth(Integer.toString(e.getHealth()));
		BasicFXApplet.getView().setPlayerHealth(Integer.toString(p.getHealth()));
	}
	
	public void giveQuestion() {
		prob = e.ask();
		BasicFXApplet.getView().setQuestion(prob.getQ());
	}
	
	public boolean checkAns(String ans) {
		if(ans.equals(prob.getA())){
			return true;
		} else {
			return false;
		}
	}
	
	public MathEnemy getEnemy() {
		return e;
	}
	public Player getPlayer() {
		return p;
	}
	public void setEnemy(MathEnemy enemy) {
		e = enemy;
	}
	public void setPlayer(Player play) {
		p = play;
	}
	public void setStart(long s) {
		start = s;
	}
	public void setEnd(long e) {
		end = e;
	}
	public long getStart() {
		return start;
	}
	public long getEnd() {
		return end;
	}
}
