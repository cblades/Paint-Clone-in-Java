package edu.wcu.cs.cs363.team3.project03.gui.shape;

import java.awt.Graphics;
import java.io.Serializable;

/**
 * Represents shapes that can draw themselves and written to an 
 * output stream.
 *
 * @author Andy Dalton
 * @author Chris Blades
 * @author Don Coffin
 * @author Benny Reese
 *
 * @version 9/4/2010
 */
public interface Shape extends Serializable {
   /**
    * When called, Shape will draw itself to the given graphics context.
    *
    * @param g graphical context on which to draw Shape
    */
   public void draw(Graphics g);
}
