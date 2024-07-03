package clases;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    Scanner scanner = new Scanner(System.in);

    //alcance, tipo de dato, etiqueta del atributo
    private ArrayList<Libro> libros;

    //Siempre publico
    //Se llama igual que mi clase
    //Es el unico metodo que va en mayuscula
    //Parametros que voy a necesitar para construir
    //Por de dentro la asignacion de valores
    public Biblioteca(){
        this.libros = new ArrayList<Libro>();
    }

    //Alcance
    //Tipo de retorno
    //nombre del metodo
    //Parametros (si no recibe parametros igual van los parentesis)
    //Dentro de las llaves la logica, las lineas de ejecucion
    public void agregarLibros(Libro libro){
        libros.add(libro);
        System.out.print("Libro agragado." + libro.toString());
    };

    //public Libro buscarLibro(String titulo){};

    public void listarTodos(){
    };

    public void crearLibro(){
        System.out.printf("Ingrese el titulo del libro");
        String titulo = scanner.nextLine();

        System.out.printf("Ingrese el autor del libro");
        String autor = scanner.nextLine();

        System.out.printf("Ingrese cantidad de paginas");
        Integer cantPag = scanner.nextInt();

        Libro nuevoLibro = new Libro(titulo,autor,cantPag);

        libros.add(nuevoLibro);
    }

    public void buscarLibro(String titulo){
        //Neceisto recorrer mi array de libros y preguntar si el titulo pasado por parametro es igual al titulo
        //del libro que esta revisando en esa iteracion, si lo es necesito que lo retorne

    }



}
