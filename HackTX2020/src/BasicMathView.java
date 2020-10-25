import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class BasicMathView {
	private Stage myStage;
	private Text enemyLabel;
	private TextField enemyHealth;
	private Text playerLabel;
	private TextField playerHealth;
	private TextField question;
	private TextField answer;
	private Button submit;
	private TextField time;
	private Text timeLabel;
	private Alert winNotif;
	private Scene view;
	private TextField result;
	
	public void setScene() {
		GridPane grid = new GridPane();
		grid.setVgap(15);
		grid.setHgap(15);
		grid.setPadding(new Insets(15, 15, 15, 15));
		
		enemyLabel = new Text("Enemy Health: ");
		enemyHealth = new TextField();
		enemyHealth.setEditable(false);
		playerLabel = new Text("Player Health: ");
		playerHealth = new TextField();
		playerHealth.setEditable(false);
		question = new TextField();
		question.setEditable(false);
		answer = new TextField();
		submit = new Button("Submit");
		time = new TextField();
		time.setEditable(false);
		timeLabel = new Text("Time Taken: ");
		winNotif = new Alert(AlertType.INFORMATION, "You have defeated this monster!", ButtonType.OK);
		result = new TextField();
		result.setEditable(false);
		
		submit.setOnAction(new BasicMathController());
		
		grid.add(enemyLabel, 0, 0);
		grid.add(enemyHealth, 1, 0);
		grid.add(playerLabel, 0, 1);
		grid.add(playerHealth, 1, 1);
		grid.add(question, 0, 2, 2, 1);
		grid.add(answer, 0, 3, 2, 1);
		grid.add(submit, 1, 4);
		grid.add(timeLabel, 0, 5);
		grid.add(time, 1, 5);
		grid.add(result, 0, 6, 2, 1);
		
		grid.setAlignment(Pos.CENTER);
		view = new Scene(grid, 300, 300);
	}
	public void setStage(Stage stage) {
		myStage = stage;
		myStage.setTitle("Customization");
		
		myStage.setScene(view);
		myStage.show();
	}

	public void setEnemyHealth(String eHealth) {
		enemyHealth.setText(eHealth);
	}

	public void setPlayerHealth(String pHealth) {
		playerHealth.setText(pHealth);
	}

	public void setQuestion(String q) {
		question.setText(q);
	}

	public void setTime(String t) {
		time.setText(t);
	}

	public void setResult(String r) {
		result.setText(r);
	}
	
	public String getAnswer() {
		return answer.getText();
	}

	public Button getSubmit() {
		return submit;
	}
	
	public Alert getWin() {
		return winNotif;
	}
	
	public void setAnswer(String s) {
		answer.setText(s);
	}
	
	public Stage getStage() {
		return myStage;
	}
	
	public Scene getScene() {
		return view;
	}
}
