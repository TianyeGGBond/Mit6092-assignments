import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class DrawGraphics {

    List<BouncingBox> many = new ArrayList<>();

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        BouncingBox box1 = new BouncingBox(200, 50, Color.RED);
        box1.setMovementVector(0, 2);
        many.add(box1);

        BouncingBox box2 = new BouncingBox(100, 50, Color.BLACK);
        box2.setMovementVector(0, -2);
        many.add(box2);

        BouncingBox box3 = new BouncingBox(10, 50, Color.ORANGE);
        box3.setMovementVector(2, 0);
        many.add(box3);

    }



    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {

        surface.drawOval(20,20,50,10);
        surface.drawOval(20,20,10,50);
        surface.setColor(Color.cyan);
        surface.draw3DRect(100,100,100,100,true);
        surface.fillArc(20,180,80,80,60,240);

        for (BouncingBox box : many) {
            box.draw(surface);
        }
    }
}
