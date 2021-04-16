package de.hshannover.inform.gnuman.app.model.strategy;

import de.hshannover.inform.gnuman.app.model.AbstractGhost;
import de.hshannover.inform.gnuman.app.model.Player;
import de.hshannover.inform.gnuman.app.model.storage.MapCell;

/**
 * Strategy for Pinky.
 * @author Moiz Abdullah
 */

public class BlinkyStrategy implements Strategy {

    @Override
    public MapCell chaseStrategy(Player player, AbstractGhost ghost) {
        return new MapCell(player.clampCellX(), player.clampCellY());
    }

}
