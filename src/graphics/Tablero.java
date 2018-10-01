/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Estudiante
 */
public class Tablero extends Application{

    /**
     *
     * @param stage
     */
    @Override 
public void start(Stage stage){ 
        //Layout
        Pane panel = new Pane();
        Canvas canvas =
                new Canvas(300, 300);
        panel.getChildren() .add(canvas);
        Scene scene =
                new Scene(panel, 300, 300);
        
        
        
        //ameLoop extends AnimationTimer
        //Referencia del lapiz para dibujasr sobre
        //canvas
        GraphicsContext gc =
                canvas.getGraphicsContext2D();
        //Dibujar un rectangulo
        //gc.setFill(Color.RED);
        //gc.fillRect(10, 10, 20, 20);
       
        LoopJuego loop = new LoopJuego(gc);
        loop.start();
        
        stage.setTitle("Ejemplo Canvas");
        stage.setScene(scene);
        stage.show();
}

public static void main(String[] args ){
    Application.launch(args);
}
}
