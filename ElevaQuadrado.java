//import
import javax.swing.JOptionPane;
//classe
public class ElevaQuadrado
{
   //main
   public static void main (String [] args)
   {
      //pega a base
      int base = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base: "));
      //eleva ao quadrado
      double elevado = Math.pow(base,2);
      //exibe resultado
      JOptionPane.showMessageDialog(null, elevado);
   }
}