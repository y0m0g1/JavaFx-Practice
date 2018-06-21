package graphicSFX;

//import java.io.IOException;

import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
//import javafx.scene.effect.GaussianBlur;
import javafx.scene.effect.InnerShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
//import javafx.scene.text.Font;
//import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		Pane root = new Pane();
		createShape(root);
		Scene scene = new Scene(root, 600, 400);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		launch(args);
	}

	public void createShape(Pane root) {
		// example 1
//		for(int i=0; i<100; i++) {
//			Rectangle r = new Rectangle(10,10,25,25);
//			r.setFill(Color.TOMATO);
//			r.setStroke(Color.VIOLET);
//			r.setStrokeWidth(3);
//			r.setRotate(10*i);
//			r.setTranslateX(5*i);
//			r.setTranslateY(2.5*i);
//			r.setScaleX(1+0.05*i);
//			root.getChildren().add(r);
//		}

		// example 2
//		for(int i=0; i<20; i++) {
//			Rectangle r = new Rectangle(10, 10, 50, 50);
//			r.setFill(Color.BLUE);
//			r.setStroke(Color.WHITE);
//			r.setTranslateX(20*i);
//			r.setTranslateY(10*i);
//			r.setOpacity(1 - 0.05*i);
//			root.getChildren().add(r);
//			Rectangle r2 = new Rectangle(10, 10, 50, 50);
//			r2.setStroke(Color.RED);
//			r2.setFill(Color.TRANSPARENT);
//			r2.setTranslateX(20*i);
//			r2.setTranslateY(10*i);
//			root.getChildren().add(r2);
//		}

		// example 3
//		for(int i=0; i<10; i++) {
//			Rectangle r = new Rectangle(20, 20, 50, 50);
//			r.setTranslateX(25*i);
//			r.setTranslateY(15*i);
//			r.setFill(Color.BLUE);
//			r.setStroke(Color.RED);
//			r.setStrokeWidth(5);
//			r.setEffect(new GaussianBlur(2.0 * i));
//			root.getChildren().add(r);
//		}

		// example 4
//		Rectangle r = new Rectangle(20, 20, 100, 50);
//		r.setFill(Color.BLUE);
//		r.setStroke(Color.RED);
//		r.setStrokeWidth(5);
//		r.setEffect(new DropShadow(20.0, 10.0, 5.0, Color.DARKGRAY));
//		root.getChildren().add(r);
//
//		Ellipse e = new Ellipse(220, 50, 70, 30);
//		e.setFill(Color.YELLOW);
//		e.setStroke(Color.GREEN);
//		e.setStrokeWidth(5);
//		e.setEffect(new Reflection(5.0, 2.0, 0.5, 0));
//		root.getChildren().add(e);
//
//		Text t = new Text(50, 250, "Hello!");
//		t.setFont(new Font(80));
//		t.setFill(Color.YELLOW);
//		t.setStroke(Color.GREEN);
//		t.setStrokeWidth(1);
//		t.setEffect(new InnerShadow(2.0, 2.0, 1.0, Color.BLACK));
//		root.getChildren().add(t);

		// example 5
		InnerShadow is = new InnerShadow(10.0, 2.0, 2.0, Color.rgb(0, 100, 100));
		DropShadow ds = new DropShadow(20.0, 10.0, 5.0, Color.DARKGRAY);
		ds.setInput(is);
		Reflection rf = new Reflection(0.0, 2.0, 0.5, 0);
		rf.setInput(ds);

		Rectangle r = new Rectangle(20, 20, 100, 50);
		r.setFill(Color.CYAN);
		r.setEffect(rf);
		root.getChildren().add(r);
	}

}
