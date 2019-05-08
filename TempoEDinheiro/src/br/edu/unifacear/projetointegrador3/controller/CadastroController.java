package br.edu.unifacear.projetointegrador3.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class CadastroController implements Initializable{

    @FXML
    private AnchorPane paineCad;

    @FXML
    private Label lblNomeCad;

    @FXML
    private Label lblSenhaCad;

    @FXML
    private Label lblMailCad;

    @FXML
    private TextField txtUsuarioCad;

    @FXML
    private TextField txtMailCad;

    @FXML
    private PasswordField txtSenhaCad;

    @FXML
    private Button btnCadastrar;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
