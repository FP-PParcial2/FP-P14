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
int []mat = new int[30];
int p,mp;
mat=Datos(mat);
p=promedio(mat);
ArribaPromedio(mat,p);
}
public static int[] Datos(int[] v){
Scanner entrada = new Scanner(System.in);
for(int i=0;i<v.length;i++){
System.out.print("Introduce un numero para la posicion ["+ (i+1) +"] :");
v[i]=entrada.nextInt();
}
return v;}
public static int promedio(int[] v){
int a=0,p=0;
for (int i=0; i<v.length; i++){
a=v[i]+a;
p++;
}
System.out.println("El promedio de los numeros en el arreglo es: "+(a/p));
return (a/p);
}
public static void ArribaPromedio(int[] v,int prom){
int c=0;
for(int i=0;i<v.length;i++){
if(v[i]>prom){
c++;
}
}
System.out.println("La cantidad de numeros sobre el promedio es: "+c);
System.out.println("La cantidad de numeros debajo del promedio es: "+(v.length-c));
}

}