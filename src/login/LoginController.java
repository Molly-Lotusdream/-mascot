package login;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class LoginController {
	private Stage oldStage = null;
	@FXML
	private TextField password;

	@FXML
	private TextField id;

	@FXML
	private Button login;

	@FXML
	private Button register;

	// 登录按钮事件，根据不同的输入情况进行判断
	@FXML
	void loginCK(ActionEvent event) throws IOException {
		// 账号密码输入不全，提示用户进行输入
		if (id.getText().equals("") || password.getText().equals("")) {
			Alert warning = new Alert(AlertType.WARNING, "请将账号密码输入完整！");
			warning.setTitle("账号密码未输入");
			warning.show();
		} else {
			// 用三个变量检测用户的账号密码输入，允许账号重复，但不允许账号密码同时重复
			int input = 0, idtest = 0, passtest = 0;
			File f = new File("file/idname.txt");
			BufferedReader br = new BufferedReader(new FileReader(f));
			// 获取用户输入
			String idpass = id.getText() + " " + password.getText();
			// 判断文档为空
			String nulltest = null;
			// 逐行读取数据，记录id pass 与 idpass 是否有重复
			while ((nulltest = br.readLine()) != null) {
				String[] line = nulltest.split(" ");
				String idline = line[0];
				String passline= line[1];
				if (!idpass.equals(nulltest)) {
					input++;
				}
				if (id.getText().equals(idline)) {
					idtest++;
				}
				if (password.getText().equals(passline)) {
					passtest++;
				}
			}

			// 根据记录读取结果判断是否可以登录
			// 账号密码输入正确，允许登录
			if (input == 1&&idtest==1&&passtest==1) {
				Stage menuStage = new Stage();
				Menu menu = new Menu(menuStage, id.getText());
				Scene menuScene = new Scene(menu);
				menuStage.setTitle("争做亚运达人，科普亚运知识");
				menuStage.setScene(menuScene);
				menuStage.show();
				oldStage.hide();

			}

			// 三个信息都查不到
			else if (input == 0 && idtest == 0 && passtest == 0) {
				Alert warning = new Alert(AlertType.WARNING, "账号未注册，请注册后再登录");
				warning.setTitle("用户信息不存在");
				warning.show();
			}

			else if ((idtest == 1 || passtest == 1) && input!= 0) {
				Alert warning = new Alert(AlertType.WARNING, "账号或密码填写有误 ，请重新填写！");
				warning.setTitle("账号或密码错误");
				warning.show();
			}

		}
	}

	public TextField getId() {
		return id;
	}

	// 进入注册界面
	@FXML
	void resCK(ActionEvent event) {
		Stage resStage = new Stage();
		Scene resScene = new Scene(new Register(resStage));
		resStage.setTitle("注册账号");
		resStage.setScene(resScene);
		resStage.show();
		oldStage.hide();
	}

	// 舞台搭建
	public void setOldStage(Stage stage) {
		oldStage = stage;// TODO 自动生成的方法存根

	}

}
