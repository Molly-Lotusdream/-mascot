package fill;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Fill2 extends Pane {
	public Fill2(Stage stage,String id) {
		try {
			FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("Fill2.fxml"));
			this.getChildren().add(fxmlloader.load());
			// 获得控制器对象,并把数据传给控制器对象
			((Fill2Controller)fxmlloader.getController()).setOldStage(stage);
			((Fill2Controller)fxmlloader.getController()).setQues2();
			((Fill2Controller)fxmlloader.getController()).setAns2();
			((Fill2Controller)fxmlloader.getController()).setId(id);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
