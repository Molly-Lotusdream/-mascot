package fill;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Fill3 extends Pane {
	public Fill3(Stage stage,String id) {
		try {
			FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("Fill3.fxml"));
			this.getChildren().add(fxmlloader.load());
			// 获得控制器对象,并把数据传给控制器对象
			((Fill3Controller)fxmlloader.getController()).setOldStage(stage);
			((Fill3Controller)fxmlloader.getController()).setQues3();
			((Fill3Controller)fxmlloader.getController()).setAns3();
			((Fill3Controller)fxmlloader.getController()).setId(id);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
