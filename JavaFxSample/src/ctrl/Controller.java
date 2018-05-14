package ctrl;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class Controller implements Initializable {

	@FXML
	private ChoiceBox<String> dropDown;
	@FXML
	private TextField textBox;

	@FXML
	private Button button;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@FXML
	public void onClick(ActionEvent event) {
		textBox.setText("you clicked the button.");
	}

	public ChoiceBox<String> getToolType(){
		return dropDown;
	}

	public void setToolType(ChoiceBox<String> toolType) {
		this.dropDown = toolType;
	}

	public TextField getInputFile() {
		return textBox;
	}

	public void setInputFile(TextField textBox) {
		this.textBox = textBox;
	}

	public Button getReference() {
		return button;
	}

	public void setReference(Button button) {
		this.button = button;
	}

}
