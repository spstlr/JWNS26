public class GeometricObject {
    
    public double width;
    public double height;
    public Vertex pos;

    public GeometricObject(Vertex pos, double width, double height){
        this.pos= pos;
        if(width<0){
        this.width=Math.abs(width);
        this.pos.x=this.pos.x-this.width;
        }
        else{this.width=width;}
      
        if(height<0){
            this.height=Math.abs(height);
            this.pos.y=this.pos.y-this.height;
        }
        else{this.height=height;}
    }

    public GeometricObject(double posx, double posy,double width, double height){
        this(new Vertex(posx,posy), width, height);
    }

    public GeometricObject(Vertex pos, double width){
       this(pos, width, width); 
    }

    public GeometricObject(double width, double height){
        this(0, 0, width, height);
    }
    
    public GeometricObject(){
    this(10, 10);
    }

    public GeometricObject(double x){
        this(x,x);
    }

    public double circumference(){
        return 2*width + 2*height;
    }

    public double area(){
        return width*height;
    }

    public boolean contains(Vertex v){
        if(v.x > pos.x && v.x < pos.x + this.width && v.y > pos.y && v.y < pos.x + this.height){
            return true;
        }
        return false;
    }

public boolean isLargerAs(GeometricObject that){
    if(this.area()>that.area()){
        return true;
    }
    return false;
}

public void moveTo(Vertex that){
    pos = that;
}

public void moveTo(double x, double y){
    moveTo( new Vertex(x,y));
    pos.x =x;
    pos.y =y;
}

public void move(Vertex v){
    pos = pos.add(v);
}

public boolean equals(GeometricObject thatObject){
    if(thatObject instanceof GeometricObject){
        GeometricObject that = (GeometricObject)thatObject;
    
        if(this.pos.equals(that.pos)&&this.width==that.width&&this.height==that.height){
            return true;
        }
    }
    return false;
}    

public boolean overlap(GeometricObject that){
    if(this.pos.x<that.pos.x+that.width&&this.pos.x>that.pos.x&&that.pos.y<this.pos.y+this.height&&that.pos.y>this.pos.y||
    this.pos.y<that.pos.y+that.height&&this.pos.y>that.pos.y&&that.pos.x<this.pos.x+this.width&&that.pos.x>this.pos.x){
        return true;
    }
    return false;
}

public String toString(){
        return pos + "," + width +","+ height;
    }
}
