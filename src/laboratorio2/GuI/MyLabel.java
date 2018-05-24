/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2.GuI;

import javafx.scene.control.Label;

/**
 *
 * @author Parra G
 */

    public class MyLabel extends Label {

	public MyLabel(String text, int x, int y, int width, int height){
		super();
		this.setText(text);
		this.setPrefSize(width,height);
		this.setTranslateX(x);
		this.setTranslateY(y);
	}
}

