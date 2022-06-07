package display;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Display1 extends Pane{

	public Display1(Stage stage, String id) {
		try {
			FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("Display1.fxml"));
			this.getChildren().add(fxmlloader.load());

			// ��ÿ���������,�������ݴ�������������
			((Display1Controller)fxmlloader.getController()).setOldStage(stage);
			((Display1Controller)fxmlloader.getController()).setId(id);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
