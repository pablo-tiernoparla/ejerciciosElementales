package com.tiernoparla.ejercicioselementales;

import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;
import java.util.regex.*;
import java.util.*;

public class ejerciciosElementales {

    public static void interes() {
        //hacer metodo con el interes
        //interes X años
        double n = 100;
        double in = 5;
        double y = 3;
        double interest;
        for (int i = 0; i < y; i++) {
            interest = n + n * in / 100;
            n = interest;
            //System.out.println(interest);
        }//for
        System.out.println(n);
    }//interes

    //primos gemelos
    public static boolean isPrime(int p) {

        //boolean isPrime = true;
        for (int i = 2; i < p; i++) {
            if (p % i == 0) {
                return false;
            }//if
        }//for
        return true;
    }

    public static void primosGemelos(int n) {

        for (int i = 2; i < n; i++) {
            if (isPrime(i) == true && isPrime(i + 2)) {
                System.out.print(i);
                System.out.print(" ");
                System.out.println(i + 2);
            }//if
        }//for
    }//primosGemelos

    public static void scanNums() {
        
        Scanner sc = new Scanner(System.in);
        int tam;
        System.out.println("Cantidad de numeros");
        tam = sc.nextInt();
        int nums[] = new int[tam];
        for (int j = 0; j < tam; j++) {
            System.out.println("Numero en posicion " + j);
            nums[j] = sc.nextInt();
        }//for
    }//scanNums
    
