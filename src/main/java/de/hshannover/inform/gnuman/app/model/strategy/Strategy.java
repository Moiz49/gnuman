package de.hshannover.inform.gnuman.app.model.strategy;

import de.hshannover.inform.gnuman.app.model.Player;
import de.hshannover.inform.gnuman.app.model.coordination.GhostMovementCoordinator;
import de.hshannover.inform.gnuman.app.model.storage.MapCell;

/**
 * Strategy for Chase Behavior.
 * @author Moiz Abdullah
 */

public interface Strategy {
    abstract MapCell strategy(Player player, GhostMovementCoordinator coordinator);
}
