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

			// ��ÿ���������,�������ݴ�������������
			((LoginController)fxmlloader.getController()).setOldStage(stage);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
