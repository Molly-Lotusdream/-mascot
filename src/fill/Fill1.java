package fill;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Fill1 extends Pane {
	public Fill1(Stage stage,String id) {
		try {
			FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("Fill1.fxml"));
			this.getChildren().add(fxmlloader.load());
			// ��ÿ���������,�������ݴ�������������
			((Fill1Controller)fxmlloader.getController()).setOldStage(stage);
			((Fill1Controller)fxmlloader.getController()).setQues1();
			((Fill1Controller)fxmlloader.getController()).setAns1();
			((Fill1Controller)fxmlloader.getController()).setId(id);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
