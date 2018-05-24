package generalCode;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application implements Initializable {

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO 自動生成されたメソッド・スタブ

	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception{
		Label label = new Label("Hello JavaFx!");
//		BorderPane pane = new BorderPane();
//		pane.setCenter(label);
		FlowPane pane = new FlowPane();
		pane.getChildren().add(label);
		Scene scene = new Scene(pane, 320, 240);
		stage.setScene(scene);
		stage.show();
	}

}
