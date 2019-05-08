package br.edu.unifacear.projetointegrador3.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class HomeController implements Initializable {

	@FXML
	private AnchorPane paineHome;

	@FXML
	private MenuBar menubarHome;

	@FXML
	private Menu menuArquivo;

	@FXML
	private Menu menuEditar;

	@FXML
	private Menu menuAjuda;

	@FXML
	private Pane paineLatEsq;

	@FXML
	private Label lblNomedoUsuario;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

}
