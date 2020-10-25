import java.util.Optional;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.ButtonType;

public class DerivMathController implements EventHandler<ActionEvent> {
	public void handle(ActionEvent event) {
		if(event.getSource() == DerivFXApplet.getView().getSubmit()) {
			boolean right = DerivFXApplet.getModel().checkAns(DerivFXApplet.getView().getAnswer());
			DerivFXApplet.getModel().setEnd(System.currentTimeMillis());
			long time = DerivFXApplet.getModel().getEnd() - DerivFXApplet.getModel().getStart();
			if(right) {
				double t = time / 1000;
				DerivFXApplet.getView().setTime(Double.toString(t));
				if(t < DerivFXApplet.getModel().getEnemy().getTime()) {
					int dmg = (int) Math.ceil(300 - (t * 15));
					DerivFXApplet.getModel().getEnemy().hit(dmg);
					DerivFXApplet.getView().setResult("Dealt " + dmg + " damage.");
				} else {
					DerivFXApplet.getView().setResult("Correct, but you took too long.");
				}
			} else {
				DerivFXApplet.getModel().getPlayer().hit(DerivFXApplet.getModel().getEnemy().getPow());
				DerivFXApplet.getView().setResult("Incorrect answer. Took " + DerivFXApplet.getModel().getEnemy().getPow() + " damage.");
			}
			if(DerivFXApplet.getModel().getEnemy().getHealth() > 0 && DerivFXApplet.getModel().getPlayer().getHealth() > 0) {
				DerivFXApplet.getModel().giveQuestion();
				DerivFXApplet.getModel().setStart(System.currentTimeMillis());
				DerivFXApplet.getModel().updateHealth();
				DerivFXApplet.getView().setAnswer("");
			} else {
				Optional<ButtonType> result = DerivFXApplet.getView().getWin().showAndWait();
				if(result.get() == ButtonType.OK) {
					System.exit(0);
				}
			}
		}
	}
}
