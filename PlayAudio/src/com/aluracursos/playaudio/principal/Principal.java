//Clase para realizar todos los test
package com.aluracursos.playaudio.principal;

import com.aluracursos.playaudio.modelos.Cancion;
import com.aluracursos.playaudio.modelos.MisFavoritos;
import com.aluracursos.playaudio.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        //Creando los objetos
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Forever");
        miCancion.setCantante("Kiss");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Gabriela Aguiar");
        miPodcast.setTitulo("Cafe.Tech");

        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();
        }
        for (int i = 0; i < 2000; i++) {
            miCancion.reproduce();
        }

        for (int i = 0; i < 500; i++) {
            miPodcast.reproduce();
        }
        for (int i = 0; i < 1000; i++) {
            miPodcast.meGusta();
        }

        System.out.println(miCancion.getTitulo());
        System.out.println("Total de reproducciones: " + miCancion.getTotalDeReproducciones());
        System.out.println("Total de me gusta: " + miCancion.getTotalDeMeGustas());
        System.out.println();

        System.out.println(miPodcast.getTitulo());
        System.out.println("Total de reproducciones: " + miPodcast.getTotalDeReproducciones());
        System.out.println("Total de me gusta: " + miPodcast.getTotalDeMeGustas());

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adicione(miCancion);
        favoritos.adicione(miPodcast);
    }
}
