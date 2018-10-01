/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import static java.lang.System.gc;
import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author Estudiante
 */
public class loop extends AnimationTimer {
    private GraphicsContext gc;
    private rect ret;
    private Carro carro;

    public loop() {
    }

    public loop(GraphicsContext gc) {
        this.gc = gc;
        this.ret=new rect(1,20);
        this.carro=new Carro(50,50);
    }
    
        
    
    @Override
    public void handle(long l) {
     gc.clearRect(0, 0, 300, 300);
     gc.fillRect(ret.posicion.getEjex(), ret.posicion.getEjey(), 10, 40);
     ret.mover();
    }
    
}
