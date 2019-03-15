package ATM;


import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Menu {
	public static void start (BankAccount acc){
		Stage primaryStage=new Stage();
		primaryStage.setTitle("Menu");

			
		Label GetbalanceLabel = new Label();
        Button Deposit=new Button("Deposit");
        Button Withdraw=new Button("Withdraw ");
		Button Getbalance=new Button("Getbalance ");
		Button next=new Button("Next");
		
		Button previous=new Button("Previous");
		
		Button trans1=new Button("Transaction");
		
		Getbalance.setOnAction(e->{
                 
                    double x;
                    x=acc.getbalance();
                    GetbalanceLabel.setText(Double.toString(x));
                });
		
		GridPane grid=new GridPane();
		grid.add(Deposit,0,0);
		grid.add(Withdraw,1,0);
		grid.add(Getbalance,2,0);
		grid.add(GetbalanceLabel,3,0);
		grid.add(next,0,1);
		grid.add(previous,1,1);
		
		
		
		grid.add(trans1,2,1);
		
		trans1.setOnAction(e->{
			Navigate.trans(acc);
				
		
			
		});
		
		
		
		next.setOnAction(e->Navigate.next(acc));
		
		
previous.setOnAction(e->{
			
			Navigate.prev(acc);
			
		});
		
		
		
		
		
			
		Deposit.setOnAction(e->{
			
           d.start(acc);
		});
		Withdraw.setOnAction(e->{
			
			WD.start(acc);
	});
		
		Scene scene=new Scene(grid,600,400);
		primaryStage.setScene(scene);
		primaryStage.show();
		
}
        
}
	