package ui;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.net.URL;
import java.util.GregorianCalendar;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import jfxtras.labs.internal.scene.control.skin.CalendarTextFieldCaspianSkin;
import jfxtras.labs.scene.control.CalendarTextField;

public class JanelaPrincipalController implements Initializable{

	private Toolkit toolkit = Toolkit.getDefaultToolkit();
	private Dimension dim = toolkit.getScreenSize();
	
	@FXML
	private Text cpfLabel;
	@FXML
	private Text dataNascLabel;
	@FXML
	private AnchorPane panePrincipal;
	@FXML
	private TabPane tabPaneInicial;
	@FXML 
	private AnchorPane paneTabPane;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		CalendarTextField calTextField = new CalendarTextField();
	    calTextField.setPrefWidth(200);
	    calTextField.valueProperty().set(new GregorianCalendar(2011, 2, 01));
	    calTextField.setLayoutX(dataNascLabel.getLayoutX() + 115);
	    calTextField.setLayoutY(dataNascLabel.getLayoutY() - 15);
	    paneTabPane.getChildren().add(calTextField);
		
	}
	
	
}
