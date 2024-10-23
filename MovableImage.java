public class MovableImage extends GeometricImage implements GameObject{
    
    Vertex deltaPos = newVertex(0 0);

    public MovableImage(String name, double x, double y){
        super(name, x, y);
    }

    public MovableImage(String name, double x, double y, double dx, double dy){
        super(name, x, y);
        deltaPos = new Vertex(dx, dy);
    }

    public void setDeltaPos(Vertex v){
        deltaPos= v;
    }

    public void move(){
        pos.addMod(deltaPos);
    }

    public void turn(){deltaPos=skalarMultMod(-1);}

    public boolean isLeftOf(GameObject that){
        if(getX()+getWidth()>that.getX()){
            return true;
        }return false;
    }

    public boolean isAbove(GameObject that){
        if(getY()+getHeight()>that.getY()){
            return true;
        }return false;
    }

    public boolean touches(GameObject that){
        if(this.isLeftOf(that)){return false;}
        if(that.isLeftOf(this)){return false;}
        if(this.isAbove(that)){return false;}
        if(that.isAbove(this)){return false;}
        return true;
    }

    public boolean isLargerAs(GameObject that){
        if(this.area()>that.area()){return true;}
        return false;
    }

    public double getWidth(){
        super.getWidth();
    }

    public Vertex GetDeltaPos(){
        return deltaPos;
    }
}