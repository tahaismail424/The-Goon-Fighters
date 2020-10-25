import java.util.Optional;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.ButtonType;

public class MathController implements EventHandler<ActionEvent> {
	public void handle(ActionEvent event) {
		if(event.getSource() == FXApplet.getView().getSubmit()) {
			boolean right = FXApplet.getModel().checkAns(FXApplet.getView().getAnswer());
			FXApplet.getModel().setEnd(System.currentTimeMillis());
			long time = FXApplet.getModel().getEnd() - FXApplet.getModel().getStart();
			if(right) {
				double t = time / 1000;
				FXApplet.getView().setTime(Double.toString(t));
				if(t < FXApplet.getModel().getEnemy().getTime()) {
					int dmg = (int) Math.ceil(300 - (t * 30));
					FXApplet.getModel().getEnemy().hit(dmg);
					FXApplet.getView().setResult("Dealt " + dmg + " damage.");
				} else {
					FXApplet.getView().setResult("Correct, but you took too long.");
				}
			} else {
				FXApplet.getModel().getPlayer().hit(FXApplet.getModel().getEnemy().getPow());
				FXApplet.getView().setResult("Incorrect answer. Took " + FXApplet.getModel().getEnemy().getPow() + " damage.");
			}
			if(FXApplet.getModel().getEnemy().getHealth() > 0 && FXApplet.getModel().getPlayer().getHealth() > 0) {
				FXApplet.getModel().giveQuestion();
				FXApplet.getModel().setStart(System.currentTimeMillis());
				FXApplet.getModel().updateHealth();
				FXApplet.getView().setAnswer("");
			} else {
				Optional<ButtonType> result = FXApplet.getView().getWin().showAndWait();
				if(result.get() == ButtonType.OK) {
					System.exit(0);
				}
			}
		}
	}
}
