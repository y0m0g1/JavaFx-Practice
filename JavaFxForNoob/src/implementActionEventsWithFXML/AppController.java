package implementActionEventsWithFXML;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AppController implements Initializable {
	@FXML Label label1;
	@FXML TextField field1;
	@FXML Button btn1;

//	@FXML
//	protected void doAction(ActionEvent ev) {
//		String str = field1.getText();
//		str = "you wrote:"+str;
//		label1.setText(str);
//	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btn1.setOnAction((ActionEvent)->{
			String str = field1.getText();
			str = "あなたは「" + str + "」と書いた。";
			label1.setText(str);
		});
	}
}
