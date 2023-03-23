/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Baraja;
import Enums.Palos;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ignacio González
 */
public class BarajaService {
    
    Baraja baraja ;

    public BarajaService() {
        this.baraja = new Baraja();
    }
    public String[] CrearBaraja(){
         ArrayList<String> Maso = new ArrayList() ;
         String [] maso = new String[40];
         String []numeros = baraja.getNumeros().clone();
         String [] palos = new String[4];
         int i = 0 ;
         for(Palos palo : Palos.values()){
             palos[i]=palo.toString();
             i++;
         }
         for (int j = 0; j < palos.length; j++) {
             for (int k = 0; k < numeros.length; k++) {
                 Maso.add(palos[j]+numeros[k]);
             }
         }
        return Maso.toArray(maso);
    }
    public  void Barajar(String [] Maso){
      // Collections.shuffle(Arrays.asList(Maso));
       Random random = new Random();	
       int indice = 0 ;
       while(indice < Maso.length){
        int posicion = random.nextInt(Maso.length);	
        if(!Arrays.asList(Maso).contains(Maso[posicion])){
            Maso[indice]= Maso[posicion];
            indice++;
       }
    }
    }
    public void SiguienteCarta(String [] Maso ){
        List<String> lista =  new ArrayList<>(Arrays.asList(Maso));
        Scanner read =new Scanner(System.in);
        String Res = null ;
        int i = 0 ;
        int CantCartas = 0 ;
        do {
           System.out.println("Quiere una carta  o varias ? (U/V)");
           Res = read.next();
            if (lista.isEmpty()) {
                System.out.println("No quedan mas cartas para dar !!!");
                break ;    
            }else if (Res.equalsIgnoreCase("U")) {
                Barajar(Maso);
                System.out.println(lista.get(i));
                CartasMonton(lista.get(i));
                lista.remove(i);
            }else if (Res.equalsIgnoreCase("V")){
                Barajar(Maso);
                System.out.println("Ingrese el numero de cartas que desea : ");
                CantCartas = read.nextInt();
                for (int j = 0; j < CantCartas; j++) {
                    System.out.println(lista.get(j));
                    CartasMonton(lista.get(j));
                    lista.remove(j);
                }
            }
            System.out.println("Las cantidad de cartas que se pueden repartir son : " +lista.size());
        } while (!Res.equalsIgnoreCase("no"));
        MostrarBaraja(lista);
    }
    public void CartasMonton(String carta){
        ArrayList<String>CartasMonton = new ArrayList();
        CartasMonton.add(carta);
        if (CartasMonton.isEmpty()) {
            System.out.println("Todavia no ha salido ninguna carta !!");
        }
    }
    public void MostrarBaraja(List<String> lista){
              for(String cartasDis : lista){
                  System.out.println(cartasDis);
              }
    }
}



