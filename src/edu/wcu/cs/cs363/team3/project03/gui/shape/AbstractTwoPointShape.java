package edu.wcu.cs.cs363.team3.project03.gui.shape;

import java.awt.Color;
import java.awt.Point;

/**
 * Provides functionality common to all Shapes that can be described with
 * only two points.
 *
 * @author Chris Blades
 * @author Don Coffin
 * @author Benny Reese
 *
 * @version 9/4/2010
 */
public abstract class AbstractTwoPointShape extends AbstractShape {

    /** Starting point of this Shape */
    private Point start;

    /** Ending point of this Shape */
    private Point end;

    /**
     * Create a new AbstractTwoPointShape of the given color, starting at point
     * <i>start</i> and ending at point <i>end</i>.
     *
     * @param color Color in which this Shape should draw itself.
     * @param start starting point for this Shape
     * @param end   ending point of this Shape.
     */
    public AbstractTwoPointShape(Color color, Point start, Point end) {
        super(color);           // AbstractShape handles drawing color
        this.start = start;
        this.end   = end;
    }

    /**
     * Return the start point of this Shape.
     *
     * @return this Shape's start point
     */
    protected Point getStart() {
        return this.start;
    }

    /**
     * Return the end point of this Shape.
     *
     * @return this Shape's end point
     */
    protected Point getEnd() {
        return this.end;
    }
}
