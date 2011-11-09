package edu.wcu.cs.cs363.team3.project03.gui.shape;

import java.awt.Color;
import java.awt.Point;
import java.awt.Graphics;

/**
 * Represents a Rectangle that can draw itself and fill itself with color.
 *
 * @author Chris Blades
 * @author Don Coffin
 * @author Benny Reese
 *
 * @version 9/4/2010
 */
public class FilledRectangle extends AbstractTwoPointShape {

    /**
     * Creates a new FilledRectangle that will be drawn and fill itself 
     * with the specified color with it's upper left corner at 
     * <i>start</i> and lower right corner at <i>end</i>
     *
     * @param color  color in which Line should draw and fill itself.
     * @param start  coordinates of the upper left corner
     * @param end    coordinates of the lower right corner
     */
    public FilledRectangle(Color color, Point start, Point end) {
        super(color, start, end);
    }

    /**
     * Draws and fills this Rectangle to the given graphical context 
     * with the given color.
     *
     * @param g graphical context to draw to
     */
    public void draw(Graphics g) {
        super.draw(g);

        g.fillRect((int)getStart().getX(), (int)getStart().getY(), 
                   (int)getEnd().getX(),   (int)getEnd().getY());
    }
}
