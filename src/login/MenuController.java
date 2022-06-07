package login;



import display.Display1;
import fill.Fill1;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class MenuController {
//	stage定义
private  Stage oldStage = null;

    @FXML
    private Button exit;

    @FXML
    private Button test;

    @FXML
    private Button learn;

    @FXML
    private Label id=new Label("user");
//点击知识学习按钮进入知识学习界面
    @FXML
    void learnCK(ActionEvent event) {
    	Stage Display1Stage = new Stage();
		Scene  Display1Scene = new Scene(new  Display1(Display1Stage,id.getText()));
		 Display1Stage.setTitle("知识测验");
		 Display1Stage.setScene( Display1Scene);
		 Display1Stage.show();
		oldStage.hide();
    }
//点击知识测试按钮进入知识测试界面
    @FXML
    void testCK(ActionEvent event) {
    	Stage fill1Stage = new Stage();
		Scene fill1Scene = new Scene(new Fill1(fill1Stage,id.getText()));
		fill1Stage.setTitle("知识测验");
		fill1Stage.setScene(fill1Scene);
		fill1Stage.show();
		oldStage.hide();
    }
public Label getId() {
		return id;
	}
	//退回登录界面
    @FXML
    void exitCK(ActionEvent event) {
    	Stage loginStage = new Stage();
		Scene loginScene = new Scene(new Login(loginStage));
		loginStage.setTitle("登录");
		loginStage.setScene(loginScene);
		loginStage.show();
		oldStage.hide();
    }

	public void setOldStage(Stage stage) {
		// TODO 自动生成的方法存根
		oldStage=stage;

	}
//从登录界面获取数据set为菜单界面的用户名
	public void setId(String Id) {
		id.setText(Id);
		// TODO 自动生成的方法存根

	}

}
