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
public class Revolver {
    
   int PosicionActual ,PosicionAgua ;

    public Revolver() {
    }

    public Revolver(int PosicionActual, int PosicionAgua) {
        this.PosicionActual = PosicionActual;
        this.PosicionAgua = PosicionAgua;
    }

    public int getPosicionActual() {
        return PosicionActual;
    }

    public int getPosicionAgua() {
        return PosicionAgua;
    }

    public void setPosicionActual(int PosicionActual) {
        this.PosicionActual = PosicionActual;
    }

    public void setPosicionAgua(int PosicionAgua) {
        this.PosicionAgua = PosicionAgua;
    }

    @Override
    public String toString() {
        return "Revolver{" + "PosicionActual=" + PosicionActual + ", PosicionAgua=" + PosicionAgua + '}';
    }
   
    public void llenarRevolver(){
        
       setPosicionActual((int) (Math.random() *5)+1);
       setPosicionAgua((int) (Math.random() *5)+1);
    }
    public boolean Mojar(){
        if (getPosicionActual()== getPosicionAgua()) {
            return true ;
        }
        return false ;
    }
    public void SiguienteChorro(){
        if (Mojar()== false && getPosicionActual()!= 6) {
            setPosicionActual(getPosicionActual()+1);
        }else if (Mojar() == false && getPosicionActual()== 6) {
            setPosicionActual(1);
        }
    }
    
}
