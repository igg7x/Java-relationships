/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ignacio González
 */
public class JuegoService {
    Juego juego ;

    public JuegoService() {
        this.juego = new Juego();
    }
    public void EmpezarJuego(){
        Scanner read = new Scanner(System.in);
        int CantJugador = 0 ;
        System.out.println("Desea configurar la cantidad de jugadores ? (si/no)");
        String op = read.next();
        if (op.equalsIgnoreCase("si")) {
        System.out.println("Cuantos Jugadores desea para la partida ? ");
        CantJugador = read.nextInt();
        }else{
            CantJugador= 6 ;
        }
        for (int i = 0; i <CantJugador; i++) {
            String Nombre = null ;
            System.out.println("Ingrese el nombre para el jugador N° " +(i+1)+ " :");
            Nombre = read.next();
            Jugador jugador = new Jugador(i+1 ,Nombre);
            juego.getJugadores().add(jugador);
        }
        LlenarJuego(juego.getJugadores(),juego.getR());
        System.out.println("----EMPEZO EL JUEGO----");
    }
    public void LlenarJuego( ArrayList<Jugador>jugadores ,Revolver R){
        juego.setR(R);
        juego.setJugadores(jugadores);
    }
    
    public void ronda(){
        juego.getR().llenarRevolver();
        boolean x = false ;
            while(x == false){
              for(Jugador jugador : juego.getJugadores()){
                  System.out.println("Turno del  jugador N° "+(juego.getJugadores().indexOf(jugador)+1));
                  if (jugador.disparo(juego.getR())== true) {
                      x = true ;
                      break ; 
                  }else {
                      System.out.println("NO HAY AGUA");
                      juego.getR().SiguienteChorro();
                  }
                }    
            }
        for(Jugador jugador : juego.getJugadores()){
            if (jugador.isMojado() == true) {
                System.out.println("----JUEGO TERMINADO----");
                System.out.println("El jugador que se mojo es  : "+jugador);
                break;
            }
        }
    }
}
