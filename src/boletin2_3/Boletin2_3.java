/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_3;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Boletin2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner bi= new Scanner(System.in);
        System.out.print("Teclea el nº billetes de 100€ que posee: ");
        int cien = bi.nextInt();
        System.out.print("Teclea el nº billetes de 20€ que posee: ");
        int vinte = bi.nextInt();
        System.out.print("Teclea el nº billetes de 5€ que posee: ");
        int cinco = bi.nextInt();
        System.out.print("Teclea el nº de monedas de 1€ que posee: ");
        int un = bi.nextInt();
        int a=100,b=20,c=5,d=1,w,x,y,z;
        w=cien*a;
        x=vinte*b;
        y=cinco*c;
        z=un*d;
        System.out.println("O resultado de diñeiro que se obtén é de: "+(w+x+y+z)+" €");
    }
    
}
