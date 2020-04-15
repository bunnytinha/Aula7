//importa
import java.util.ArrayList;
//classe
public class BlocoDeNotas
{
   //declara a lista com operador generics
   //array e um tipo 
   //no geral a variavel fica no plural
   private ArrayList <String> notas;
   //metodo de acesso
   public ArrayList <String> getNotas()
   {
     return notas; 
   }
   //metodo modificador
   public void setNotas (ArrayList <String> notas)
   {
      this.notas = notas;
   }
   //construtor
   public BlocoDeNotas ()
   {
      notas = new ArrayList <String> ();
   }
   
   //adiciona nota
   public void addNota (String nota)
   {
      notas.add(nota);
   }
   //remove nota
   public void removeNota (int index)
   {
      notas.remove(index);
   }  
}
//array list = objeto que representa uma colecao de objetos