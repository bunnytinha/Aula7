//Biblioteca
import javax.swing.JOptionPane;
//Classe
public class TesteTurma
{
   public static void main (String [] args)
   {
         String nome = JOptionPane.showInputDialog("Digite o nome da turma:");
         String curso = JOptionPane.showInputDialog("Digite o curso:");
         int quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos:"));
         int serie = Integer.parseInt(JOptionPane.showInputDialog("Digite a serie:"));
         Turma turma;
         turma = new Turma (nome, curso, quantidadeDeAlunos, serie);
         JOptionPane.showMessageDialog (null, "Turma: " + turma.getNome());
         JOptionPane.showMessageDialog (null, "Curso: " + turma.getCurso());
         JOptionPane.showMessageDialog (null, "Quantidade de Alunos: " + turma.getQuantidadeDeAlunos());
         JOptionPane.showMessageDialog (null, "Serie: " + turma.getSerie());
   }
}