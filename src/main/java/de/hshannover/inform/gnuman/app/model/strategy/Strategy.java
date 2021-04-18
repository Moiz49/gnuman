package de.hshannover.inform.gnuman.app.model.strategy;

import de.hshannover.inform.gnuman.app.model.Player;
import de.hshannover.inform.gnuman.app.model.storage.MapCell;
import de.hshannover.inform.gnuman.app.model.AbstractGhost;

/**
 * Strategy for Chase Behavior.
 * @author Moiz Abdullah
 */

public interface Strategy {
    public abstract MapCell chaseStrategy(Player player, AbstractGhost ghost);
}

