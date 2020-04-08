//classe
public class Disciplina
{
   //atributos
   private String nome;
   private boolean pratica = true;
   //construtor
   public Disciplina (String nome, boolean pratica)
   {
      this.nome = nome;
      this.pratica = pratica;
   }
   //metodos de acesso
   public String getNome()
   {
      return nome;
   }
   public boolean getPratica()
   {
      return pratica;
   }
   //metodo modificador
   public void setNome(String nome)
   {
      this.nome = nome;
   }
   public void setPratica(boolean pratica)
   {
      this.pratica = pratica;
   }
   //metodo getDados
   public String getDados()
   {
     return "Disciplina [ nome = " + nome + ", pratica = " + pratica + "]";  
   }
}