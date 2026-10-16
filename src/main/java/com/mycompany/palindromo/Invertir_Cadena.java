/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.invertir_cadena;

/**
 *
 * @author carac
 */
public class Invertir_Cadena {

    public String invertirW(String texto){
        if(texto==null||texto.length()<=1)
            return "El mensaje no debe ser nulo o de un solo caracter";
        
        return invertirAuxiliar(texto,texto.length()-1);
    }
    private String invertirAuxiliar(String s, int indice){
        if(indice==0)
            return String.valueOf(s.charAt(indice));
        
        return s.charAt(indice)+invertirAuxiliar(s,indice-1);
    }
}
