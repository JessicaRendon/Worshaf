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
public class Jugador {
    public String valor;
    public int grupo;
    
    public Jugador(int a,int p){ 
        this.setJugador(a+"",p); 
    }

    Jugador() {
    }
 
    public void setJugador(String a,int p) {
       valor=a; 
       grupo=p;
    }


    public String getJugador() {
     return this.valor;   
    }
    
    public boolean isVacio() {
        if(this.valor!=null){
            return false;
        }else{
            return true;
        }
    }       
}
