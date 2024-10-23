public interface GameObject extends Movable {
    double getWidth();
    double getHeight();
    Vertex GetDeltaPos();
    void setDeltaPos(Vertex that);
    boolean isLargerThan(GameObject that);
    boolean isLeftOf(GameObject that);
    boolean isAbove(GameObject that);
    boolean touches(GameObject that);
}
