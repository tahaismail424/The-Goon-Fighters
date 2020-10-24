import java.util.Scanner;
public class Combat {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		MathEnemy e = new MathEnemy("Test", 1000, 3);
		Player p = new Player(500);
		while(e.getHealth() > 0 && p.getHealth() > 0) {
			long start = System.currentTimeMillis();
			Problem prob = e.ask();
			String ans = scan.nextLine();
			long end = System.currentTimeMillis();
			long time = end - start;
			if(ans.equals(prob.getA())) {
				double t = time / 1000;
				if(t > 10) {
					System.out.println("You took too long to answer, but you got the question right!");
				} else {
					e.hit(300 - ((int) Math.ceil(t * 10)));
				}
			} else {
				System.out.println(ans + "	" + prob.getA());
				p.hit(100);
			}
			System.out.println(e.getHealth() + "	" + p.getHealth());
		}
		scan.close();
	}
}
