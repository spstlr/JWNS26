package JWNS26;
//import JWNS26.src.util.ShowInFrame;

public class PaintablePanel extends SizedPanel{

    Paintable pa;
    public PaintablePanel(Paintable pa){this.pa=pa;}

    public void paintComponent(java.awt.Graphics g){
        pa.paintTo(g);
    }
    public static void main(String[]args){
        ShowInFrame.show(new PaintablePanel(new PaintableOval(100, 20, 50, 30)));
        ShowInFrame.show(new PaintablePanel(new PaintableOval(50, 50, 500, 304)));   
}


}
