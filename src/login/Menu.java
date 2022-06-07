package login;



import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Menu extends Pane{

	public Menu(Stage stage,String id) {
		try {
			FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("Menu.fxml"));
			this.getChildren().add(fxmlloader.load());

			// 获得控制器对象,并把数据传给控制器对象
			((MenuController)fxmlloader.getController()).setOldStage(stage);
			((MenuController)fxmlloader.getController()).setId(id);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
