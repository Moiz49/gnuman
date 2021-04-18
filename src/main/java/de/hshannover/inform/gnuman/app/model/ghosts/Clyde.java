package de.hshannover.inform.gnuman.app.model.ghosts;

import de.hshannover.inform.gnuman.app.enums.gameobjects.EntityObjects;
import de.hshannover.inform.gnuman.app.model.AbstractGhost;
import de.hshannover.inform.gnuman.app.model.coordination.GhostMovementCoordinator;
import de.hshannover.inform.gnuman.app.model.storage.DynamicVariables;
import de.hshannover.inform.gnuman.app.model.storage.GameVariableTracker;
import de.hshannover.inform.gnuman.app.model.strategy.ClydeStrategy;

/**
 * Responds to Clydes behavior.<br>
 * Clyde will check if the player is 8+ blocks away from him.<br>
 * If that is the case he will proceed to his scatter corner.<br>
 * Else he'll chase the player.
 * @author Marc Herschel
 */

public class Clyde extends AbstractGhost {

    public Clyde(DynamicVariables dyn, GhostMovementCoordinator coordinator, GameVariableTracker tracker){
        super(EntityObjects.CLYDE, dyn, coordinator, tracker);
        this.strategy = new ClydeStrategy(); // Set Chase Strategy
    }

}



