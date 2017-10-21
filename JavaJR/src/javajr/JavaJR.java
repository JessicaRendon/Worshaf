/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javajr;

import java.util.Scanner;

/**
 *
 * @author Labing I5
 */
public class JavaJR{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner s = new Scanner (System.in);
       int A,B,ad,ac,c,j,r,cont;
       String m,d;
        System.out.println("Digite primera area");
        A=s.nextInt();
        System.out.println("Digite segunda area");
        B=s.nextInt();
        System.out.println("Digite cantidad de arma a distancia");
        ad=s.nextInt();
        System.out.println("Digite cantidad de arma cuerpo a cuerpo");
        ac=s.nextInt();
        System.out.println("Digite cantidad de curas");
        c=s.nextInt();
        System.out.println("Digite cantidad de jugadores");
        j=s.nextInt();
        System.out.println("Digite cantidad de refugios");
        r=s.nextInt();
       Mapa mapa=new Mapa(A,B,ad,ac,c,j,r);
       mapa.imprimir();
        System.out.println("");
        do{
        m=s.nextLine();
        System.out.println("Que jugador desea mover?");
        m=s.nextLine();
        System.out.println("En que direccion? \n    W  \n A     D \n    S");
        d=s.nextLine();
        mapa.mover(m, d);
        mapa.imprimir();
        System.out.println("Desea mover otro jugador? \n 1 Si \n 0 No");
        cont=s.nextInt();
        }while(cont!=0);
    }
   
}