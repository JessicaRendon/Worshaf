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
public abstract class Casilla {
    public String valorImpresion;
    
    public abstract void setCasilla(String a);
 
    public abstract String getCasilla();
    
    public abstract boolean isVacio();
}

