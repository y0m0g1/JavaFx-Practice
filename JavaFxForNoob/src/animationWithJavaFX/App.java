package animationWithJavaFX;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
//import javafx.animation.TranslateTransition;

//import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class App extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		Pane root = new Pane();
		createShape(root);
		Scene scene = new Scene(root, 240, 90);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		launch(args);
	}

	public void createShape(Pane root) {
		// example 1;
//		Rectangle r = new Rectangle(20, 20, 50, 50);
//		r.setFill(Color.CYAN);
//		root.getChildren().add(r);
//
//		TranslateTransition tt = new TranslateTransition(new Duration(1000), r);
//		tt.setFromX(20);
//		tt.setToX(100);
//		tt.setAutoReverse(true);
//		tt.setCycleCount(10);
//		tt.play();

		// example 2;
		Rectangle r = new Rectangle(20, 20, 100, 50);
		r.setFill(Color.CYAN);
		root.getChildren().add(r);

		Timeline tl = new Timeline();
		tl.setAutoReverse(true);
		tl.setCycleCount(10);

		KeyFrame key_a1 = new KeyFrame(
				new Duration(0),
				new KeyValue(r.widthProperty(), 100));
		KeyFrame key_a2 = new KeyFrame(
				new Duration(2500),
				new KeyValue(r.widthProperty(),200));

		KeyFrame key_b1 = new KeyFrame(
				new Duration(0),
				new KeyValue(r.fillProperty(), Color.rgb(255, 0, 0)));
		KeyFrame key_b2 = new KeyFrame(
				new Duration(2500),
				new KeyValue(r.fillProperty(), Color.rgb(0, 0, 255)));
		tl.getKeyFrames().add(key_a1);
		tl.getKeyFrames().add(key_a2);
		tl.getKeyFrames().add(key_b1);
		tl.getKeyFrames().add(key_b2);
		tl.play();

	}

}
