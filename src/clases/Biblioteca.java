package clases;

import java.util.ArrayList;

public class Biblioteca {
    //alcance, tipo de dato, etiqueta del atributo
    private ArrayList<Libro> libros;

    //Siempre publico
    //Se llama igual que mi clase
    //Es el unico metodo que va en mayuscula
    public Biblioteca(){
        this.libros = new ArrayList<Libro>();
    }

    public void agregarLibros(Libro libro){};

    public Libro buscarLibro(String titulo){};

    public void listarTodos(){};
}
