//import
import javax.swing.JOptionPane;
//classe
public class Retangulo
{
   //main
   public static void main (String [] args)
   {
      //pega base
      double base = Double.parseDouble(JOptionPane.showInputDialog("Digite a medida da base: "));
      //pega altura
      double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a medida da altura: "));
      //calcula área
      double area = base * altura;
      //exibe
      JOptionPane.showMessageDialog(null,area + " u.m.");
   }
}