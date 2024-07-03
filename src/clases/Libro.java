package clases;

public class Libro {
   private Integer id;
   private String titulo;
   private String autor;
   private Integer cantPag;

   public Libro(String titulo, String autor, Integer cantPag){
       this.id = 0;
       this.titulo = titulo;
       this.autor = autor;
       this.cantPag = cantPag;
   }
}
