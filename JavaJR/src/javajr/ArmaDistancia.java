/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javajr;

/**
 *
 * @author Labin
 */
public class ArmaDistancia extends Arma{
      public ArmaDistancia(){
      this.setCasilla(" ");
  }
  
    @Override
    public void setCasilla(String a) {
       super.valorImpresion="*"; 
    }

    @Override
    public String getCasilla() {
     return super.valorImpresion;   
    }
    @Override
    public boolean isVacio() {
     return false;
    }
    
}
