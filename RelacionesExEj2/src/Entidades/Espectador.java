/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Ignacio González
 */
public class Espectador {
    String nombre ,Butaca;
    int edad,Dinero_Disponible ; 
    public Espectador(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public int getDinero_Disponible() {
        return Dinero_Disponible;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setDinero_Disponible(int Dinero_Disponible) {
        this.Dinero_Disponible = Dinero_Disponible;
    }

    public String getButaca() {
        return Butaca;
    }

    public void setButaca(String Butaca) {
        this.Butaca = Butaca;
    }
    
}
