package edu.wcu.cs.cs363.team3.project03.gui.shape.producer;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;

import edu.wcu.cs.cs363.team3.project03.gui.shape.Line;

/**
 * Implements logic for producing Line objects based on user input with
 * the mouse.
 *
 * @author Chris Blades
 * @author Don Coffin
 * @author Benny Reese
 *
 * @version Apr 12, 2010
 */
public class LineProducer extends AbstractTwoPointShapeProducer {
    
    /**
     * Produces a new LineProducer with a default drawing Color.
     */
    public LineProducer() {
        super();
    }

    /**
     * Produces a new LineProducer with the given drawing Color.
     * 
     * @param drawColor the color in which Lines will be produced
     */
    public LineProducer(Color drawColor) {
        super(drawColor);
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
        notifyShapeCreated(new Line(getDrawColor(),
                                    getStart(), 
                                    new Point(e.getX(), e.getY())));
    }
    
    /**
     * Called when the user drags the mouse with the button held down.
     * Notifies ShapeCreationListeners that an intermediary Line object
     * has been created.
     * 
     * @param e the event that generated this method call.
     */
    public void mouseDragged(MouseEvent e) {
        notifyShapeInProgress(new Line(getDrawColor(),
                                        getStart(),
                                        new Point(e.getX(), e.getY())));
    }
}
