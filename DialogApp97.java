import javax.swing.JOptionPane;

/* the showInputDialog method of the JOptionPane class uses a single parameter that specifies
 the prompting message displayed in the dialogue box. */

 public class DialogApp97
 {
    public static void main(String[] args)
    {
      String s; // method i.e local variable
      s = JOptionPane.showInputDialog("Enter an integer: ");
      int x = Integer.parseInt(s);
      System.out.println("You entered " + x + ".");
    }
 }