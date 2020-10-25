import javax.swing.JApplet;
import javax.swing.SwingUtilities;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;

public class DerivFXApplet extends JApplet {
	private static DerivMathModel		mathModel;
	private static DerivMathView			mathView;
	private static DerivMathController	mathControl;

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
    	mathModel = new DerivMathModel();
		mathView = new DerivMathView();
		mathControl = new DerivMathController();
		
		mathView.setScene();
		fxPanel.setScene(mathView.getScene());
		mathModel.giveQuestion();
		mathModel.setStart(System.currentTimeMillis());
		mathModel.updateHealth();
    }

    public void initApplet() {
    	
    }
    
    public static DerivMathModel getModel() {
		return mathModel;
	}
	public static DerivMathView getView() {
		return mathView;
	}
	public static DerivMathController getController() {
		return mathControl;
	}
}