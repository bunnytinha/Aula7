//importa
import javax.swing.JOptionPane;
//declara classe
public class Palavras
{
   //main
   public static void main (String [] args)
   {
      //pega palavras
      String palavra1 = JOptionPane.showInputDialog("Digite a primeira palavra: ");
      String palavra2 = JOptionPane.showInputDialog("Digite a segunda palavra: ");
      String palavra3 = JOptionPane.showInputDialog("Digite a terceira palavra: ");
      //inverte
      String inverte = palavra3 + " " + palavra2 + " " + palavra1;
      //exibe
      JOptionPane.showMessageDialog(null,inverte);
   }
}