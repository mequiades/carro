/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import graphics.*;
import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author Estudiante
 */
public class LoopJuego extends AnimationTimer {

    private GraphicsContext gc;//Vista
    private Carro carro;

    public LoopJuego(GraphicsContext gc) {
        this.gc = gc;
        this.carro = new Carro (0, 200);
    }
    
    
    
    @Override
    public void handle(long l) {
        gc.clearRect(0, 0, 300, 300);
        gc.fillOval(this.carro., l, l, l);
        gc.fillRect(this.carro.getX(),this.carro.getY(),20,20);
        this.carro.mover();
    }
    
}
