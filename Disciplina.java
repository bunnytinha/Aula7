//classe
public class Disciplina
{
   //atributos
   private String nomeD;
   private boolean pratica;
   //construtor
   public Disciplina (String nomeD, boolean pratica)
   {
      this.nomeD = nomeD;
      this.pratica = pratica;
   }
   //metodos de acesso
   public String getNomeD()
   {
      return nomeD;
   }
   public boolean getPratica()
   {
      return pratica;
   }
   //metodo modificador
   public void setNomeD(String nomeD)
   {
      this.nomeD = nomeD;
   }
   public void setPratica(boolean pratica)
   {
      this.pratica = pratica;
   }
   //metodo getDados
   public String getDados()
   {
     return "Disciplina [ nome = " + nomeD + ", pratica = " + pratica + "]";  
   }
}