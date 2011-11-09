package edu.wcu.cs.cs363.team3.project03.gui.shape.producer;

import edu.wcu.cs.cs363.team3.project03.gui.shape.Shape;
/**
 * Defines the functionality of a class that can receive notifications
 * about Shapes being created by a ShapeProducer object.
 *
 * @author Chris Blades
 * @author Don Coffin
 * @author Benny Reese
 *
 * @version Apr 12, 2010
 */
public interface ShapeCreationListener {
    
    /**
     * Called when a Shape has been created that is permanent.
     * 
     * @param shape The Shape that was created by the ShapeProducer
     */
	public void shapeCreated(Shape shape);
	
	/**
	 * Called when a Shape is in the process of being created and 
	 * intermediate Shapes are being produced.
	 * 
	 * @param shape A Shape produced by a ShapeProducer that should be 
	 * treated as non-permanent.
	 */
	public void shapeInProgress(Shape shape);
}
