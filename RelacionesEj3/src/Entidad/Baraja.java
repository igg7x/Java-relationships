/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import Enums.Palos;

/**
 *
 * @author Ignacio González
 */
public class Baraja {
    
    Palos palo ;
    String [] Numeros = {"1","2","3","4","5","6","7","10","11","12"};

    public Baraja() {
    }

    public String[] getNumeros() {
        return Numeros;
    }

    @Override
    public String toString() {
        return "Baraja{" + "Numero =" + Numeros + ", Palo=" + palo + '}';
    }

 
    
    
}
