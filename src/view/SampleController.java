package view;

import control.*;
import model.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SampleController {
	Play play = new Play();

	@FXML
	private Label myLabel;
	
	public Label getMyLabel() {
		return myLabel;
	}
	public void setMyLabel(Label myLabel) {
		this.myLabel = myLabel;
	}
	
	public void north(ActionEvent e) {
		//getMyLabel().setText("haloooo");
		play.Process("n");
	}
	public void east(ActionEvent e) {
		play.Process("e");
	}
	public void west(ActionEvent e) {
		play.Process("w");
	}
	public void south(ActionEvent e) {
		play.Process("s");
	}
}
