package edu.wcu.cs.cs363.team3.project03.gui.shape;

import java.awt.Graphics;

/**
 * Implementation of <i>Null Object</i> pattern for the Shape interface.
 *
 * @author Chris Blades
 * @author Don Coffin
 * @author Benny Reese
 *
 * @version 9/4/2010
 */
public class NullShape implements Shape {

    /**
     * Does Nothing as per Null Object pattern
     *
     * @param g not used
     */
    public void draw(Graphics g) {
        // DO NOTHING
        //
        // Null Object pattern
    }
}
