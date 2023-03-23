/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author Ignacio González
 */
public class Pelicula {
    String titulo ,director ;
    int Edad_Minima ; 
    Date duracion ;
    public Pelicula() {
    }
    public Pelicula(String titulo, String director, int Edad_Minima, Date duracion) {
        this.titulo = titulo;
        this.director = director;
        this.Edad_Minima = Edad_Minima;
        this.duracion =  new Date ();
    }
    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public int getEdad_Minima() {
        return Edad_Minima;
    }

    public Date getDuracion() {
        return duracion;
    }

   

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setEdad_Minima(int Edad_Minima) {
        this.Edad_Minima = Edad_Minima;
    }

    public void setDuracion(Date duracion) {
        this.duracion = duracion;
    }

    
}
