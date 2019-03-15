package ATM;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class d {

	public static void start (BankAccount acc) {
		
		
		Stage primarystage=new Stage();
		primarystage.setTitle("Deposit");
		Label DepositLabel = new Label("Deposit : ");
		Button submit=new Button("submit ");
		Button back=new Button("back");
		TextField DepositField = new TextField();
		Label check= new Label();
		GridPane grid=new GridPane();
		grid.add(DepositLabel,1,0);
		grid.add(DepositField,1,1);
		grid.add(submit,1,2);
		grid.add(back,1,3);
		grid.add(check,1,4);
		
		
		submit.setOnAction(e->{
			double ammount=Double.valueOf(DepositField.getText());
        acc.deposit(ammount);
      
        check.setText("please go check your balance");
        
        
		
		});
		
		back.setOnAction(e->{
			Menu.start(acc);
	
        
       
        
        
	});
		
		Scene scene=new Scene(grid,600,400);
		primarystage.setScene(scene);
		primarystage.show();
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
