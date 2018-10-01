/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.awt.Color;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Estudiante
 */
public class JavaFXApplication1 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane panel=new Pane();
        Canvas canvas=new Canvas(300,300);
        panel.getChildren().add(canvas);
        Scene scene=new Scene(panel,300,300);
        GraphicsContext gc= canvas.getGraphicsContext2D();
       
        
        gc.fillRect(10, 10, 20, 20);
      //  gc.setFill(Color.BLACK);
        gc.fillOval(10, 10, 50, 50);
        gc.strokeLine(10, 10, 80, 80);
        
        double xpoints[]={34,67,89};
        double ypoints[]={67,98,190};
        
        gc.strokePolygon(xpoints, ypoints,xpoints.length);
        
        loop lop=new loop(gc);
        lop.start();
        primaryStage.setTitle("ejemplo canva");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
    
   
    



}
