package edu.wcu.cs.cs363.team3.project03.gui.shape.producer;

import java.awt.Color;
import java.awt.event.MouseEvent;

/**
 * Application of the Null Object pattern to the ShapeProducer 
 * inheritance tree.
 *
 * @author Chris Blades
 * @author Don Coffin
 * @author Benny Reese
 *
 * @version Apr 12, 2010
 */
public class NullShapeProducer extends AbstractShapeProducer {

    /**
     * Construct a new NullShapeProducer.  Just here to enforce uniform
     * construts in ShapeProducers.
     */
    public NullShapeProducer() {
        super();
    }

    /**
     * Creates a new NullShapeProducer with the given drawColor.  
     * Just here to enforce uniform constructors in ShapeProducers.
     * 
     * @param drawColor color to draw in, but no use here
     */
    public NullShapeProducer(Color drawColor) {
        super(drawColor);
    }

    /**
     * Called when the user releases the mouse button.  
     * Do nothing, Null Object pattern.
     * 
     * @param e the Event that generated this method call
     */
    public void mouseReleased(MouseEvent e) {
        // do nothing
    }
    
    /**
     * Called when the user drags the mouse with the button held down.
     * Do nothing, Null Object pattern.
     * 
     * @param e the event that generated this method call.
     */
    public void mouseDragged(MouseEvent e) {
        // do nothing
    }
    
    /**
     * Called when the user clicks the mouse button.  Do nothing, 
     * NullObject pattern.
     * 
     * @param e the event that generated this method call.
     */
    public void mousePressed(MouseEvent e) {
        // do nothing
    }
}

