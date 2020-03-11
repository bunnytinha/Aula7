//importa
import javax.swing.JOptionPane;
//classe
public class Comprimento
{
   //main
   public static void main (String [] args)
   {
      //pega strings
      String primeira = JOptionPane.showInputDialog("Digite a primeira palavra: ");
      String segunda = JOptionPane.showInputDialog("Digite a segunda palavra: ");
      String terceira = JOptionPane.showInputDialog("Digite a terceira palavra: ");
      //concatena
      String concatena = primeira + segunda + terceira;
      //exibe comprimento
      JOptionPane.showMessageDialog(null, concatena.length());
   }
}