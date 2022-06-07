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
			// 获得控制器对象,并把数据传给控制器对象
			((Fill1Controller)fxmlloader.getController()).setOldStage(stage);
			((Fill1Controller)fxmlloader.getController()).setQues1();
			((Fill1Controller)fxmlloader.getController()).setAns1();
			((Fill1Controller)fxmlloader.getController()).setId(id);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
