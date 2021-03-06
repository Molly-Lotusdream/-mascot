package fill;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import login.Login;
import login.Menu;

public class Fill4Controller {
	@SuppressWarnings("unused")
	private Stage oldStage = null;
	private String id = new String();
	@FXML
	private Button next;

	@FXML
	private Button ret;

	@FXML
	private Label ans3;

	@FXML
	private Label ans2;

	@FXML
	private Button last;

	@FXML
	private Label ans1;

	@FXML
	private TextField input3;

	@FXML
	private TextField input2;

	@FXML
	private TextField input1;

	@FXML
	private Label ques3;

	@FXML
	private Label ques2;

	@FXML
	private Label ques1;

	@FXML
	private Button exit;

	@FXML
	private ImageView view;

	@FXML
	void nextCK(ActionEvent event) {
		Stage fill1Stage = new Stage();
		Scene fill1Scene = new Scene(new Fill1(fill1Stage,id));
		fill1Stage.setTitle("知识测验");
		fill1Stage.setScene(fill1Scene);
		fill1Stage.show();
		oldStage.hide();
	}

	@FXML
	void exitCK(ActionEvent event) {
		Stage loginStage = new Stage();
		Scene loginScene = new Scene(new Login(loginStage));
		loginStage.setTitle("登录");
		loginStage.setScene(loginScene);
		loginStage.show();
		oldStage.hide();
	}

	@FXML
	void retCK(ActionEvent event) {
		Stage menuStage = new Stage();
		Scene menuScene = new Scene(new Menu(menuStage, id));
		menuStage.setTitle("菜单");
		menuStage.setScene(menuScene);
		menuStage.show();
		oldStage.hide();
	}

	@FXML
	void lastCK(ActionEvent event) {
		Stage fill3Stage = new Stage();
		Scene fill3Scene = new Scene(new Fill3(fill3Stage,id));
		fill3Stage.setTitle("知识测验");
		fill3Stage.setScene(fill3Scene);
		fill3Stage.show();
		oldStage.hide();
	}

	@FXML
	void ans1RET(ActionEvent event) {
		ans1.setVisible(true);
	}

	@FXML
	void ans2RET(ActionEvent event) {
		ans2.setVisible(true);
	}

	@FXML
	void ans3RET(ActionEvent event) {
		ans3.setVisible(true);
	}

	public void setOldStage(Stage stage) {
		oldStage = stage;// TODO 自动生成的方法存根

	}

	public void setQues4() throws IOException {
		File f = new File("file/ques4.txt");
		BufferedReader br = new BufferedReader(new FileReader(f));
		String line = null;
		while ((line = br.readLine()) != null) {
			String[] tokens = line.split(" ");
			ques1.setText(tokens[0]);
			ques2.setText(tokens[1]);
			ques3.setText(tokens[2]);
		}
		br.close();
	}

	public void setAns4() throws IOException {
		File f = new File("file/ans4.txt");
		BufferedReader br = new BufferedReader(new FileReader(f));
		String line = null;
		while ((line = br.readLine()) != null) {
			String[] tokens = line.split(" ");
			ans1.setText(tokens[0]);
			ans2.setText(tokens[1]);
			ans3.setText(tokens[2]);
			ans1.setVisible(false);
			ans2.setVisible(false);
			ans3.setVisible(false);
		}
		br.close();
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
