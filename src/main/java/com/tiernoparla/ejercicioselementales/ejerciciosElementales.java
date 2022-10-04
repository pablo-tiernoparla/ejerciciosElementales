package com.tiernoparla.ejercicioselementales;

//import java.util.Scanner;
import java.lang.Math;

public class ejerciciosElementales {

    public static void main(String[] args) {

        int n = 31752;
        int tam = 5;
        int tmp = n;
        int[] save= new int[tam];
        for (int i = 0; i < tam; i++) {
            save[i]=tmp%10;
            tmp=tmp/10;
        }
        double x=0;
        for (int i=0;i<tam;i++){
            x=x + save[i]*Math.pow(10,tam-(i+1));
        }
        System.out.println((int)x);
        /*System.out.println(n%10);
        System.out.println((n/10)%10);
        System.out.println(((n/10)/10)%10);
        System.out.println((((n/10)/10)/10)%10);
        System.out.println(((((n/10)/10)/10)/10)%10);
         */
 /*
        String[] palabras = {"hola","adios"};
        System.out.println(palabras[0]);
        System.out.println(palabras[1]);
        
        palabras[0] = "algo aqui";
        System.out.println(palabras[0]);
        
        for(int i = 0; i < palabras.length; i++){
            System.out.println(palabras[i]);
        }// for
        
        int x1 = 1;
        int x2 = 1;
        int x3 = 0;
        
         */
        //int[] x={1,1,0};
        /*int n = 8;
        int[] save= new int[n];
        save[0]=1;
        save[1]=1;
        /*
        for(int i = 2; i < n; i++){
            x[2] = x[1] + x[0];
            x[0] = x[1];
            x[1] = x[2];
            //System.out.println(save[i]);
        }// for
         */
 /*
        for (int i=2; i < n; i++){
           save[i]= save[i-1] + save[i-2];
        }
        for (int i=0; i<save.length; i++){
            System.out.println(save[i]);
        }
         */
 /*
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
        }//whileg    
        System.out.println("N="+n+" D="+d+" R="+r+" Q="+q);
        System.out.print("N=d*q+r=");
        System.out.println((d*q)+r);
         */
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
