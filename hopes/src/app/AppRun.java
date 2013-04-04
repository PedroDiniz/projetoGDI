package app;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;

import javafx.application.Application;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXMLLoader;
import javafx.scene.ParallelCamera;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class AppRun extends Application
{
	public Stage mainstage;
	public Parent root;
	public Scene scene;
	public Toolkit tk = Toolkit.getDefaultToolkit();
	public Dimension dim = tk.getScreenSize();

	public void start(Stage primaryStage) throws IOException
    {
        root = FXMLLoader.load(getClass().getResource("../ui/JanelaPrincipal.fxml"));     
        scene = new Scene(root);
        mainstage = primaryStage;   
        
        resizable();
        
        mainstage.setScene(scene);
        mainstage.setTitle("Sistema de Gerenciamento de Pronto-Socorro");
        mainstage.setResizable(true); 
        mainstage.setWidth(dim.getWidth());
        mainstage.setHeight(dim.getHeight());
        mainstage.centerOnScreen();
        mainstage.sizeToScene();

        scene.setCamera(new ParallelCamera());
	}
	
	public void resizable()
	{
        scene.widthProperty().addListener(new ChangeListener<Number>()
        {
            public void changed(ObservableValue<? extends Number> observableValue,
                Number oldSceneWidth, Number newSceneWidth)
            {
      //          MainWindowController.resize(scene);
	        }
	    });

	    mainstage.show();
	    SimpleDoubleProperty stageWidthProperty = new SimpleDoubleProperty(mainstage.getWidth());
	    stageWidthProperty.addListener(new ChangeListener<Number>()
        {
            public void changed(ObservableValue<? extends Number> observableValue,
                Number oldStageWidth, Number newStageWidth)
            {
                mainstage.setWidth(newStageWidth.doubleValue());
	        }
	    });
	}

	public static void main(String[] args)
    {
		launch(args);
	}
}

