import javax.swing.JOptionPane;

public class GUI {
    public static void main(String[] args) {
       
        String name = JOptionPane.showInputDialog("Enter Your name:");
        JOptionPane.showMessageDialog(null,"Hello "+name);
        
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));
        JOptionPane.showMessageDialog(null,"Your age is "+age);

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height:"));
        JOptionPane.showMessageDialog(null,"Your hight is: "+height);

    }
    
}
