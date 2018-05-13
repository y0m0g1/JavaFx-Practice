package fx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class JavaFxM extends Application{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception{
		// load hello.fxml
		Parent root = FXMLLoader.load(getClass().getResource("/hello.fxml"));

		// add Scene
		Scene scene = new Scene(root);
		stage.setScene(scene);

		// display
		stage.show();
	}

}
