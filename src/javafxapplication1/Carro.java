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
public class Carro {
   Posicion posicion=new Posicion();
   private Llanta[] llanta;
   private Chasis chasis;

    public Carro(int x,int y) {
     this.posicion.setEjex(x);
       this.posicion.setEjey(y);
       this.llanta= new Llanta[2];
       
       this.chasis=new Chasis(this.posicion.getEjex(),this.posicion.getEjey());
       
       this.llanta[0]=new Llanta(this.posicion.getEjex()+10,this.posicion.getEjey()+14);
       this.llanta[0]=new Llanta(this.posicion.getEjex()+20,this.posicion.getEjey()+14);
       }
    
    public void Mover (){
        
        
        
    }
    
    
    
}
