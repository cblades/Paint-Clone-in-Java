package edu.wcu.cs.cs363.team3.project03.gui.shape.producer;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import edu.wcu.cs.cs363.team3.project03.gui.shape.Curve;

/**
 * Implements the logic for producing Curve objects based on user input
 * via the mouse.
 *
 * @author Chris Blades
 * @author Don Coffin
 * @author Benny Reese
 *
 * @version Apr 12, 2010
 */
public class CurveProducer extends AbstractShapeProducer {

    /** List of points in the Curve being produced */
    List<Point> points;
    
    /**
     * Constructs a new CurveProducer with a default drawColor.
     */
    public CurveProducer() {
        super();
        this.points = new ArrayList<Point>(0);
    }
    
    /**
     * Constructs a new CurveProducer with the given drawColor.
     * 
     * @param drawColor the color to produce curves in.
     */
    public CurveProducer(Color drawColor) {
        super(drawColor);
        this.points = new ArrayList<Point>(0);
    }
    
    /**
     * Called when the user releases the mouse button.  Defines the
     * end point for the Line being produced and so notifies 
     * ShapeCreationListeners that the permanent Line object has been
     * created.
     * 
     * @param e the Event that generated this method call
     */
    public void mouseReleased(MouseEvent e) {
        notifyShapeCreated(new Curve(getDrawColor(), points));
        points.clear();  // clear points list for next Point
    }
    
    /**
     * Called when the user drags the mouse with the button held down.
     * Notifies ShapeCreationListeners that an intermediary Line object
     * has been created.
     * 
     * @param e the event that generated this method call.
     */
    public void mouseDragged(MouseEvent e) {
        notifyShapeInProgress(new Curve(getDrawColor(), points));
    }
    
    /**
     * Called when the user clicks the mouse button.  Begins creating 
     * a Curve.
     * 
     * @param e the event that generated this method call.
     */
    public void mousePressed(MouseEvent e) {
        points.add(new Point(e.getX(), e.getY()));
    }
}
