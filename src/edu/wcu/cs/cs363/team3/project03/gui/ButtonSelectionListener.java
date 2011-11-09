package edu.wcu.cs.cs363.team3.project03.gui;

/**
 * Interface for observers interested in changes in ShapeButtonPanel
 *
 * @author Andy Dalton
 * @author Chris Blades
 * @author Don Coffin
 * @author Benny Reese
 *
 * @version 9/4/2010
 */
public interface ButtonSelectionListener {
    /**
     * Notification to observers that the button selection in
     * ShapeButtonPanel has changed.
     */
    public void selectionChanged();
}
