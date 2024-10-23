import java.awt.Color;

public class SimpleOval extends GeometricObject {
    
    public SimpleOval (Vertex pos,double width,double height, Color color){
        super(pos, width, height, color);
    }
    
    public SimpleOval(double posx, double posy, double width,double height){
        super(new Vertex(posx, posy), width, height, new Color(0,0,0));
    }

    public String toString(){
        return "SimpleOval"+ super.toString();
    }
}