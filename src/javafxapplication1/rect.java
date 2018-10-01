/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

/**
 *
 * @author Estudiante
 */
public class rect {
    Posicion posicion=new Posicion();

    public rect(int x,int y) {
     this.posicion.setEjex(x);
       this.posicion.setEjey(y);
     
    }
public void  mover(){
   int x= this.posicion.getEjex();
    this.posicion.setEjex(x+1);
}


}
