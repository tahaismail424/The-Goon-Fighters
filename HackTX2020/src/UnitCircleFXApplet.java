import javax.swing.JApplet;
import javax.swing.SwingUtilities;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;

public class UnitCircleFXApplet extends JApplet {
	private static UnitCircleMathModel		mathModel;
	private static UnitCircleMathView			mathView;
	private static UnitCircleMathController	mathControl;

    @Override
    public final void init() { // This method is invoked when applet is loaded
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                initSwing();
            }
        });
    }

    private void initSwing() { // This method is invoked on Swing thread
        final JFXPanel fxPanel = new JFXPanel();
        add(fxPanel);

        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                initFX(fxPanel);
                initApplet();
            }
        });
    }

    private void initFX(JFXPanel fxPanel) { // This method is invoked on JavaFX thread
    	mathModel = new UnitCircleMathModel();
		mathView = new UnitCircleMathView();
		mathControl = new UnitCircleMathController();
		
		mathView.setScene();
		fxPanel.setScene(mathView.getScene());
		mathModel.giveQuestion();
		mathModel.setStart(System.currentTimeMillis());
		mathModel.updateHealth();
    }

    public void initApplet() {
    	
    }
    
    public static UnitCircleMathModel getModel() {
		return mathModel;
	}
	public static UnitCircleMathView getView() {
		return mathView;
	}
	public static UnitCircleMathController getController() {
		return mathControl;
	}
}