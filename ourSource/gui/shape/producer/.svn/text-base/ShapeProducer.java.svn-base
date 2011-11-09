package edu.wcu.cs.cs363.team3.project03.gui.shape.producer;

import edu.wcu.cs.cs363.team3.project03.gui.shape.producer.ShapeCreationListener;

import java.awt.Color;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * Defines the functionality of a ShapeProducer, a class responsible for
 * monitoring user input and constructing Shape objects accordingly.
 *
 * @author Chris Blades
 * @author Don Coffin
 * @author Benny Reese
 *
 * @version Apr 12, 2010
 */
public interface ShapeProducer extends MouseListener, MouseMotionListener {
    
    /**
     * Adds a ShapeCreationListener to receive notifications about Shapes
     * being created.
     * 
     * @param l ShapeCreationListener to add
     */
	public void addShapeCreationListener(ShapeCreationListener l);
	
	/**
	 * Removes a ShapeCreationListener such that it no longer receives 
	 * notifications about Shapes being created.
	 * 
	 * @param l the ShapeCreationListener to remove
	 */
	public void removeShapeCreationListener(ShapeCreationListener l);
	
	/**
	 * Change the color in which this ShapeProducer creates Shapes
	 * 
	 * @param drawColor color to create new Shapes in
	 */
	public void setDrawColor(Color drawColor);
	

}
