package edu.wcu.cs.cs363.team3.project03.gui.shape;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Implements functionality common to all Shapes.  Handles draw color.
 *
 * @author Chris Blades
 * @author Don Coffin
 * @author Benny Reese
 *
 * @version 9/4/2010
 */
public abstract class AbstractShape implements Shape {
    
    /** Color with which to draw this Shape*/
    private Color color;

    /**
     * Create a new AbstractShape that will draw itself with the given
     * Color.
     *
     * @param drawColor the Color in which AbstractShape should draw itself
     */
    public AbstractShape(Color color) {
        this.color = color;
    }

    /**
     * Prepare the given graphical context so that subclasses can just draw
     * themselves.  Set draw color.
     *
     * @param g graphical context to setup for drawing
     */
    public void draw(Graphics g) {
        g.setColor(color);
    }
}
