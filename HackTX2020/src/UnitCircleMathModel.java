
public class UnitCircleMathModel {
	private MathEnemy e;
	private Player p;
	private Problem prob;
	private long start;
	private long end;
	
	public UnitCircleMathModel() {
		p = new Player(500);
		e = new MathEnemy("Witch", 750, 2, 100, 30);
	}
	public UnitCircleMathModel(MathEnemy enemy, Player play) {
		e = enemy;
		p = play;
	}
	
	public void updateHealth() {
		UnitCircleFXApplet.getView().setEnemyHealth(Integer.toString(e.getHealth()));
		UnitCircleFXApplet.getView().setPlayerHealth(Integer.toString(p.getHealth()));
	}
	
	public void giveQuestion() {
		prob = e.ask();
		UnitCircleFXApplet.getView().setQuestion(prob.getQ());
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
