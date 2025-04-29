package models;

public class Genero {
    private int id;
    private String nombre;
    private String descripcion;
    private int edadRecomendada;

    public Genero(int id, String nombre, String descripcion, int edadRecomendada) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.edadRecomendada = edadRecomendada;
    }

    // Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEdadRecomendada() {
        return edadRecomendada;
    }

    public void setEdadRecomendada(int edadRecomendada) {
        this.edadRecomendada = edadRecomendada;
    }
}
