/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesej1;

import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ignacio González
 */
public class RelacionesEj1 {

    /** 
     * 
     * Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
        clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
        atributos: nombre, apellido, edad, documento y Perro.
        Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
        pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
        la clase Persona, la información del Perro y de la Persona.
        * 
        * 
        * Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
            tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
            cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
            al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
            persona.
            Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
            personas con sus respectivos perros.
        * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Persona> Personas = new ArrayList();
        ArrayList<Perro> perrosDisponibles = new ArrayList();
        Scanner read = new Scanner(System.in);
        String op = null;
        boolean x = false ;
         do {
             System.out.println("Desea anotar una persona o a un animal ? (P/A) :  ");
             System.out.println("Presine 'X' para terminar cerrar el registro   : ");
             op = read.next();
             if (op.equalsIgnoreCase("P")) {
                 Persona p = new Persona();
                 p.CrearPersona();
                 Personas.add(p);
             }else if (op.equalsIgnoreCase("A")){
                 Perro perro = new Perro();
                 perro.CrearPerro();
                 perrosDisponibles.add(perro);
             }
        } while(!op.equalsIgnoreCase("x"));
         for(Persona persona : Personas){
             System.out.println("Hola "+persona.getNombre()+"! , debajo esta la lista disponible de perros a adoptar");
             for(Perro perro : perrosDisponibles){
                 System.out.println(perro);
             }
            while(x == false){
                System.out.println("Ingrese el nombre del perro que desearia adoptar : ");
                String nombreP = read.next() ;
                for(Perro perro : perrosDisponibles){
                    if (perro.getNombre().equalsIgnoreCase(nombreP)) {
                        if (perro.isAdoptado()==false) {
                            persona.setPerro(perro);
                            x = true;
                        }else{
                            System.out.println("Este perro ya fue adoptado");
                        }
                    }else{
                        x = true ;
                    }
                 }
            }
        }
        System.out.println("Lista de personas que adoptaron perros : ");
        for(Persona persona1 :Personas){
            System.out.println(persona1);
        }
    }
}
