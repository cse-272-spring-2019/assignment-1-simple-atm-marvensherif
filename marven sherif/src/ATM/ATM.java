package ATM;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ATM extends Application {
	BankAccount check;
    BankAccount acc =new BankAccount("123456789");
	
	public static void main(String[]args) {
		
		launch(args);
}

	
public void start(Stage primaryStage) throws Exception{
	
primaryStage.setTitle("LOGIN");

Label cardnumberLabel = new Label("Cardnumber : ");

Label validationLabel =new Label();
TextField cardnumberField = new TextField();

Button submit=new Button("Submit ");
GridPane grid=new GridPane();
grid.add(cardnumberLabel,0,0);

grid.add(cardnumberField,1,0);

grid.add(submit,0,2);
grid.add(validationLabel, 3, 3);

submit.setOnAction(e->{

	
	if(acc.getCardNumber().equals(cardnumberField.getText()))
		Menu.start(acc);
	else
		validationLabel.setText("error");
	});
Scene scene=new Scene(grid,600,400);

primaryStage.setScene(scene);
primaryStage.show();

}





}
