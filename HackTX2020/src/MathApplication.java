import javafx.application.Application;
import javafx.stage.Stage;

public class MathApplication extends Application{
	private static MathModel		mathModel;
	private static MathView			mathView;
	private static MathController	mathControl;
	
	public void start(Stage stage) throws Exception{
		mathModel = new MathModel();
		mathView = new MathView();
		mathControl = new MathController();
		
		mathView.setScene();
		mathView.setStage(stage);
		mathModel.giveQuestion();
		mathModel.setStart(System.currentTimeMillis());
		mathModel.updateHealth();
	}
	
	public static void main(String[] args) {
		launch(args);
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
