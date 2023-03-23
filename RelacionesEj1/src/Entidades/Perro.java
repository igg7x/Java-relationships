/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Ignacio González
 */
public class Perro {
    
    String nombre ,raza ,tamaño ; 
    int edad ;
    boolean Adoptado ;
    public Perro() {
    }

    public Perro(String nombre, String raza, String tamaño, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.tamaño = tamaño;
        this.edad = edad;
    }

    public void setAdoptado(boolean Adoptado) {
        this.Adoptado = Adoptado;
    }

    public boolean isAdoptado() {
        return Adoptado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public String getTamaño() {
        return tamaño;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
     public void CrearPerro(){
         Scanner read = new Scanner(System.in);
         System.out.println("Ingrese el nombre del perro : ");
         setNombre(read.next());
         System.out.println("Ingrese la raza del perro :");
         setRaza(read.next());
         System.out.println("Ingrese el tamaño del perro : ");
         setTamaño(read.next());
         System.out.println("Ingrese la edad del perro : ");
         setEdad(read.nextInt());
     }
    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", tamanio=" + tamaño + ", edad=" + edad + '}';
    }
    
}