    public static void scanConsec(){
        
        Scanner sc = new Scanner(System.in);
        int tam;
        System.out.println("Cantidad de numeros");
        tam = sc.nextInt();
        int nums[] = new int[tam];
        for (int j = 0; j < tam; j++) {
            System.out.println("Numero en posicion " + j);
            nums[j] = sc.nextInt();
        }//for
        int cont = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] + 1 == nums[i]) {
                cont++;
            }//if
        }//for
        if (cont == nums.length - 1) {
            System.out.println("Son consecutivos");
        } else {
            System.out.println("No son consecutivos");
        }//if
    }//scanConsec

    public static void numMedio() {

        //num del medio
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.println("Dame 3 numeros");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        double num = (a * Math.pow(10, 2)) + (b * Math.pow(10, 1)) + c;
        System.out.println("Numero para averiguar si es el del medio");
        int med;
        med = sc.nextInt();
        if (med == b) {
            System.out.println(med + " es el numero del medio");
        } else {
            System.out.println(med + " no es el numero del medio");
        }//if
    }//numMedio

    public static ArrayList<Integer> facto(int n) {

        ArrayList<Integer> nums = new ArrayList<Integer>();
        Integer fact = 2;
        int[] save = {};
        Integer i = 0;
        while (n != 1) {
            if (n % fact == 0) {
                n = n / fact;
                nums.add(fact);
                i++;
            } else {
                fact++;
            }//if
        }//while
        return nums;
    }//facto

    public static int[] sacarDigits(Integer n) {

        int tmp = n;
        String num = n.toString();
        int[] save = new int[num.length()];
        for (int i = 0; i < num.length(); i++) {
            save[i] = tmp % 10;
            tmp = tmp / 10;
        }//for
        return save;
    }//vuelta

    public static void pares(int n) {

        int[] saved = sacarDigits(n);
        int cont = 0;
        for (int i = 0; i < saved.length; i++) {
            if (saved[i] % 2 == 0) {
                cont++;
            }//if
        }//for
        if (cont == saved.length) {
            System.out.println("Los digitos son pares");
        } else {
            System.out.println("Los digitos no son pares");
        }//if
    }//pares

    public static void vueltaString(String frase) {

        char[] vuelta = new char[frase.length()];
        int j = frase.length() - 1;
        for (int i = 0; i < frase.length(); i++) {
            vuelta[j] = frase.charAt(i);
            j--;
        }//for
        System.out.println(String.valueOf(vuelta));
    }//vueltaString

    public static void printDigits(int[] digits) {
        System.out.println(digits[0] + " " + digits[1] + " " + digits[2] + " " + digits[3] + " " + digits[4]);
    }//printDigits

    public static boolean continueCondition(int[] digits) {
        return digits[0] < 10 && digits[1] < 10 && digits[2] < 10 && digits[3] < 10 && digits[4] < 10;
    }//stopCondition
    
    public static int updateNext(int[] digits, int pos) {
        
        if (digits[pos] == 10)  {
            return digits[pos+1]+1;
        }//if
        return digits[pos+1];
    }//updateNext
    
    public static int updateThis(int[] digits, int pos)  {
        if(digits[pos] == 10)  {
            return 0;
        }//if
        return digits[pos];
    }//updateThis
    
    public static void main(String[] args) {
        
        //x^2 hasta negativo
        
        /*
        //primos hasta n
        int tam = 50;
        for (int i = 0; i < tam; i++)  {
            if (isPrime(i))  {
                System.out.println(i);
            }//if
        }//for
        */
        /*
        //cuadrado n*
        int tam = 7;
        char[][] matrix = new char [tam][tam];
        for (int i = 0; i < tam; i++)  {
            for (int j = 0; j < tam; j++)  {
                matrix[i][j] = '*';
            }//for
        }//for
        for (char[] arr : matrix) {
            System.out.println(Arrays.toString(arr));
        }//for
        */
        //tablas multiplicar
        /*
        int[][] matrix = new int [10][10];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < 10; j++) {
                matrix[i][j] = (i+1) * (j+1);
                //System.out.print(matrix[i][j]);
            }//for
            //System.out.println("");
        }//for
        for (int[] arr : matrix) {
            System.out.println(Arrays.toString(arr));
        }//for
        */
        //del 1 al 9
        /*
        final int TAM = 5;
        int[] digits = new int[TAM];
        while (continueCondition(digits)) {
            printDigits(digits);
            digits[0]++;
            for (int i = 0; i < digits.length - 1; i++)  {
                digits[i+1] = updateNext(digits, i);
                digits[i] = updateThis(digits, i);
            }//for
        }//while
        */
        /*
        //gcd recursividad
        Scanner sc = new Scanner(System.in);
        int tam;
        System.out.println("Cantidad de numeros");
        tam = sc.nextInt();
        int nums[] = new int[tam];
        for (int j = 0; j < tam; j++) {
            System.out.println("Numero en posicion " + j);
            nums[j] = sc.nextInt();
        }//for
        int gcd = 1;
        for (int i = 1; i <= nums[0] && i <= nums[1]; i++){
            if (nums[0] % i == 0 && nums[1] % i == 0){
                gcd = i;
            }//if
        }//for
        System.out.println("El gcd es: " + gcd);
        */
        //vuelta string
        //vueltaString("hola");
        //si son vocales con regex
        /*
        String frase = "asdfghjklñ";
        int vocal = 0;
        char[] save = new char [frase.length()];
        for (int i = 0; i < frase.length(); i++)  {
            save[i] = frase.charAt(i);
            if (save[i] == 'a' || save[i] == 'e' || save[i] == 'i' 
                    || save[i] == 'o' || save[i] == 'u')  {
                vocal++;
            }//if
        }//for
        System.out.println(vocal);
         */
        //si son pares
        //pares(2468);
        //factorizacion
        //facto(432);
        //si uno es el del medio
        //numMedio();
        //si son consecutivos
        //scanNums();
        //cuantos X hay en n
        /*
        Integer n = 1234522;
        String tam = n.toString();
        char x = '2';
        int cont = 0;
        for (int i = 0; i < tam.length(); i++)  {
            if (tam.charAt(i) == x)  {
                cont++;
            }//if
        }//for
        System.out.print("La cantidad de" + x + "que hay es: ");
        System.out.println(cont++);
         */
        //numeros primos gemelos hasta n metodo
        /*
        primosGemelos(50);
         */
        //triangulo sabiendo lados
        /*
        double lado1 = 10;
        double lado2 = 15;
        double lado3 = 20;
        double smp = (lado1+lado2+lado3) /2;
        double area = Math.sqrt(smp*(smp-lado1)*(smp-lado2)*(smp-lado3));
        System.out.print(area);
        System.out.println("m^2");
         */
 /*
        //matriz NxN
        int tam = 3;
        int[][] mat = new int[tam][tam];
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                double rnd = Math.round(Math.random());
                mat[i][j] = (int) rnd;
                //System.out.print(mat[i][j]);
            }//for
            System.out.println("");
        }//for
        
        for (int[] arr : mat) {
            System.out.println(Arrays.toString(arr));
        }//for
         */
 /*
        //password valido
        String pass = "qwerty   uiop01b";
        String moded = pass.replaceAll("[^ a-zA-Z[0-9]]", "!");
        String fin = moded.replaceAll("\\s+", "!");
        char[] save = new char[pass.length()];
        int chara = 0;
        int nums = 0;
        int spc = 0;
        for (int i = 0; i < fin.length(); i++) {
            save[i] = fin.charAt(i);
            chara = chara + 1;
            if (Character.isDigit(save[i])) {
                nums = nums + 1;
            } else if (save[i] == '!') {
                spc = spc + 1;
            }
        }//for  
        if (chara < 10 || nums < 2 || spc != 0) {
            System.out.println("Contraseña invalida");
        } else {
            System.out.println("Contraseña valida");
        }//if
         */
        //Calcular año bisiesto
        /*
        int num = 2024;
        if (num % 4 != 0)  {
            System.out.println("Año no bisiesto");
        } else if (num % 100 !=0)  {
            System.out.println("Año bisiesto");
        } else if (num % 400 !=0) {
            System.out.println("Año no bisiesto");
        } else {
            System.out.println("Año bisiesto");
        }
         */ //interes();
        //sumar digitos
        /*
        Integer num = 12345;
        String tam;
        tam = num.toString();
        Integer x = 0;
        Integer[] save = new Integer[tam.length()];
        for (int i = 0; i < tam.length(); i++) {
            save[i] = num % 10;
            num = num / 10;
            x = x + save[i];
        }
        System.out.println(x);
         */ //contar palabras
        /*
        String frase = "   Salimos    a     las    8  ";
        frase = frase.trim();
        String[] palabras = frase.split("\\s+");
        System.out.println(palabras.length);
         */ //contar vocales
        /*
        char[] vocal = {'a','e','i','o','u'};
        String frase = "abcdefgo";
        int vocales = 0;
        char[] save = new char[frase.length()];
        //for(char c: vocales.toCharArray()){}
        for (int i = 0; i < frase.length(); i++){
            save[i] = Character.gtoLowerCase(frase.charAt(i));
            if (save[i] == vocal[0] || save[i] == vocal[1] || 
                    save[i] == vocal[2] || save[i] == vocal[3] || 
                    save[i] == vocal[4]) {
                vocales = vocales + 1;
            }//if
        }//for
        System.out.println(vocales);
         */ //caracter del medio
        /*
        String palabra = "abcde";

        if (palabra.length() % 2 != 0) {
            System.out.println(palabra.charAt(palabra.length() / 2));
        } else {
            System.out.println(palabra.substring((palabra.length() / 2)-1,
        (palabra.length() / 2)+1 ));
        }
         */ //media
        /*
        int[] num = {1, 2, 3, 4};
        double x = 0;
        for (int i = 1; i < num.length; i++) {
            num[i] = num[i] + num[i - 1];
            //System.out.println(num[i]);
            x = (double)num[i]/num.length;
        }
        System.out.println(x);
         */ /*
        //menor numero
        double[] num = {1, -7.2, 4.5, -21, 3.14, 0, -500.6};
        double x = num[0];
        for (int i = 1; i < num.length; i++) {
            if (x >= num[i]) {
                x=num[i];
            }// se puede usar else pero no hace falta
        }
        System.out.println(x);
         */ //capicua while
        /*
        int n = 31752;
        int tmp = n;
        int cifra;
        int reverso = 0;
        while (tmp > 0) {
            cifra = tmp % 10;
            reverso = reverso * 10 + cifra;
            tmp = tmp / 10;
        }
        System.out.println(reverso);
         */ /*
        int tam = 5;
        int tmp = n;
        int[] save = new int[tam];
        for (int i = 0; i < tam; i++) {
            save[i] = tmp % 10;
            tmp = tmp / 10;
        }
        double x = 0;
        for (int i = 0; i < tam; i++) {
            x = x + save[i] * Math.pow(10, tam - (i + 1));
        }
        System.out.println((int) x);
        /*System.out.println(n%10);
        System.out.println((n/10)%10);
        System.out.println(((n/10)/10)%10);
        System.out.println((((n/10)/10)/10)%10);
        System.out.println(((((n/10)/10)/10)/10)%10);
         */ /*
        String[] palabras = {"hola","adios"};
        System.out.println(palabras[0]);
        System.out.println(palabras[1]);
        
        palabras[0] = "algo aqui";
        System.out.println(palabras[0]);
        
        for(int i = 0; i < palabras.length; i++){
            System.out.println(palabras[i]);
        }// for
        
        //guardar en array fibonacci
        int x1 = 1;
        int x2 = 1;
        int x3 = 0;
         */ //int[] x={1,1,0};
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
         */ /*
        for (int i=2; i < n; i++){
           save[i]= save[i-1] + save[i-2];
        }
        for (int i=0; i<save.length; i++){
            System.out.println(save[i]);
        }
         */ //division con scanner
        /*
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Dame un dividendo entero");
        n = sc.nextInt();
        int d;
        System.out.println("Dame un divisor entero");
        d = sc.nextInt();
        
        //division
        int r = n;
        int q = 0;
        while (r >= d){
            r = r-d;
            q++;
        }//whileg    
        System.out.println("N="+n+" D="+d+" R="+r+" Q="+q);
        System.out.print("N=d*q+r=");
        System.out.println((d*q)+r);
         */ /*
        int i = 0;
        while(i < 11){
            i++;
            if(i%2 == 0){
                System.out.println(i);
            }// if
        }// while
         */ /*
        //printear del 1 al 10 pares v2
        for(int i = 1; i < 11; i++){
            if(i%2 == 0){
                System.out.println(i);
            }// if
        }// for
         */ /*
        // printear numeros pares 1 al 10
        for(int i = 2; i < 11; i = i + 2) {
            System.out.println(i);
        } // for
         *//* {

        }*/
    } // main
}// ejerciciosElementales
