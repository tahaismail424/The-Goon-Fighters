
public class Player {
	private int health;
	public Player(int h) {
		health = h;
	}
	
	public int getHealth() {
		return health;
	}
	public void heal(int h) {
		health += h;
	}
	public void hit(int dmg) {
		health -= dmg;
	}
}
