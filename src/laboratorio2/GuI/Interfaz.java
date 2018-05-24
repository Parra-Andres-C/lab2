/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2.GuI;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Farid Estepa
 */
public class Interfaz extends Application{
    Stage window;
    Button vender, admn, regresar, back;
    Scene principal, scene1, scene2;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        launch(args); 
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
                window = primaryStage;
                window.setTitle("Exito");
                //window.setScene(new Scene(new Inicio()));
                vender = new Button("Vender");
		vender.setOnAction(e -> window.setScene(scene1));
                
                regresar = new Button ("regresar");
                regresar.setOnAction(e -> window.setScene(principal));
                
                back = new Button ("regresar");
                back.setOnAction(e -> window.setScene(principal));
                 
                VBox Layout1 = new VBox();
                Layout1.getChildren().addAll(back);
                scene1 = new Scene(Layout1, 500, 500);
                
                admn = new Button ("Administrador");
                admn.setOnAction(e -> window.setScene(scene2));
                
                VBox Layout2 = new VBox();
                Layout2.getChildren().addAll(regresar);
                scene2 = new Scene(Layout2, 500, 500);
                
                
               
		HBox stkp = new HBox(20);
                stkp.getChildren().addAll(vender, admn);
                
                principal = new Scene(stkp, 500, 500);
                
                window.setScene(principal);
		window.show();  
    }
    
}
