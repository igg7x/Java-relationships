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
public class Jugador {
    
    int id ;
    String nombre ; 
    boolean mojado ;
    int numerosDeJugadores ;
    public Jugador() {
        numerosDeJugadores = 6 ;
    }
    public Jugador(int id, String nombre) {
        this.id = id;
        this.nombre = "jugador N° ".concat(nombre);
    }
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public int getNumerosDeJugadores() {
        return numerosDeJugadores;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public void setNumerosDeJugadores(int numerosDeJugadores) {
        this.numerosDeJugadores = numerosDeJugadores;
    }
     public boolean disparo(Revolver R ){
        if (R.Mojar()==true) {
            setMojado(true);
            return true ;
        }else{
            setMojado(false);
            return false ;
        }
    }
    @Override
    public String toString() {
        return "Jugador{" + "N°=" + id + ", nombre=" + nombre.substring(10) + '}';
    }
    
}
