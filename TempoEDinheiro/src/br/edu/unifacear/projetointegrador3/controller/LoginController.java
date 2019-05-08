package br.edu.unifacear.projetointegrador3.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController implements Initializable{

	@FXML
	private Label lblNomeLogin;

	@FXML
	private Label lblSenhaLogin;

	@FXML
	private TextField txtUsuarioLogin;

	@FXML
	private PasswordField txtSenhaUsuario;

	@FXML
	private Button btnLogarUsuario;

	@FXML
	private Button btnRegistrarSe;

	@FXML
	private Label txtNSouCad;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}


}
