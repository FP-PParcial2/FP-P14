/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp.p14;
import java.util.*;

/**
 *
 * @author Esteban
 */
public class FPP14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CREACION DE MATRIZ
        int [][]Datos= new int [7][7];
        Datos=llenarDatos(Datos);
        mostrar(Datos);    
    }
    public static int [][] llenarDatos (int[][] rellena){//METODO QUE RELLENA MATRIZ CON CONDICIONES
       
        for(int i=0;i<rellena.length;i++){
            for(int j=0; j<rellena.length;j++){
                
                if(i==j){
                rellena[i][j]=1;
                }else{ rellena [i][j]=0;
                }
                    
               
            }
        }
            return rellena;
        
    }
        public static void mostrar(int[][] rellena){//ACOMODO E IMPRESION
              for(int i=0;i<rellena.length;i++){
            for(int j=0; j<rellena.length;j++){
                System.out.print(rellena[i][j]+"\t");
            }
                  System.out.println("");
              }
            
            
            
        }
            
        }
    

