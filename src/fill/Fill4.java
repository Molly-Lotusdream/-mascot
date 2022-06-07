package fill;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Fill4 extends Pane {
	public Fill4(Stage stage,String id) {
		try {
			FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("Fill4.fxml"));
			this.getChildren().add(fxmlloader.load());
			// 获得控制器对象,并把数据传给控制器对象
			((Fill4Controller)fxmlloader.getController()).setOldStage(stage);
			((Fill4Controller)fxmlloader.getController()).setQues4();
			((Fill4Controller)fxmlloader.getController()).setAns4();
			((Fill4Controller)fxmlloader.getController()).setId(id);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
