package login;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Login extends Pane{

	public Login(Stage stage) {
		try {
			FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("Login.fxml"));
			this.getChildren().add(fxmlloader.load());

			// 获得控制器对象,并把数据传给控制器对象
			((LoginController)fxmlloader.getController()).setOldStage(stage);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
