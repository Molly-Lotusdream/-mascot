package display;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Display3 extends Pane{

	public Display3(Stage stage, String id) {
		try {
			FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("Display3.fxml"));
			this.getChildren().add(fxmlloader.load());

			// ��ÿ���������,�������ݴ�������������
			((Display3Controller)fxmlloader.getController()).setOldStage(stage);
			((Display3Controller)fxmlloader.getController()).setId(id);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
