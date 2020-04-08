//biblioteca
import javax.swing.JOptionPane;
//classe
public class TesteAtribuicao
{
   //cadastra
   public static void main (String [] args)
   {
      //pega dados
      String nome = "Nubia";
      int idade = 24;
      String nomeD = "POO";
      boolean pratica = true;
      //boolean pratica = sPratica.equals("sim") ? true : false;
  
      //cria professor
      Professor professor = new Professor(nome, idade);
      //cria disciplina
      Disciplina disciplina = new Disciplina(nomeD, pratica);
      //atribuicao
      Atribuicao atribuicao = new Atribuicao(professor, disciplina);
      
      //exibe
      JOptionPane.showMessageDialog(null, atribuicao.getDados());
   }

}