package edu.wcu.cs.cs363.team3.project03.gui.shape.producer;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;

/**
 * Defines functionality common to ShapeProducers that produce Shapes that
 * can be defined by two points.
 *
 * @author Chris Blades
 * @author Don Coffin
 * @author Benny Reese
 *
 * @version Apr 12, 2010
 */
public class AbstractTwoPointShapeProducer extends AbstractShapeProducer {
    /** The starting point of a two point Shape */
    private Point start;
    
    /**
     * Constructs a new AbstractTwoPointShapeProducer with default values.
     * Does nothing but call super(), but is here to allow construction
     * with default constructor.
     */
    public AbstractTwoPointShapeProducer() {
        super();
    }
    
    /**
     * Constructs a new AbstractTwoPointShapeProducer that will create
     * Shapes in the given Color.
     * 
     * @param drawColor the color in which Shapes will be produced.
     */
    public AbstractTwoPointShapeProducer(Color drawColor) {
        super(drawColor);
    }
    

    /**
     * Records the starting point of a Shape when the mouse button is
     * pressed.
     * 
     * @param e the event that generated this method call.
     */
    public void mousePressed(MouseEvent e) {
        start = new Point(e.getX(), e.getY());
    }
    
    /**
     * Returns the starting point of the Shape this ShapeProducer will
     * produce.
     * 
     * @return A Shape's starting point.
     */
    protected Point getStart() {
        return this.start;
    }
}
