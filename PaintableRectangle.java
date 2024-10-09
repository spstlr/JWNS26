public class PaintableRectangle extends SimpleRectangle implements Paintable {
    
    public PaintableRectangle(double x, double y, double width, double height){
        super(x, y, width, height);
    }

    public void paintTo(java.awt.Graphics g){
        g.fillRect((int)pos.x, (int)pos.y, (int)width, (int)height);
    }
}
