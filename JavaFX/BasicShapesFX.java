import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class BasicShapesFX extends Application {

	public static void main(String[] args) {
		
		launch(args);  //Application.launch(args);
		
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		Pane pane = new Pane();
		
		Line line = new Line(50,50,400,50);
		
		Rectangle rec = new Rectangle(50,100,350,100);
		rec.setStroke(Color.BLACK);
		rec.setStrokeWidth(10);
		rec.setFill(Color.BLUE);
		
		
		Ellipse elp = new Ellipse(225,350,175,100);
		elp.setStroke(Color.RED);
		elp.setStrokeWidth(5);
		elp.setFill(Color.GREEN);
		
		pane.getChildren().add(line);
		pane.getChildren().add(rec);
		pane.getChildren().add(elp);
		
		Scene scene = new Scene(pane,500,500);
		
		stage.setTitle("Basic Shapes");
		stage.setScene(scene);
		stage.show();
		
	}

}
