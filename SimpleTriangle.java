import java.awt.Color;

public class SimpleTriangle extends GeometricObject{
    
    public SimpleTriangle(Vertex pos, double width){
        super(pos, width, Math.sqrt(3)*width/2, new Color(0,0,0));
    }

    public double circumference(){
        return width*3;
    }

    public double area(){
        return super.area()/2;
    }

    public String toString(){
        return "Triangle" + pos + "," + width + "," + height;
    }
}