package ATM;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Navigate {
	
	public static void next(BankAccount acc)
	{
		Stage primarystage=new Stage();
		primarystage.setTitle("Next");
		
		Button back=new Button("Back");
	
		Label view=new Label();
		view.setText(acc.next());
		
		VBox layout=new VBox(10);
		layout.setPadding(new Insets(20, 20, 20, 20));
		
		layout.getChildren().addAll(view,back);
		layout.setAlignment(Pos.CENTER);
		
		Scene scene=new Scene(layout,300,200);
		primarystage.setScene(scene);
		primarystage.show();
		
		back.setOnAction(e->primarystage.close());
		
	}
	
	public static void prev(BankAccount acc)
	{
		Stage primarystage=new Stage();
		primarystage.setTitle("Previous");
		
		Button back=new Button("Back");
	
		Label view=new Label();
		view.setText(acc.prev());
		
		VBox layout=new VBox(10);
		layout.setPadding(new Insets(20, 20, 20, 20));
		
		layout.getChildren().addAll(view,back);
		layout.setAlignment(Pos.CENTER);
		
		Scene scene=new Scene(layout,300,200);
		primarystage.setScene(scene);
		primarystage.show();
		
		back.setOnAction(e->primarystage.close());
		
		
		
		
		
	}
	
	public static void trans(BankAccount acc)
	{
		Stage primarystage=new Stage();
		primarystage.setTitle("Transactions");
		
		Button back=new Button("Back");
	
		VBox layout=new VBox(10);
		
		int x=acc.getC();
		
		for(int i=0;i<x;i++) {
			Label trans=new Label(acc.trans[i]);
			layout.getChildren().add(trans);
			
			
		}
		
		
	
		layout.setPadding(new Insets(20, 20, 20, 20));
		
		layout.getChildren().addAll(back);
		layout.setAlignment(Pos.CENTER);
		
		Scene scene=new Scene(layout,300,200);
		primarystage.setScene(scene);
		primarystage.show();
		
		back.setOnAction(e->primarystage.close());
		
		
		
		
		
	}

}
