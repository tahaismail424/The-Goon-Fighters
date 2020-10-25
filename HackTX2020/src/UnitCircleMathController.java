import java.util.Optional;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.ButtonType;

public class UnitCircleMathController implements EventHandler<ActionEvent> {
	public void handle(ActionEvent event) {
		if(event.getSource() == UnitCircleFXApplet.getView().getSubmit()) {
			boolean right = UnitCircleFXApplet.getModel().checkAns(UnitCircleFXApplet.getView().getAnswer());
			UnitCircleFXApplet.getModel().setEnd(System.currentTimeMillis());
			long time = UnitCircleFXApplet.getModel().getEnd() - UnitCircleFXApplet.getModel().getStart();
			if(right) {
				double t = time / 1000;
				UnitCircleFXApplet.getView().setTime(Double.toString(t));
				if(t < UnitCircleFXApplet.getModel().getEnemy().getTime()) {
					int dmg = (int) Math.ceil(300 - (t * 10));
					UnitCircleFXApplet.getModel().getEnemy().hit(dmg);
					UnitCircleFXApplet.getView().setResult("Dealt " + dmg + " damage.");
				} else {
					UnitCircleFXApplet.getView().setResult("Correct, but you took too long.");
				}
			} else {
				UnitCircleFXApplet.getModel().getPlayer().hit(UnitCircleFXApplet.getModel().getEnemy().getPow());
				UnitCircleFXApplet.getView().setResult("Incorrect answer. Took " + UnitCircleFXApplet.getModel().getEnemy().getPow() + " damage.");
			}
			if(UnitCircleFXApplet.getModel().getEnemy().getHealth() > 0 && UnitCircleFXApplet.getModel().getPlayer().getHealth() > 0) {
				UnitCircleFXApplet.getModel().giveQuestion();
				UnitCircleFXApplet.getModel().setStart(System.currentTimeMillis());
				UnitCircleFXApplet.getModel().updateHealth();
				UnitCircleFXApplet.getView().setAnswer("");
			} else {
				Optional<ButtonType> result = UnitCircleFXApplet.getView().getWin().showAndWait();
				if(result.get() == ButtonType.OK) {
					System.exit(0);
				}
			}
		}
	}
}
