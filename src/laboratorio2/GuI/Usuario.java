/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2.GuI;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import laboratorio2.logica.Cliente;

/**
 *
 * @author Parra G
 */
public class Usuario {
    Cliente cl = new Cliente(null, null, 0, 0);
    
    
    public  static void display(){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Validacion Usuario");
        window.setMinWidth(350);
        
        BorderPane border= new BorderPane();
        GridPane g= new GridPane();
        
        
        
        
        
        Label label = new Label("nombre cliente:");       
        GridPane.setConstraints(label, 1, 1);
        TextField txt1 = new TextField();
        GridPane.setConstraints(txt1, 2, 1);
        
        Label label1 = new Label("Direccion:");       
        GridPane.setConstraints(label1, 1, 2);        
        
        TextField txt2 = new TextField();
        GridPane.setConstraints(txt2, 2, 2);
        
        Label label2 = new Label("telefono:");    
        GridPane.setConstraints(label2, 1, 3);
                
        TextField txt3 = new TextField();
        GridPane.setConstraints(txt3, 2, 3);
        
        int a=Integer.parseInt(txt3.getText());
        
        
        CheckBox b1 = new CheckBox("Existe Cliente");
        GridPane.setConstraints(b1, 3, 5);
        
        Button ejecutar= new Button("Guardar Info");
        GridPane.setConstraints(ejecutar, 3, 6);
        
        ejecutar.setOnAction(e -> {
            //cl.setM_nombre(txt1.getText());
        });
        
        
        
        
        
        g.getChildren().addAll(label,label1,label2,txt1,txt2,txt3,b1,ejecutar);
        
        border.setCenter(g);
        
        
        
        window.setScene(new Scene(border));
        window.showAndWait();
        
        //return cl;
    }
}
