package usingMajorControl;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class App extends Application {
	Label label;
//	CheckBox check;
//	ToggleGroup group;
//	ComboBox<String> combo;
	Slider slider;
	Button button;

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		label = new Label("This is JavaFx");
		//use check box
//		check = new CheckBox("check box");
//		check.setSelected(true);
//		check.setOnAction((ActionEvent)->{
//			label.setText(check.isSelected()?
//					"Selected" : "Not selected");
//		});

		//use radio button
//		group = new ToggleGroup();
//		RadioButton btn1 = new RadioButton("Male");
//		btn1.setToggleGroup(group);
//		btn1.setSelected(true);
//		RadioButton btn2 = new RadioButton("Female");
//		btn2.setToggleGroup(group);
//		btn1.setOnAction((ActionEvent)->{
//			label.setText("you are male?");
//		});
//		btn2.setOnAction((ActionEvent)->{
//			label.setText("you are female?");
//		});

		//use combo box
//		ObservableList<String> data = FXCollections.observableArrayList(
//				"One","Two","Three"
//				);
//		combo = new ComboBox<String>(data);
//		combo.setOnAction((ActionEvent) -> {
//			label.setText(combo.getValue());
//		});

		//use slider
		slider = new Slider(0, 100, 50);
		slider.setShowTickMarks(true);
		slider.setShowTickLabels(true);
		slider.setSnapToTicks(true);
		button = new Button("CLICK");
		button.setOnAction((ActionEvent)->{
			label.setText("Value: "+slider.getValue());
		});


		BorderPane pane = new BorderPane();
		pane.setTop(label);
		//set check box
//		pane.setCenter(check);

		//set radio button
//		FlowPane flow = new FlowPane();
//		flow.getChildren().add(btn1);
//		flow.getChildren().add(btn2);
//		pane.setCenter(flow);

		//set combo box
//		pane.setCenter(combo);

		//set slider
		pane.setCenter(slider);
		pane.setBottom(button);
		Scene scene = new Scene(pane, 320, 120);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		launch(args);

	}

}
