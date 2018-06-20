package graphicsDrawingWithCanvas;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
//import javafx.scene.paint.Color;
//import javafx.scene.paint.CycleMethod;
//import javafx.scene.paint.LinearGradient;
//import javafx.scene.paint.RadialGradient;
//import javafx.scene.paint.Stop;

public class AppController implements Initializable {
	@FXML Canvas canvas;
	GraphicsContext gc;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO 自動生成されたメソッド・スタブ
		gc = canvas.getGraphicsContext2D();
		draw();
	}

	void draw() {
		// TODO 自動生成されたメソッド・スタブ
		// example 1
//		gc.setFill(Color.RED);
//		gc.setStroke(Color.BLUEVIOLET);
//		gc.fillRect(50, 50, 150, 150);
//		gc.strokeOval(100, 100, 50, 50);

		// example 2

//		Stop[] stops1 = new Stop[] {
//				new Stop(0, Color.CHARTREUSE),
//				new Stop(1, Color.AQUAMARINE)
//		};
//		LinearGradient gradient1 = new LinearGradient(0, 0, 1, 0, true, CycleMethod.NO_CYCLE, stops1);
//		gc.setFill(gradient1);
//		gc.fillRect(50, 50, 150, 150);
//
//		Stop[] stops2 = new Stop[] {
//				new Stop(0, Color.CRIMSON),
//				new Stop(0.5, Color.DARKORANGE)
//		};
//		RadialGradient gradient2 = new RadialGradient(0, 0, 125, 125, 100, false, CycleMethod.NO_CYCLE, stops2);
//		gc.setFill(gradient2);
//		gc.fillOval(75, 75, 100, 100);

		// example 3
		Image image = new Image(getClass().getResourceAsStream("sd_eye0.png"));
		gc.drawImage(image, 0, 0, 115, 280);
	}


}
