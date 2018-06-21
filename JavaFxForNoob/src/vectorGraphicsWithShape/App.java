package vectorGraphicsWithShape;

//import java.io.IOException;

import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.stage.Stage;

public class App extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

//		try {
//			Scene scene = new Scene(FXMLLoader.load(getClass().getResource("App.fxml")),300,300);
//			primaryStage.setScene(scene);
//			primaryStage.show();
//		}catch (IOException e) {
//			e.printStackTrace();
//		}

		Pane root = new Pane();
		createShape(root);
		Scene scene = new Scene(root, 300, 300);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		launch(args);
	}

	public void createShape(Pane root) {
//		Rectangle r = new Rectangle(50, 50, 100, 100);
//		r.setFill(Color.BLUE);
//		r.setStroke(Color.RED);
//		r.setStrokeWidth(3);
//		root.getChildren().add(r);
//
//		Circle c = new Circle(150, 150, 50);
//		c.setFill(Color.YELLOW);
//		c.setStroke(Color.GREEN);
//		c.setStrokeWidth(7);
//		root.getChildren().add(c);
//
//		Circle clip = new Circle(120, 120, 75);
//		root.setClip(clip);

		Path path = new Path();
		MoveTo mt1 = new MoveTo(50, 50);
		path.getElements().add(mt1);
		LineTo lt1 = new LineTo(250, 50);
		path.getElements().add(lt1);
		CubicCurveTo cc1 = new CubicCurveTo(250, 250, 50, 50 ,50 ,250);
		path.getElements().add(cc1);
		LineTo lt2 = new LineTo(50, 50);
		path.getElements().add(lt2);
		path.setFill(Color.LIGHTPINK);
		root.getChildren().add(path);
	}

}
