//importa
import javax.swing.JOptionPane;
//declara classe
public class Data
{
   //main
   public static void main (String [] args)
   {
   //pega números
   int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia: "));
   int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês: "));
   int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano: "));
   //data
   String data = (dia + "/" + mes + "/" + ano);
   //exibe
   JOptionPane.showMessageDialog(null,data);
   }
}