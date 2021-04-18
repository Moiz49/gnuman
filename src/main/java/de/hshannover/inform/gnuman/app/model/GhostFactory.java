package de.hshannover.inform.gnuman.app.model;

import de.hshannover.inform.gnuman.app.model.ghosts.Blinky;
import de.hshannover.inform.gnuman.app.model.ghosts.Clyde;
import de.hshannover.inform.gnuman.app.model.ghosts.Inky;
import de.hshannover.inform.gnuman.app.model.ghosts.Pinky;
import de.hshannover.inform.gnuman.app.model.storage.DynamicVariables;
import de.hshannover.inform.gnuman.app.model.storage.GameVariableTracker;
import de.hshannover.inform.gnuman.app.model.coordination.GhostMovementCoordinator;

/**
 * Factory for creating Ghost.
 * @author Moiz Abdullah
 */

public class GhostFactory {
    public AbstractGhost createGhost (String ghostType, DynamicVariables dyn,
                GhostMovementCoordinator coordinator, GameVariableTracker tracker) {
        if(ghostType.equalsIgnoreCase("BLINKY")) {
            return new Blinky(dyn, coordinator, tracker);
        }
        else if (ghostType.equalsIgnoreCase("PINKY")) {
            return new Pinky(dyn, coordinator, tracker);
        }
        else if (ghostType.equalsIgnoreCase("CLYDE")) {
            return new Clyde(dyn, coordinator, tracker);
        }
        else if (ghostType.equalsIgnoreCase("INKY")) {
            return new Inky(dyn, coordinator, tracker);
        }
        else {
            return null;
        }
    }
}


