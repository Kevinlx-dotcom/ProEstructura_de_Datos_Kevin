/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.palindromo;

/**
 *
 * @author carac
 */
public class Palindromo{
    
    public static void main(String[] args){//esto es para comprpbar que funciona con palabras que realmente  son palindromo
        if (esPalindromoWrapper("oso")) {
          System.out.println("La palabra oso SI es un palindromo");
        } else {
          System.out.println("La palabra oso NO es un palindromo");
        }

        /*if (esPalindromo("pasa")) {  esto es para confirmar de que funciona para saber que no es un palindromo
          System.out.println("La palabra pasa SI es un palindromo");
        } else {
          System.out.println("La palabra pasa NO es un palindromo");
        }*/
    }
    
    
    public static boolean esPalindromoWrapper(String palabra){
        if(palabra==null){//es para que la palabra no se valla como vacio
            return false;
        }
        
        palabra=palabra.toLowerCase().replace(" ","");
        
        return esPalindromo(palabra,0,palabra.length()-1);
    }
    
    
    private static boolean esPalindromo(String palabra, int inicio, int fin){
        
        if(inicio>=fin)//esto es nuestro caso base
        {
            return true;
        }
        
        if(palabra.charAt(inicio) != palabra.charAt(fin)){
            return false;
        }
        
        return esPalindromo(palabra, inicio+1, fin-1);
    }
}
