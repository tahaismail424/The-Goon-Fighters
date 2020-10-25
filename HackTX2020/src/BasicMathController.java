import java.util.Optional;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.ButtonType;

public class BasicMathController implements EventHandler<ActionEvent> {
	public void handle(ActionEvent event) {
		if(event.getSource() == BasicFXApplet.getView().getSubmit()) {
			boolean right = BasicFXApplet.getModel().checkAns(BasicFXApplet.getView().getAnswer());
			BasicFXApplet.getModel().setEnd(System.currentTimeMillis());
			long time = BasicFXApplet.getModel().getEnd() - BasicFXApplet.getModel().getStart();
			if(right) {
				double t = time / 1000;
				BasicFXApplet.getView().setTime(Double.toString(t));
				if(t < BasicFXApplet.getModel().getEnemy().getTime()) {
					int dmg = (int) Math.ceil((30 * BasicFXApplet.getModel().getEnemy().getTime()) - (t * 30));
					BasicFXApplet.getModel().getEnemy().hit(dmg);
					BasicFXApplet.getView().setResult("Dealt " + dmg + " damage.");
				} else {
					BasicFXApplet.getView().setResult("Correct, but you took too long.");
				}
			} else {
				BasicFXApplet.getModel().getPlayer().hit(BasicFXApplet.getModel().getEnemy().getPow());
				BasicFXApplet.getView().setResult("Incorrect answer. Took " + BasicFXApplet.getModel().getEnemy().getPow() + " damage.");
			}
			if(BasicFXApplet.getModel().getEnemy().getHealth() > 0 && BasicFXApplet.getModel().getPlayer().getHealth() > 0) {
				BasicFXApplet.getModel().giveQuestion();
				BasicFXApplet.getModel().setStart(System.currentTimeMillis());
				BasicFXApplet.getModel().updateHealth();
				BasicFXApplet.getView().setAnswer("");
			} else {
				Optional<ButtonType> result = BasicFXApplet.getView().getWin().showAndWait();
				if(result.get() == ButtonType.OK) {
					System.exit(0);
				}
			}
		}
	}
}
