package display;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Display extends Pane{

	public Display(Stage stage) {
		try {
			FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("Display.fxml"));
			this.getChildren().add(fxmlloader.load());

			// ��ÿ���������,�������ݴ�������������
			((DisplayController)fxmlloader.getController()).setOldStage(stage);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
