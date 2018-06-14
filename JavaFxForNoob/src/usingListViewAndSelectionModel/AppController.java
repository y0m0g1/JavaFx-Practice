package usingListViewAndSelectionModel;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class AppController implements Initializable {
	@FXML Label label1;
	@FXML Button btn1;
	@FXML ListView<String> list1;


//	@FXML
//	protected void doAction(ActionEvent ev) {
//		String str = field1.getText();
//		str = "you wrote:"+str;
//		label1.setText(str);
//	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		list1.setItems(FXCollections.observableArrayList());
		list1.getItems().add("One");
		list1.getItems().add("Two");
		list1.getItems().add("Three");

		// with MouseClick
//		list1.setOnMouseClicked((MouseEvent)->{
//			Object obj = list1.getSelectionModel().getSelectedItem();
//			label1.setText(obj.toString());
//		});

		// with ChangeListener
		list1.getSelectionModel().selectedItemProperty().addListener(
				(ObservableValue<? extends String> observable, String oldVal, String newVal) ->{
					label1.setText(oldVal + "->" + newVal);
				});

		btn1.setOnAction((ActionEvent)->{
			Object obj = list1.getSelectionModel().getSelectedItem();
			label1.setText("you selected:\""+obj.toString()+"\".");
		});

	}
}
