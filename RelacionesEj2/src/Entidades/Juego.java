/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author Ignacio González
 */
public class Juego {
    
    ArrayList<Jugador> Jugadores ;
    Revolver R ;
   
    public Juego() {
        this.Jugadores = new ArrayList();
        this.R = new Revolver();
    }
    public void setJugadores(ArrayList<Jugador> Jugadores) {
        this.Jugadores = Jugadores;
    }

    public void setR(Revolver R) {
        this.R = R;
    }

    public ArrayList<Jugador> getJugadores() {
        return Jugadores;
    }

    public Revolver getR() {
        return R;
    }
    
    
}
