import javax.swing.JFrame;
import javax.swing.JPanel;


    public class FirstPanel extends JPanel {
    @Override

    public void paintComponent(java.awt.Graphics g){
        g.fillRect(100, 35, 42, 42);
        g.fillArc(10, 10, 150, 300, 100, 90);
    }

    public static void main(String[]args){
        JFrame f= new JFrame();
        f.add(new FirstPanel());
        f.setVisible(true);
    }
}
