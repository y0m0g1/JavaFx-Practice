package fx;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController implements Initializable{

	@FXML private Button helloButton;
	@FXML private Label helloLabel;

	private int cnt = 0;

	@FXML
	public void onHelloButtonClicked(ActionEvent event) {
		this.helloLabel.setText("clicked! :" + ++cnt);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO 自動生成されたメソッド・スタブ
		this.helloLabel.setText("no click");
	}



}
