package edu.wcu.cs.cs363.team3.project03.gui.shape.producer;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;

import edu.wcu.cs.cs363.team3.project03.gui.shape.FilledRectangle;

/**
 * Produces FilledRectangle objects based on user input with the mouse.
 *
 * @author Chris Blades
 * @author Don Coffin
 * @author Benny Reese
 *
 * @version Apr 12, 2010
 */
public class FilledRectangleProducer extends AbstractTwoPointShapeProducer {

    /**
     * Constructs a new FilledRectangleProducer with a default drawColor.
     */
    public FilledRectangleProducer() {
        super();
    }

    /**
     * Constructs a new FilledRectangleProducer with the given drawColor.
     * 
     * @param drawColor the color in which FilledRectangles will be 
     *                  produced
     */
    public FilledRectangleProducer(Color drawColor) {
        super(drawColor);
    }

    /**
     * Called when the user releases the mouse button.  Defines the
     * end point for the FilledRectangle being produced and so notifies 
     * ShapeCreationListeners that the permanent FilledRectangle 
     * object has been created.
     * 
     * @param e the Event that generated this method call
     */
    public void mouseReleased(MouseEvent e) {
        Point orderedStart = new Point(0, 0); // top-left corner
        Point orderedEnd   = new Point(0, 0); // bottom-right corner
        
        // order the points so that orderedStart is the top left corner
        // of the rectangle and orderedEnd is the bottom right
        if (getStart().getX() >= e.getX()) {
            if (getStart().getY() > e.getY()) {
                orderedStart = new Point(e.getX(), (int)getStart().getY());
                orderedEnd   = new Point((int)getStart().getX(), e.getY());
            } else {
                orderedStart = new Point(e.getX(), e.getY());
                orderedEnd   = new Point((int)getStart().getX(), 
                                                   (int)getStart().getY());
            }
        } else {
            if (getStart().getY() < e.getY()) {
                orderedStart = new Point((int)getStart().getX(), e.getY());
                orderedEnd   = new Point(e.getX(), (int)getStart().getY());
            }
        }
        
        notifyShapeCreated(new FilledRectangle(getDrawColor(),
                                               orderedStart, 
                                               orderedEnd));
    }
    
    /**
     * Called when the user drags the mouse with the button held down.
     * Notifies ShapeCreationListeners that an intermediary FilledRectangle 
     * object has been created.
     * 
     * @param e the event that generated this method call.
     */
    public void mouseDragged(MouseEvent e) {
        Point orderedStart = new Point(0, 0); // top-left corner
        Point orderedEnd   = new Point(0, 0); // bottom-right corner
        
        // order the points so that orderedStart is the top left corner
        // of the rectangle and orderedEnd is the bottom right
        if (getStart().getX() >= e.getX()) {
            if (getStart().getY() > e.getY()) {
                orderedStart = new Point(e.getX(), (int)getStart().getY());
                orderedEnd   = new Point((int)getStart().getX(), e.getY());
            } else {
                orderedStart = new Point(e.getX(), e.getY());
                orderedEnd   = new Point((int)getStart().getX(), 
                                                   (int)getStart().getY());
            }
        } else {
            if (getStart().getY() < e.getY()) {
                orderedStart = new Point((int)getStart().getX(), e.getY());
                orderedEnd   = new Point(e.getX(), (int)getStart().getY());
            }
        }
        
        notifyShapeInProgress(new FilledRectangle(getDrawColor(),
                                                  orderedStart, 
                                                  orderedEnd));
    }
}
