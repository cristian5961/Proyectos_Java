//Canciones es un producto de Audio
package com.aluracursos.playaudio.modelos;

//Con extends decimos que hereda atributos de la clase Audio
public class Cancion extends Audio{
    //Atributos de la subclase cancion
    private String album;
    private String cantante;
    private String genero;
    //Override indica que va a sobreescribir sobre el metodo de la clase madre Audio
    @Override
    public int getClasificacion() {
        if (getTotalDeMeGustas() > 1000){
            return 8;
        } else {
            return 4;
        }
    }

    //Creando getters and setters de los atributos de la subclase

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
