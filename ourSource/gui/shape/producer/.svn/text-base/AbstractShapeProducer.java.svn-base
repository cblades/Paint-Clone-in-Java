package edu.wcu.cs.cs363.team3.project03.gui.shape.producer;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import java.util.List;

import edu.wcu.cs.cs363.team3.project03.gui.shape.Shape;

/**
 * Defines functionality common to all ShapeProducers.  Maintains a list
 * of ShapeCreationListeners and notifies them of Shapes being produced.
 *
 * @author Chris Blades
 * @author Don Coffin
 * @author Benny Reese
 *
 * @version Apr 12, 2010
 */
public abstract class AbstractShapeProducer extends MouseAdapter 
                                                implements ShapeProducer {
    /** Listeners interested in Shapes produced */
    private List<ShapeCreationListener> listeners;

    /** The color to produce Shapes in */
    private Color drawColor;
     
    /**
     * Creates a new AbstractShapeProducer with a default drawColor.
     */
    public AbstractShapeProducer() {
        this(Color.BLACK);
    }
    
    /**
     * Creates a new AbstractShapeProducer that will produce Shapes in 
     * the given color.
     * 
     * @param drawColor color to produce Shapes in
     */
    public AbstractShapeProducer(Color drawColor) {
        this.drawColor = drawColor;
        this.listeners = new ArrayList<ShapeCreationListener>();
    }
    
    /**
     * Returns the Color in which this Producer produces Shapes.
     * 
     * @return the color this ShapeProducer is using to produce Shapes
     */
    public Color getDrawColor() {
        return drawColor;
    }
    
    /**
     * Notifies all ShapeCreationListeners that a Shape has been created
     * and should be treated as permanent.
     * 
     * @param shape the shape that was produced
     */
    protected void notifyShapeCreated(Shape shape) {
        for (ShapeCreationListener l : listeners) {
            l.shapeCreated(shape);
        }
    }
    
    /**
     * Notifies all ShapeCreationListeners that a Shape is being created
     * and that the given Shape is transient and should be treated as
     * non-permanent.
     * 
     * @param shape A transient Shape created before a permanent Shape is
     * produced
     */
    protected void notifyShapeInProgress(Shape shape) {
        for (ShapeCreationListener l : listeners) {
            l.shapeInProgress(shape);
        }
    }
    
    ///////////////////////////
    // ShapeProducer Implementation
    //////////////////////////
    
    /**
     * Adds a ShapeCreationListener to this ShapeProducer that will 
     * receive notifications about Shapes being produced.
     * 
     * @param l ShapeCreationListener to add
     */
    @Override
    public void addShapeCreationListener(ShapeCreationListener l) {
        // TODO Auto-generated method stub

    }

    /**
     * Removes a ShapeCreationListener from this ShapeProducer such that
     * the ShapeCreationListener will no longer receive notifications about
     * Shapes being produced.
     * 
     * @param l The ShapeCreationListener to remove
     */
    @Override
    public void removeShapeCreationListener(ShapeCreationListener l) {
        // TODO Auto-generated method stub

    }

    /**
     * Sets the color in which this ShapeProducer will create Shapes.
     * 
     * @param Color the color in which to produce shapes
     */
    @Override
    public void setDrawColor(Color drawColor) {
        // TODO Auto-generated method stub

    }

}
