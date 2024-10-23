import java.util.*;

public class MovablePanel extends SizedPanel{
    public List<GameObject> gos= new ArrayList<GameObject>();

    public void paintComponent(java.awt.Graphics g){
        super.paintComponent(g);
        for(GameObject go:gos){go.paintTo();}
    }
    public void move(){
        for(GameObject go:gos){go.move();}
    }
}
