package de.hshannover.inform.gnuman.app.model.ghosts;

import de.hshannover.inform.gnuman.app.enums.Directions;
import de.hshannover.inform.gnuman.app.enums.gameobjects.EntityObjects;
import de.hshannover.inform.gnuman.app.model.AbstractGhost;
import de.hshannover.inform.gnuman.app.model.Player;
import de.hshannover.inform.gnuman.app.model.coordination.GhostMovementCoordinator;
import de.hshannover.inform.gnuman.app.model.storage.DynamicVariables;
import de.hshannover.inform.gnuman.app.model.storage.GameVariableTracker;
import de.hshannover.inform.gnuman.app.model.storage.MapCell;
import de.hshannover.inform.gnuman.app.model.strategy.PinkyStrategy;

/**
 * Responds to Pinkys behavior.<br>
 * Pinky will always try to be four blocks in front of the player.<br>
 * The top-left bug from the original pacman is taken into consideration.
 * @author Marc Herschel
 */

public class Pinky extends AbstractGhost {

    public Pinky(DynamicVariables dyn, GhostMovementCoordinator coordinator, GameVariableTracker tracker) {
        super(EntityObjects.PINKY, dyn, coordinator, tracker);
        setChaseBehaviorStrategy(new PinkyStrategy());
    }

    @Override
    protected MapCell decideChaseBehavior(Player player) {
        return getChaseBehaviorStrategy().strategy(player, coordinator);
    }

}
