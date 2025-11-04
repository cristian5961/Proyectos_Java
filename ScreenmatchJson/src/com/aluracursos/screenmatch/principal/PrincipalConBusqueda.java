package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.excepcion.ErrorEnConversionDeDuracionException;
import com.aluracursos.screenmatch.modelos.Titulo;
import com.aluracursos.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalConBusqueda {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner teclado = new Scanner(System.in);
        String clave = "cad31910";
        List<Titulo> titulos = new ArrayList<>();
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (true){
            System.out.println("Ingrese el nombre de una película y para terminar ingrese SALIR: ");
            var busqueda = teclado.nextLine();

            if (busqueda.equalsIgnoreCase("salir")){
                break;
            }

            String busquedaCodificada = URLEncoder.encode(busqueda, StandardCharsets.UTF_8);

            String direccion = "http://www.omdbapi.com/?t=" + busquedaCodificada + "&apikey=" + clave;

            try{
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(direccion))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);

                TituloOmdb miTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(miTituloOmdb);

                Titulo miTitulo = new Titulo(miTituloOmdb);
                System.out.println("Titulo ya convertido: " + miTitulo);
                titulos.add(miTitulo);

            } catch (NumberFormatException e){
                System.out.println("Ocurrio un error: ");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e){
                System.out.println("Error en la URI, verifique la dirección.");
            } catch (ErrorEnConversionDeDuracionException e){
                System.out.println(e.getMensaje());
            }
        }
        System.out.println(titulos);
        //Para crear un documento .txt
        FileWriter escritura = new FileWriter("peliculas.json");
        escritura.write(gson.toJson(titulos));
        escritura.close();
        System.out.println("Finalizo la ejecución del programa!");
    }
}
