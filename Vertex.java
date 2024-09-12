package JWNS26 ;
class vertex{
 public double x;
 public double y;
 public vertex(double x,double y) {
    this.x=x;
    this.y=y;

 }
public static void main(String[]args){
    Vertex v1 = new Vertex (42, 17);
    Vertex v2 = new Vertex (2.3, 6.3);
    System.out.println (v1) ;
 

    for(int i=0;i<10;i++){
    
        v1.x=v2.x+v1.x;
       
        v1.y=v1.y+v2.y;
        System.out.println(v1 );
    
    }
    while(v1.)
}



public string tostring(){
return "("+x+","+y+")";
}
}
