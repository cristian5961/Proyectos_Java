package com.aluracursos.swapi.principal;

import com.aluracursos.swapi.modelos.ConsultaPelicula;
import com.aluracursos.swapi.modelos.GeneradorDeArchivo;
import com.aluracursos.swapi.modelos.TituloSwapi;

import java.io.IOException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ConsultaPelicula consulta = new ConsultaPelicula();
        System.out.println("Escriba el nombre de la película de Star Wars que desea consultar:");

        try{
            var busqueda = Integer.valueOf(teclado.nextLine());
            TituloSwapi pelicula = consulta.buscaPelicula(busqueda);
            System.out.println(pelicula);
            GeneradorDeArchivo generador = new GeneradorDeArchivo();
            generador.guardarJson(pelicula);
        } catch (NumberFormatException e){
            System.out.println("Número no encontrado. " + e.getMessage());
        } catch (IOException | RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando la aplicación.");
        }
    }
}
