import javax.swing.JApplet;
import javax.swing.SwingUtilities;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;

public class FXApplet extends JApplet {
	private static MathModel		mathModel;
	private static MathView			mathView;
	private static MathController	mathControl;

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
    	mathModel = new MathModel();
		mathView = new MathView();
		mathControl = new MathController();
		
		mathView.setScene();
		fxPanel.setScene(mathView.getScene());
		mathModel.giveQuestion();
		mathModel.setStart(System.currentTimeMillis());
		mathModel.updateHealth();
    }

    public void initApplet() {
    	
    }
    
    public static MathModel getModel() {
		return mathModel;
	}
	public static MathView getView() {
		return mathView;
	}
	public static MathController getController() {
		return mathControl;
	}
}