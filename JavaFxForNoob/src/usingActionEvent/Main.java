package usingActionEvent;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

	Label label;
	TextField field;
	Button button;

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		label = new Label("this is JavaFx program");
		field = new TextField();
		button = new Button("Click");
//		button.setOnAction(new EventHandler<ActionEvent>() {
//			@Override
//			public void handle(ActionEvent e) {
//				String msg = "you typed: "+field.getText();
//				label.setText(msg);
//			}
//		});
//		use Lamda
		button.setOnAction((ActionEvent)->{
			String msg = "you typed: "+field.getText();
			label.setText(msg);
		});

		BorderPane pane = new BorderPane();
		pane.setTop(label);
		pane.setCenter(field);
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
