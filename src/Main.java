import clases.Biblioteca;
import clases.Libro;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Libro libro = new Libro("Cien años de soledad", "Garcia Marquez",350);

        System.out.print(libro.toString());

        //Para instanciar un objeto o una variable
        //Tipo de dato o clase
        //nombre o etiqueta que le voy a dar
        //El valor despues del = (importante que cuando estoy instanciando un nuevo objeto, se usa la palabra reservada new
        //Entre los parentesis los parametros especificado en el constructor
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.agregarLibros(libro);

        System.out.printf("1- Agregar un nuevo libro");
        System.out.printf("2- Buscar libro");
        System.out.printf("3- Ver todos los libros");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                biblioteca.crearLibro();
                break;
            case 2:
                biblioteca.buscarLibro();
                break;
            case 3:
                biblioteca.listarTodos();
        }


    }

}