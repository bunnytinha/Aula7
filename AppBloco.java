import javax.swing.JOptionPane;
import java.util.ArrayList;
public class AppBloco
{
private BlocoDeNotas blocoDeNotas;
   public static void main (String [] args)
   {
      BlocoDeNotas blocoDeNotas = new BlocoDeNotas ();
      
      String menu = "1 - Add note\n2 - Delete note\n3 - Change note\n4 - List of notes\n0 - Exit";
      
      int opcao;
      
      do
      {
         opcao = Integer.parseInt(JOptionPane.showInputDialog (menu));
         ArrayList <String> notas = blocoDeNotas.getNotas();
         switch (opcao)
         {
            //add note
            case 1:
            {
               String nota = JOptionPane.showInputDialog("Note:");
               blocoDeNotas.addNota(nota);
               break;
            }
            //delete note
            case 2:
            {
               //position
               int posicao = Integer.parseInt(JOptionPane.showInputDialog("Position:"));
               //check
               try
               {
                  blocoDeNotas.removeNota(posicao);
                  JOptionPane.showMessageDialog(null, "Deleted");
               }catch (IndexOutOfBoundsException e)
                  {
                     JOptionPane.showMessageDialog(null, "This message does not exist.");
                  }
               break;
            }
            //change note
            case 3:
            {
               //position
               int posicao = Integer.parseInt(JOptionPane.showInputDialog("Position:"));
               //check
               try
               {
                  String novaNota = JOptionPane.showInputDialog("New note:");
                  notas.set(posicao, novaNota); 
                  JOptionPane.showMessageDialog(null, "Changed.");
               }catch (IndexOutOfBoundsException e)
                  {
                     JOptionPane.showMessageDialog(null, "This message does not exist.");
                  }
               break;   
            }
            //list note
            case 4:
            {
               JOptionPane.showMessageDialog(null, notas);
               System.out.println(notas);
               System.out.println(notas.size()-1);
               break;
            }               
            case 0:
               JOptionPane.showMessageDialog(null, "Bye!");
               break;
         }
      }while (opcao !=0);
   }
}