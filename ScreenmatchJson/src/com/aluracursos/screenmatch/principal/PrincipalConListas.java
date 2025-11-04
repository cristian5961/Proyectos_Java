package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalConListas {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Ready Player One", 2021);
        miPelicula.evalua(10);
        Pelicula otraPelicula = new Pelicula("Matrix", 1998);
        otraPelicula.evalua(7);
        var peliculaDeCris = new Pelicula("El señor de los anillos", 2001);
        peliculaDeCris.evalua(8);
        Serie casaDragon = new Serie("La casa del dragón", 2022);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(peliculaDeCris);
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(casaDragon);

        for (Titulo item: lista){
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 3) {
                System.out.println(pelicula.getClasificacion());
            }
        }

        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Penelope Cruz");
        listaDeArtistas.add("Antonio Banderas");
        listaDeArtistas.add("Jason Statam");
        System.out.println(listaDeArtistas);

        Collections.sort(listaDeArtistas);
        System.out.println("Lista de artistas ordenada: " + listaDeArtistas);
        
        Collections.sort(lista);
        System.out.println("Lista de titulos ordenados: " + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista de titulos ordenados por fecha: " + lista);

    }
}
