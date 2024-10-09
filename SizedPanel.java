import javax.swing.*;
import java.awt.Dimension;

public class SizedPanel extends JPanel{
    int preferredwidth = 300;
    int preferredheight = 400;

public SizedPanel(int w, int h){
    preferredwidth = w;
    preferredheight = h;
}

public SizedPanel(){}

public Dimension getPreferredSize(){
    return new Dimension(preferredwidth, preferredheight);
}
public static void main(String[]args){
    ShowInFrame.show("zweiter Test", new SizedPanel());
    }
}

