//Que vamos hacer?
// 1. Crear super clase audio.
// 2. Crear getters y setters.
// 3. crear metodo meGusta().
// 4. Crear metodo reproducir().
// 5. Clasificar canciones favoritas.
package com.aluracursos.playaudio.modelos;

// Creación de clase madre Audio
public class Audio {
    //Variables de la clase madre Audio
    private String titulo;
    private int totalDeReproducciones;
    private int totalDeMeGustas;
    private int clasificacion;

    //Creando metodos de la clase madre
    public void meGusta(){
        // This nos referimos al atributo de la clase
        //Cuando se llama al metodo se incrementa los me gusta
        this.totalDeMeGustas++;
    }

    public void reproduce(){
        //Cuando se llama al metodo reproduce se incrementa las reproducciones
        this.totalDeReproducciones++;
    }

    //Creando getters and setters de los atributos

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReproducciones() {
        return totalDeReproducciones;
    }

    public void setTotalDeReproducciones(int totalDeReproducciones) {
        this.totalDeReproducciones = totalDeReproducciones;
    }

    public int getTotalDeMeGustas() {
        return totalDeMeGustas;
    }

    public void setTotalDeMeGustas(int totalDeMeGustas) {
        this.totalDeMeGustas = totalDeMeGustas;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }
}
