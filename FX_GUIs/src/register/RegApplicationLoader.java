package register;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class RegApplicationLoader extends Application {
	
	private RegisterRootPane root;
	
	@Override
	public void init() {
		root = new RegisterRootPane();
	
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		// set up the stage and scene for the view.
		stage.setTitle("RegistrationForm");
		stage.setScene(new Scene(root));
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
