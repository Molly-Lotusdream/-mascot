package login;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Optional;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class RegisterController {
	private Stage oldStage;
	@FXML
	private TextField password;

	@FXML
	private TextField school;

	@FXML
	private TextField sex;

	@FXML
	private TextField name;

	@FXML
	private Button back;

	@FXML
	private TextField id;

	@FXML
	private Button register;

	// 根据用户输入情况进行判断是否可以登录
	@FXML
	void regCK(ActionEvent event) throws IOException {
		// 密码格式错误
		if (!password.getText().matches("[\\da-zA-Z]+") || password.getText().length() < 8 || id.getText().length() > 8) {
			Alert warning = new Alert(AlertType.WARNING, "用户名不超过八位,密码只能包含字母或数字且至少八位");
			warning.setTitle("格式填写错误");
			warning.show();
		}
		// 各项信息填写正确且格式符合要求，允许注册
		else if (!id.getText().equals("") && !name.getText().equals("") && !sex.getText().equals("")
				&& !password.getText().equals("") && !school.getText().equals("")
				&& password.getText().matches("[\\da-zA-Z]+") && password.getText().length() >= 8 &&id.getText().length() <= 8) {
			int userCount = 0;// 记录并对比用户信息是否被注册
			File f = new File("file/idname.txt");// idname.txt只记录用户的账号密码,逐行读取对比账号密码是否有重复
			BufferedReader br = new BufferedReader(new FileReader(f));
			String idpass = id.getText() + " " + password.getText();// 记录用户的账号密码，中间用空格断开
			String nullCount = null;// 判断读取到的数据是否为空，循环读取数据，判断为空时停止读取
			while ((nullCount = br.readLine()) != null) {
				// 若读取到的数据与用户输入的数据一致，即用户账号密码冲突（用userCount进行记录），提示当前用户对输入信息进行修改
				if (idpass.equals(nullCount)) {
					userCount++;
				}
			}
			// userCount!=0,当前用户输入的信息与已经保留的用户信息有一致，不允许注册
			if (userCount != 0) {
				Alert warning = new Alert(AlertType.WARNING, "该账号已被注册！");
				warning.setTitle("账号已被注册");
				warning.show();

			} else {
				FileWriter User = new FileWriter("file/user.txt", true);// user.txt记录用户的所有信息
				FileWriter IdName = new FileWriter("file/idname.txt", true);
				String info = id.getText() + "  " + password.getText() + " " + sex.getText() + " " + school.getText()
						+ "\n";// 用户信息合并
				String idname = id.getText() + " " + password.getText() + "\n";
				IdName.write(idname);// 将账号密码信息存入IdName
				IdName.close();
				User.write(info);// 将用户全部信息写入User
				User.close();
				Alert warning = new Alert(AlertType.INFORMATION, "账号注册成功！");
				warning.setTitle("注册成功");
				warning.show();
			}
			// 关闭文件输入
			br.close();
		}
	}

	// 返回登录界面
	@FXML
	void backCK(ActionEvent event) throws IOException {
		// 若用户有输入，询问是否保留输入信息，若不保留信息直接回到登录界面

		if (!id.getText().equals("") || !name.getText().equals("") || !sex.getText().equals("")
				|| !password.getText().equals("") || !school.getText().equals("")) {
			// 对话框 Alert Alert.AlertType.CONFIRMATION
			Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
			// 设置对话框标题
			alert.setTitle("信息确认");
			// 设置内容
			alert.setHeaderText("确定要退出注册界面吗？");
			// 显示对话框
			Optional<ButtonType> result = alert.showAndWait();
			// 如果点击OK
			if (result.get() == ButtonType.OK) {
				Stage loginStage = new Stage();
				Scene loginScene = new Scene(new Login(loginStage));
				loginStage.setTitle("登录");
				loginStage.setScene(loginScene);
				loginStage.show();
				oldStage.hide();
				// 否则
			} else {
				event.consume();
			}
		}
		// 用户没有输入任何信息，直接跳转回登录界面
		else {
			Stage loginStage = new Stage();
			Scene loginScene = new Scene(new Login(loginStage));
			loginStage.setTitle("登录");
			loginStage.setScene(loginScene);
			loginStage.show();
			oldStage.hide();
		}
	}

	// 舞台搭建
	public void setOldStage(Stage stage) {
		oldStage = stage;// TODO 自动生成的方法存根

	}

}
