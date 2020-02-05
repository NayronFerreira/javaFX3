package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ViewContoller {
	
	@FXML
	private Button btTest;
	@FXML
	private Label lbTest;
	
	@FXML
	public void onBtTestAction() {
		Alerts.showAlert("SoundRave - O App da Cena!!", null, "vai decolar", AlertType.INFORMATION); 
	}
	

}
