import java.awt.Color;

public class SimpleRectangle extends GeometricObject {
    public SimpleRectangle(Vertex pos,double width, double height, Color color){
        super(pos, width, height, color);
    }

    public SimpleRectangle(double posx, double posy, double width, double height){
        super(new Vertex(posx, posy), width, height, new Color(0,0,0));
    }
    
    public String toString(){
        return "Rectangle"+pos+","+ width + height;
    }
}
