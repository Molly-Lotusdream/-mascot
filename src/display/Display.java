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

			// 获得控制器对象,并把数据传给控制器对象
			((DisplayController)fxmlloader.getController()).setOldStage(stage);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
