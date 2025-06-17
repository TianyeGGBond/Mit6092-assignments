import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class DrawGraphics {
    //List<Bouncer> many = new ArrayList<>();
    //List<StraightMover> manySM = new ArrayList<>();

    //my interface
    List<Mover> manyM = new ArrayList<>();

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        Rectangle box = new Rectangle(15, 20, Color.RED);
        Circle circle = new Circle(25,15,Color.YELLOW);

        //Bouncer setup
        manyM.add(new Bouncer(100, 170, box));
        manyM.add(new Bouncer(200, 90, circle));

        manyM.get(0).setMovementVector(3, 1);
        manyM.get(1).setMovementVector(2, 4);

        //StraightMover setup
        manyM.add(new StraightMover(190,190,box));
        manyM.add(new StraightMover(100,10,circle));

        manyM.get(2).setMovementVector(-3, 2);
        manyM.get(3).setMovementVector(1, 6);
    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) {
        for(Mover object: manyM){
            object.draw(surface);
        }
    }
}
