package edu.wcu.cs.cs363.team3.project03.gui.shape;

import java.util.ListIterator;
import java.util.ArrayList;
import java.util.List;
import java.awt.Color;
import java.awt.Point;
import java.awt.Graphics;

/**
 * Represents a Curve of indeterminate points  that can draw itself.
 *
 * @author Chris Blades
 * @author Don Coffin
 * @author Benny Reese
 *
 * @version 9/4/2010
 */
public class Curve extends AbstractShape {

    /** List of points defining this Curve */
    private List<Point> points;

    /**
     * Creates a new Curve beginning with the line described by
     * <i>start</i> and <i>end</i>.
     *
     * @param color color in which to draw this Curve
     * @param points list of points defining this Curve
     */
    public Curve(Color color, List<Point> points) {
        super(color);
        this.points = points;
    }

    /**
     * Draws this Curve to the given graphical context as a series of 
     * linear segments.
     *
     * @param g graphical context on which to draw
     */ 
    public void draw(Graphics g) {
        super.draw(g);
        // will store the starting point of the current line segment within
        // the Curve
        Point currentStart = points.get(0);

        // start iterator at 2nd element (index 1) because 1st element will
        // be STAT point of first line segment
        ListIterator iterator = points.listIterator(1);

        // loop through points and draw curve as a series of lines
        while (iterator.hasNext()) {
            Point currentEnd = (Point)iterator.next();

            g.drawLine((int)currentStart.getX(), (int)currentEnd.getY(),
                       (int)currentEnd.getX(),   (int)currentEnd.getY());

            currentStart = currentEnd;
        }
    }
}
