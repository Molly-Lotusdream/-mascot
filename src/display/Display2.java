package display;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Display2 extends Pane{

	public Display2(Stage stage, String id) {
		try {
			FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("Display2.fxml"));
			this.getChildren().add(fxmlloader.load());

			// ��ÿ���������,�������ݴ�������������
			((Display2Controller)fxmlloader.getController()).setOldStage(stage);
			((Display2Controller)fxmlloader.getController()).setId(id);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
