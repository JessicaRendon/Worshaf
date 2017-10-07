/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javajr;

import java.util.Random;

/**
 *
 * @author Labing I5
 */
public class Mapa{
    int b,a;

   Casilla[][] mapa;

   Random randomcito=new Random();
   
   public Mapa(int A, int B,int Armas, int Curas, int Jugadores)
   {
       a=A;
       b=B;
       mapa=new Casilla[A+2][B+2];
       for (int i=0; i<A+2;i++){
             for (int j=0; j<B+2;j++){
             mapa[i][j]=new Vacio();    
             }
        }      
           for (int i=0;i<B+2;i++){
                mapa[0][i]=new Borde();
             mapa[A+1][i]=new Borde();
                
        }
             for (int i=0; i<A+2;i++){
                mapa[i][0]=new Borde();
               mapa[i][B+1]=new Borde();
                
             }
        int a=0;
        while(a<Jugadores)
        {
            if(a<9){
            int i=randomcito.nextInt(A+1);
            int j=randomcito.nextInt(B+1);
            if(mapa[i][j].isVacio()){
                 mapa[i][j]=new Jugador(a+1);
                 a++;
            }
        }
        }
         a=0;
        while(a<Armas)
        {
            int i=randomcito.nextInt(A+1);
            int j=randomcito.nextInt(B+1);
            if(mapa[i][j].isVacio()){
                mapa[i][j]=new Arma();   
                a++;
            }
        }
        a=0;
        while(a<Curas)
        {
            int i=randomcito.nextInt(A+1);
            int j=randomcito.nextInt(B+1);
            if(mapa[i][j].isVacio()){
                 mapa[i][j]=new Cura();
                 a++;
            }
        }  

   }
   public void imprimir(){
        for (int i=0; i<a+2;i++){
             for (int j=0; j<b+2;j++){
                 System.out.print(mapa[i][j].getCasilla()+" ");
             }
             System.out.println();
        }
   }
} 
   

    

