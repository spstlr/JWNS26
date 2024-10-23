import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

public class SimpleButton extends JPanel {
    
    JButton b=new JButton("push this button");
    JLabel l= new JLabel("000");

    SimpleButton(){
        add(b);
        add(l);
    }
}
