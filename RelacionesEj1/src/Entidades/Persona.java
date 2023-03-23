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
public class Persona {
    String nombre ,apellido ;
    int edad ;
    int documento ;
    Perro perro ;

    public Persona() {
    }
    
    
    public Persona(String nombre, String apellido, int edad,int documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
 
    }
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public int getDocumento() {
        return documento;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    public void Mostrar(){
        System.out.println(toString());
    }
    
    
    public void CrearPersona(){
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese nombre de la persona  : ");
        setNombre(read.next());
         System.out.println("Ingrese apellido de la persona  : ");
        setApellido(read.next());
         System.out.println("Ingrese documento de la persona  : ");
        setDocumento(read.nextInt());
        System.out.println("Ingrese edad de la persona  : ");
        setEdad(read.nextInt());
    }
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento + ", perro=" + perro + '}';
    }
    
   
}
