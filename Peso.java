//import
import javax.swing.JOptionPane;
//declara classe
public class Peso
{
   //main
   public static void main (String [] args)
   {
   //pega peso
   double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso: "));
   //exibe
   JOptionPane.showMessageDialog(null,("O peso informado foi " + peso + " kg."));
   }
}