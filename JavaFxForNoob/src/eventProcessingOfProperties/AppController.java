package eventProcessingOfProperties;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

public class AppController implements Initializable {
	@FXML Label label1;
//	@FXML ToggleGroup group1;
//	@FXML ComboBox<String> combo1;
	@FXML Slider slider1;


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO 自動生成されたメソッド・スタブ
		//use toggle group
//		group1.selectedToggleProperty().addListener(
//				(ObservableValue<? extends Toggle> observ, Toggle oldVal, Toggle newVal)->{
//					String oldStr = (String)oldVal.getUserData();
//					String newStr = (String)newVal.getUserData();
//					label1.setText(oldStr + "->" + newStr);
//				});

		//use combo box
//		combo1.getSelectionModel().selectedItemProperty().addListener(
//				(ObservableValue<? extends String> observ, String oldVal, String newVal)->{
//					label1.setText(oldVal + "->" + newVal);
//				});

		//use slider
		slider1.valueProperty().addListener(
				(ObservableValue<? extends Number> observ, Number oldVal, Number newVal)->{
					double oldnum = oldVal.doubleValue();
					double newnum = newVal.doubleValue();
					label1.setText(oldnum + "->" + newnum);
				});

	}

}
