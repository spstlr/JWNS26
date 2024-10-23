//package JWNS26;
//import JWNS26.src.util.ShowInFrame;
import java.awt.Color;

public class PaintablePanel extends SizedPanel{

    Paintable pa;
    public PaintablePanel(Paintable pa){this.pa=pa;}

    public void paintComponent(java.awt.Graphics g){
        pa.paintTo(g);
    }
    public static void main(String[]args){
        ShowInFrame.show(new PaintablePanel(new PaintableOval(100, 20, 50, 30, new Color(255,42,31))));
        ShowInFrame.show(new PaintablePanel(new PaintableOval(50, 50, 500, 304)));   
}


}
