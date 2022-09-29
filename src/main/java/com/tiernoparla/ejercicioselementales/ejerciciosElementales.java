package com.tiernoparla.ejercicioselementales;

import java.util.Scanner;

public class ejerciciosElementales {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Dame un dividendo entero");
        n = sc.nextInt();
        int d;
        System.out.println("Dame un divisor entero");
        d = sc.nextInt();
        
        int r = n;
        int q = 0;
        while (r >= d){
            r = r-d;
            q++;
        }//while    
        System.out.println("N="+n+" D="+d+" R="+r+" Q="+q);
        System.out.print("N=d*q+r=");
        System.out.println((d*q)+r);
        
        
        /*
        int i = 0;
        while(i < 11){
            i++;
            if(i%2 == 0){
                System.out.println(i);
            }// if
        }// while
        */
        
        /*
        //printear del 1 al 10 pares v2
        for(int i = 1; i < 11; i++){
            if(i%2 == 0){
                System.out.println(i);
            }// if
        }// for
        */
        /*
        // printear numeros pares 1 al 10
        for(int i = 2; i < 11; i = i + 2) {
            System.out.println(i);
        } // for
        */

    } // main
}// ejerciciosElementales
