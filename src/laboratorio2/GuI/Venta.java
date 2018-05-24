/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2.GuI;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.*;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import laboratorio2.logica.Factura;
import laboratorio2.logica.Supermercado;

/**
 *
 * @author Parra G
 */
public class Venta extends Pane{
    Label titulo, producto, cantidad;
    TextField txt1, txt2;
    Button button, impFactura;
    double subcosto = 0.0;
    Factura factura;
    
    
    public Venta(Supermercado s){
        
        this.setPrefSize(700, 700);
        titulo = new Label("Caja");
        titulo.setAlignment(Pos.CENTER);
        factura= new Factura(s, 0, 0, null, null);
        
        GridPane grd = new GridPane();
        grd.setPadding(new Insets(10, 10, 10, 10));
        grd.setVgap(8);
        grd.setHgap(8);
        
        producto = new Label("Producto");
        GridPane.setConstraints(producto, 0, 0);
        
        cantidad = new Label("Cantidad");
        GridPane.setConstraints(cantidad, 0, 1);
        
        txt1 = new TextField();
        GridPane.setConstraints(txt1, 1, 0);
        txt1.getText();
        txt2 = new TextField();
        GridPane.setConstraints(txt2, 1, 1);
        
        button = new Button("agregar");
        button.setOnAction( e -> {
           subcosto +=  s.vproductoPorCodigo(Integer.parseInt(txt1.getText()), Integer.parseInt(txt2.getText()));
           //subcostoF = subcostoF + subcosto1;
            System.out.println(subcosto); 

            factura.addProducto(Integer.parseInt(txt1.getText()), Integer.parseInt(txt2.getText()));
            
        });
        GridPane.setConstraints(button, 2, 2);
        
        
        impFactura = new Button ("imprimir factura");
        GridPane.setConstraints(impFactura, 3, 3);
        impFactura.setOnAction(e -> {
            factura.imprimir();
            System.out.println("   Subtotal: "+ subcosto);
            System.out.println("Costo total: "+ subcosto * 1.4);
        });
        
        
        
        grd.getChildren().addAll(producto, cantidad,txt1, txt2, button, impFactura);
        
        Label label = new Label("PRUEBA");
        BorderPane bp = new BorderPane();
        bp.setTop(label);
        bp.setCenter(grd);
        
        this.getChildren().add(bp);
        
    }
}
