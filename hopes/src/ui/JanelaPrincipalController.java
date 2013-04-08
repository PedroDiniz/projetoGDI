package ui;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.net.URL;
import java.util.GregorianCalendar;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import jfxtras.labs.internal.scene.control.skin.CalendarTextFieldCaspianSkin;
import jfxtras.labs.scene.control.CalendarTextField;

public class JanelaPrincipalController implements Initializable{

	private Toolkit toolkit = Toolkit.getDefaultToolkit();
	private Dimension dim = toolkit.getScreenSize();
	
	@FXML
	private Text dataHoraEntrada;
	@FXML
	private Text cpfLabel;
	@FXML
	private Text dataNascLabel;
	@FXML
	private Text dataEntrada;
	@FXML
	private Text dataSaida;
	@FXML
	private Text dataPrevisaoAlta;
	@FXML
	private AnchorPane panePrincipal;
	@FXML
	private TabPane tabPaneInicial;
	@FXML 
	private AnchorPane paneTabPane;
	@FXML 
	private Tab tabPaneFichaAten;
	@FXML 
	private AnchorPane paneTabPaneFichaAten;
	@FXML 
	private Tab tabPaneConsulta;
	@FXML 
	private AnchorPane paneTabPaneConsulta;
	@FXML 
	private Tab tabPaneServGeral;
	@FXML 
	private AnchorPane paneTabPaneServGeral;
	@FXML 
	private Tab tabPanePaciente;
	@FXML 
	private AnchorPane paneTabPanePaciente;
	@FXML 
	private Tab tabPaneAcom;
	@FXML 
	private AnchorPane paneTabPaneAcom;
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		CalendarTextField calTextField = new CalendarTextField();
	    calTextField.setPrefWidth(150);
	    calTextField.valueProperty().set(new GregorianCalendar(2010, 2, 01));
	    calTextField.setLayoutX(dataNascLabel.getLayoutX() + 115);
	    calTextField.setLayoutY(dataNascLabel.getLayoutY() - 15);
	    paneTabPane.getChildren().add(calTextField);
	    
	    CalendarTextField c1 = new CalendarTextField();
	    c1.setPrefWidth(150);
	    c1.valueProperty().set(new GregorianCalendar(2010, 2, 01));
	    c1.setLayoutX(dataNascLabel.getLayoutX() + 115);
	    c1.setLayoutY(dataNascLabel.getLayoutY() - 15);
	    paneTabPaneServGeral.getChildren().add(c1);
	    
	    CalendarTextField c2 = new CalendarTextField();
	    c2.setPrefWidth(150);
	    c2.valueProperty().set(new GregorianCalendar(2010, 2, 01));
	    c2.setLayoutX(dataNascLabel.getLayoutX() + 115);
	    c2.setLayoutY(dataNascLabel.getLayoutY() - 15);
	    paneTabPaneAcom.getChildren().add(c2);
	    
	    CalendarTextField c3 = new CalendarTextField();
	    c3.setPrefWidth(150);
	    c3.valueProperty().set(new GregorianCalendar(2010, 2, 01));
	    c3.setLayoutX(dataNascLabel.getLayoutX() + 115);
	    c3.setLayoutY(dataNascLabel.getLayoutY() - 15);
	    paneTabPanePaciente.getChildren().add(c3);
	    
	    
		CalendarTextField calTextField2 = new CalendarTextField();
	    calTextField2.setPrefWidth(150);
	    calTextField2.valueProperty().set(new GregorianCalendar(2010, 2, 01));
	    calTextField2.setLayoutX(dataHoraEntrada.getLayoutX() + 145);
	    calTextField2.setLayoutY(dataHoraEntrada.getLayoutY() - 15);
	    calTextField2.showTimeProperty().set(true);
	    paneTabPaneFichaAten.getChildren().add(calTextField2);
	    
	    CalendarTextField calTextField3 = new CalendarTextField();
	    calTextField3.setPrefWidth(150);
	    calTextField3.valueProperty().set(new GregorianCalendar(2010, 2, 01));
	    calTextField3.setLayoutX(dataEntrada.getLayoutX() + 120);
	    calTextField3.setLayoutY(dataEntrada.getLayoutY() - 15);
	    calTextField3.showTimeProperty().set(true);
	    paneTabPaneConsulta.getChildren().add(calTextField3);
	    
	    CalendarTextField calTextField4 = new CalendarTextField();
	    calTextField4.setPrefWidth(150);
	    calTextField4.valueProperty().set(new GregorianCalendar(2010, 2, 01));
	    calTextField4.setLayoutX(dataSaida.getLayoutX() + 120);
	    calTextField4.setLayoutY(dataSaida.getLayoutY() - 15);
	    calTextField4.showTimeProperty().set(true);
	    paneTabPaneConsulta.getChildren().add(calTextField4);
	    
	    CalendarTextField calTextField5 = new CalendarTextField();
	    calTextField5.setPrefWidth(150);
	    calTextField5.valueProperty().set(new GregorianCalendar(2010, 2, 01));
	    calTextField5.setLayoutX(dataPrevisaoAlta.getLayoutX() + 120);
	    calTextField5.setLayoutY(dataPrevisaoAlta.getLayoutY() - 15);
	    calTextField5.showTimeProperty().set(true);
	    paneTabPaneConsulta.getChildren().add(calTextField5);
		
	}
	
	
}
