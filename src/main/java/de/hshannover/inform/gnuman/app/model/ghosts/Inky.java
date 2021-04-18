package de.hshannover.inform.gnuman.app.model.ghosts;

import de.hshannover.inform.gnuman.app.enums.gameobjects.EntityObjects;
import de.hshannover.inform.gnuman.app.model.AbstractGhost;
import de.hshannover.inform.gnuman.app.model.Player;
import de.hshannover.inform.gnuman.app.model.coordination.GhostMovementCoordinator;
import de.hshannover.inform.gnuman.app.model.storage.DynamicVariables;
import de.hshannover.inform.gnuman.app.model.storage.GameVariableTracker;
import de.hshannover.inform.gnuman.app.model.storage.MapCell;
import de.hshannover.inform.gnuman.app.model.strategy.InkyStrategy;

/**
 * Responds to Inkys behavior. <br>
 * Inky will first target a tile that is 2 cells in front of the player (takes 4 tile bug from original pacman into consideration).<br>
 * Then he will extend that point with the difference between the point and Blinky.<br>
 * The resulting tile is the new target tile.
 * @author Marc Herschel
 */

public class Inky extends AbstractGhost {

    public Inky(DynamicVariables dyn, GhostMovementCoordinator coordinator, GameVariableTracker tracker) {
        super(EntityObjects.INKY, dyn, coordinator, tracker);
        this.strategy = new InkyStrategy(); // Set Chase Strategy
    }

}
