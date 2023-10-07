import java.text.DecimalFormat;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class BasicGUI_FX extends Application{
	
	Label inp1Lbl,inp2Lbl,resultLabel;
	TextField inp1TxtFld,inp2TxtFld,resultTxt;
	Button addBtn,subBtn;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		inp1Lbl = new Label("Input1");
		inp2Lbl = new Label("Input2");
		resultLabel = new Label("Result");
		
		inp1TxtFld = new TextField();
		inp2TxtFld = new TextField();
		resultTxt = new TextField();
		
		addBtn = new Button("Add");
		subBtn = new Button("Subtract");
		
		
		//Using FlowPane
		FlowPane fPane = new FlowPane();
		fPane.setAlignment(Pos.CENTER);
		fPane.setPadding(new Insets(10,10,10,10));
		fPane.setHgap(5);
		fPane.setVgap(5);
		fPane.getChildren().addAll(inp1Lbl,inp1TxtFld,inp2Lbl,inp2TxtFld,resultLabel,resultTxt,addBtn,subBtn);

		
		//Using GridPane
		/*GridPane gPane = new GridPane();
		gPane.setAlignment(Pos.CENTER);
		gPane.setPadding(new Insets(10,10,10,10));
		gPane.setHgap(5);
		gPane.setVgap(5);
		gPane.add(inp1Lbl, 0, 0);
		gPane.add(inp1TxtFld, 1, 0);
		gPane.add(inp2Lbl, 0, 1);
		gPane.add(inp2TxtFld, 1, 1);
		gPane.add(resultLabel, 0, 2);
		gPane.add(resultTxt, 1, 2);
		gPane.add(addBtn, 0, 3);
		gPane.add(subBtn, 1, 3);*/
		
		
		ButtonHandler btnHandler = new ButtonHandler();
		addBtn.setOnAction(btnHandler);
		subBtn.setOnAction(btnHandler);
		
	/*	addBtn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				double num1, num2;
				DecimalFormat df = new DecimalFormat("0.00");
				num1 = Double.parseDouble(inp1TxtFld.getText());
				num2 = Double.parseDouble(inp2TxtFld.getText());
				resultTxt.setText("The sum is: "+df.format((num1+num2)));
			}	
		});
		
		subBtn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				double num1, num2;
				DecimalFormat df = new DecimalFormat("0.00");
				num1 = Double.parseDouble(inp1TxtFld.getText());
				num2 = Double.parseDouble(inp2TxtFld.getText());
				resultTxt.setText("The sum is: "+df.format((num1-num2)));
			}	
		});*/
		
		
		Scene scene = new Scene(fPane,225,140);
		//Scene scene = new Scene(gPane);
		stage.setTitle("GUI JavaFX");
		stage.setScene(scene);
		stage.show();
		stage.setResizable(false);
		
	}
	
	class ButtonHandler implements EventHandler<ActionEvent>{

		@Override
		public void handle(ActionEvent event) {
			double num1, num2;
			DecimalFormat df = new DecimalFormat("0.00");
			num1 = Double.parseDouble(inp1TxtFld.getText());
			num2 = Double.parseDouble(inp2TxtFld.getText());
			
			if(event.getSource() == addBtn)
				resultTxt.setText("The sum is: "+df.format((num1+num2)));
			else
				resultTxt.setText("The difference is: "+df.format((num1-num2)));	
			
		}
		
	}

}
