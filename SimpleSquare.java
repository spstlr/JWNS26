public class SimpleSquare extends GeometricObject{
    public SimpleSquare(Vertex pos,double width){
        super(pos, width);
    }

    public SimpleSquare(double posx, double posy, double width){
        super(new Vertex(posx, posy), width);
    }

public double circumference(){
    return 4*height;
}

    public double area(){
        return super.area();
    }

    public String toString(){
        return "Square"+pos+","+width;
    }
}
