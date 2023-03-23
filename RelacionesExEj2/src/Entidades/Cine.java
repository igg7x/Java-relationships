/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Ignacio González
 */
public class Cine {
    Pelicula pelicula ; 
    int precio_Entrada; 
    ArrayList<Espectador> Espectadores ; 
    String [][] Sala_Espectadores ;
     Espectador espectador ;
    public Cine() {
    }

    public Cine(Pelicula pelicula, int precio_Entrada, ArrayList<Espectador> Espectadores, String[][] Sala_Espectadores) {
        this.pelicula = new Pelicula();
        this.precio_Entrada = precio_Entrada;
        this.Espectadores = new ArrayList();
        this.Sala_Espectadores = new String [8][6];
    }
    public Pelicula getPelicula() {
        return pelicula;
    }

    public int getPrecio_Entrada() {
        return precio_Entrada;
    }

    public ArrayList<Espectador> getEspectadores() {
        return Espectadores;
    }

    public String[][] getSala_Espectadores() {
        return Sala_Espectadores;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public void setPrecio_Entrada(int precio_Entrada) {
        this.precio_Entrada = precio_Entrada;
    }

    public void setEspectadores(ArrayList<Espectador> Espectadores) {
        this.Espectadores = Espectadores;
    }

    public void setSala_Espectadores(String[][] Sala_Espectadores) {
        this.Sala_Espectadores = Sala_Espectadores;
    }
    
    public String [][] enumSala(String [][] sala){
        String [] Letras = {"A","B","C","D","E","F"};
        String []Numeros = {"8","7","6","5","4","3","2","1"};
        sala = getSala_Espectadores().clone();
        for (int i = 0; i <8; i++) {
            for (int j = 0; j <6; j++) {
                 sala[i][j]= Numeros[i]+Letras[j]+"";                  
            }
        }
        return sala;
    }
    public void createEspectadores(){
        String [] Nombres = {"Ignacio","Joaquin","Ibrahin",
                                                "Ibraim",
                                                "Icaro" ,
                                                "Ichiro " ,
                                                "Iciar " ,
                                                "Ida " ,
                                                "Idaho " ,
                                                "Idalia " ,
                                                "Idalina " ,
                                                "Idana " ,
                                                "Idara " ,
                                                "Ideimar " ,
                                                "Idelfonsa " ,
                                                "Idelfonso " ,
                                                "Idelmar " ,
                                                "Idey " ,
                                                "Ido " ,
                                                "Idola " ,
                                                "Idomeneo " ,
                                                "Idonia " ,
                                                "Iedidia " ,
                                                "Ieesha" ,
                                                "Iehiel",
                                                "Iehuda",
                                                "Iehudit"};
        String [] Apellidos = {"Veredigna ","Veremundo","Verena",
                                                "Verenice " ,
                                                "Veriano " ,
                                                "Verisimo " ,
                                                "Verna " ,
                                                "Verne " ,
                                                "Vernerio " ,
                                                "Vernon " ,
                                                "Vero " ,
                                                "Verona " ,
                                                "Veronica " ,
                                                "Verónica " ,
                                                "Veronika " ,
                                                "Verrill " ,
                                                "Verulo " ,
                                                "Verushka " ,
                                                "Vesna " ,
                                                "Vespasiano " ,
                                                "Vespera " ,
                                                "Vesta " ,
                                                "Vetio " ,
                                                "Veturo" ,
                                                "Vevila" ,
                                                "Vevina" ,
                                                "Vicentino"};
        int [] edad = {10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26 ,27,28,29,30,31,32,33,34,35,36,37};
        for (int i = 0; i <Nombres.length; i++) {
            espectador = new Espectador(Nombres[i]+Apellidos[i],edad[i]);
            espectador.setDinero_Disponible((int) (Math.random() * 1500));
            getEspectadores().add(espectador);
        }
    }
    public void createPelicula(){
       Date duracion = new Date();
       duracion.setHours(2);
       pelicula.setDirector("Steven Spilberg");
       pelicula.setDuracion(duracion);
       pelicula.setTitulo("Avergers 3");
       pelicula.setEdad_Minima(19);
       setPrecio_Entrada(500);
    }
    public void UbicarEspectadores(){
     String [][] sala = enumSala(getSala_Espectadores());
     createPelicula();
     for(Espectador e : getEspectadores()){
         int i =(int) (Math.random() * 7)+1 ,j= (int) (Math.random() *5)+1;   
         if (e.getDinero_Disponible()>=getPrecio_Entrada() && sala[i][j].endsWith("")&&  e.getEdad()>=pelicula.getEdad_Minima()){
           e.setButaca(sala[i][j]);
           sala[i][j].replace("","X");
         }
     }
     MostrarSala(sala);
    }
    public void MostrarSala(String [][] sala){
         for (int i = 0; i <8; i++) {
             System.out.println("\n");
            for (int j = 0; j <6; j++) {
                System.out.println(sala[i][j]);
            }
        }  
    }
}


