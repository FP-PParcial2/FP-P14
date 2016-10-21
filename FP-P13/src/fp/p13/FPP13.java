/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp.p13;
import java.util.*;

/**
 *
 * @author Esteban
 */
public class FPP13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] vect=new int [30];
        vect=PedirNum(vect);
        
    }
    public static int[] PedirNum(int[] v){
Scanner entrada = new Scanner(System.in);
for(int i=0;i<v.length;i++){
System.out.print("Introduce un numero para la posicion ["+ (i+1) +"] :");
v[i]=entrada.nextInt();
// Random ran = new Random(); //autofill
// v[i]=ran.nextInt(100+1); //autofill
}
return v;}
public static int promedioVector(int[] v){
int a=0,p=0;
for (int i=0; i<v.length; i++){
a=v[i]+a;
p++;
}
System.out.println("El promedio de los numeros en el arreglo es: "+(a/p));
return (a/p);
}
public static void sobrePromedio(int[] v,int media){
int C=0;
for(int i=0;i<v.length;i++){
if(v[i]>media){
C++;
}
}
System.out.println("La cantidad de numeros sobre el promedio es: "+C);
System.out.println("La cantidad de numeros debajo del promedio es:"+(v.length-C));
        }
}

        
  