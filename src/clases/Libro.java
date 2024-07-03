package clases;

import java.lang.annotation.Native;
import java.util.Random;

public class Libro {

   Random random = new Random();
   private Integer id;
   private String titulo;
   private String autor;
   private Integer cantPag;

   public Libro(String titulo, String autor, Integer cantPag){
       this.id = random.nextInt(101);
       this.titulo = titulo;
       this.autor = autor;
       this.cantPag = cantPag;
   }

    @Override
    public String toString() {
        return  titulo +
                "id=" + id +
                ", autor='" + autor + '\'' +
                ", cantPag=" + cantPag;
    }

}
