package edu.wcu.cs.cs363.team3.project03.gui.shape;

import java.awt.Color;
import java.awt.Point;
import java.awt.Graphics;

/**
 * Represents a Line that can draw itself.
 *
 * @author Chris Blades
 * @author Don Coffin
 * @author Benny Reese
 *
 * @version 9/4/2010
 */
public class Line extends AbstractTwoPointShape {

    /**
     * Construct a new Line stretching from <i>start</i> to
     * <i>end</i> that will draw itself in the given color.
     *
     * @param color  color in which Line should draw itself.
     * @param start  one end of the line
     * @param end    the other end of the line
     */
    public Line(Color color, Point start, Point end) {
        super(color, start, end);
    }

    /**
     * Draws this Line to the given graphical context in the given color.
     *
     * @param g graphical context to draw to
     */
    public void draw(Graphics g) {
        super.draw(g);

        g.drawLine((int)getStart().getX(), (int)getStart().getY(), 
                   (int)getEnd().getX(),   (int)getEnd().getY());
    }
}
