package com.aluracursos.swapi.modelos;

public record TituloSwapi(String title,
                          int episode_id,
                          String opening_crawl,
                          String director,
                          String producer,
                          String release_date) {
}
