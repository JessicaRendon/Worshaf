/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javajr;

/**
 *
 * @author Labing I5
 */
public class Vacio extends Casilla {
    
    public Vacio(){
        this.setCasilla("");
    }
    @Override
    public void setCasilla(String a) {
       super.valorImpresion=" "; 
    }

    @Override
    public String getCasilla() {
     return super.valorImpresion;   
    }
         @Override
    public boolean isVacio() {
        if(super.jugador.isVacio()){
             return true;
        }else{
            return false;
        }
        
    }
}
