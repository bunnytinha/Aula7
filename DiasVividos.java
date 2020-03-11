//import
import javax.swing.JOptionPane;
//classe
public class DiasVividos
{
   //main
   public static void main (String [] args)
   {
      //pega idade
      int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
      //multiplica pelo número de dias no ano
      int diasVividos = idade * 365;
      //exibe os dias vividos
      JOptionPane.showMessageDialog(null,diasVividos);
   }
}
