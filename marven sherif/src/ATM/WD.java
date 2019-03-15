package ATM;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class WD {
	public static void start(BankAccount acc) {
    Stage primarystage=new Stage();
    primarystage.setTitle("Withdraw");
	Label WithdrawLabel = new Label("Withdraw : ");
	Label error= new Label();
	TextField withdrawField = new TextField();
	Button submit=new Button("submit ");
	Button back=new Button("back");
	GridPane grid=new GridPane();
	grid.add(WithdrawLabel,1,0);
	grid.add(withdrawField,1,1);
	grid.add(submit,1,2);
	grid.add(back,1,3);
	grid.add(error,1,4);
	back.setOnAction(e->{
		Menu.start(acc);
	});
	
	submit.setOnAction(e->{double ammount=Double.valueOf(withdrawField.getText());
	if(acc.withdraw(ammount)==false)
		
		error.setText("You have no enough balance");
	else
		error.setText("please go check your balance");
	});
	
	Scene scene=new Scene(grid,600,400);
	primarystage.setScene(scene);
	primarystage.show();
	
}}
