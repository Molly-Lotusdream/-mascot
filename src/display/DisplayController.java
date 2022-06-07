package display;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import login.Login;
import login.Menu;

public class DisplayController {
	private String id = "111";
public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

private Stage oldstage=null;
    @FXML
    private Button lianlian;

    @FXML
    private Button ret;

    @FXML
    private Button exit;

    @FXML
    private ImageView mainImg;

    @FXML
    private ImageView face;

    @FXML
    private ImageView left;

    @FXML
    private ImageView back;

    @FXML
    private Button chenchen;

    @FXML
    void setFace(ActionEvent event) {

    }

    @FXML
    void setBack(ActionEvent event) {

    }

    @FXML
    void setLeft(ActionEvent event) {

    }

    @FXML
    void lastCK(ActionEvent event) {

    }


    @FXML
    void nextCK(ActionEvent event) {

    }



    @FXML
    void retCK(ActionEvent event) {
    	Stage menuStage = new Stage();
		Scene menuScene = new Scene(new Menu(menuStage, id));
		menuStage.setTitle("菜单");
		menuStage.setScene(menuScene);
		menuStage.show();
		oldstage.hide();
    }


    @FXML
    void exitCK(ActionEvent event) {
		Stage loginStage = new Stage();
		Scene loginScene = new Scene(new Login(loginStage));
		loginStage.setTitle("登录");
		loginStage.setScene(loginScene);
		loginStage.show();
		oldstage.hide();
    }

	public void setOldStage(Stage stage) {
	oldstage = stage;	// TODO 自动生成的方法存根

	}

}
