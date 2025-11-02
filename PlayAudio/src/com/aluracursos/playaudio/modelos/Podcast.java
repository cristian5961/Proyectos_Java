//Podcast es un producto de Audio
package com.aluracursos.playaudio.modelos;

//Con extends decimos que herada atributos y metodos de la clase Audio
public class Podcast extends Audio{
    private String presentador;
    private String descripcion;

    //Override indica que va a sobreescribir sobre el metodo de la clase madre Audio
    @Override
    public int getClasificacion() {
        if (getTotalDeReproducciones() >= 500){
            return 9;
        } else {
            return 4;
        }
    }

    //Getters and setters de los atributos

    public String getPresentador() {
        return presentador;
    }

    public void setPresentador(String presentador) {
        this.presentador = presentador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
