

public class Test {

public static void main(String[] args) {
    Vertex v1 = new Vertex(42, 17);
    Vertex v2 = new Vertex(0.3, 24.6);
    Vertex v3 = v1.skalarMult(0.8);
    Vertex v4 = v1.add(v2);
    SimpleTriangle t0 = new SimpleTriangle(v1, 42);
    System.out.println(t0.area());
    System.out.println(v1.length());
    System.out.println(v3);
    System.out.println(v1.equals(v1));
  }

}