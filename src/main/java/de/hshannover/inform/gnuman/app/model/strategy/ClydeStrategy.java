package de.hshannover.inform.gnuman.app.model.strategy;

import de.hshannover.inform.gnuman.app.model.AbstractGhost;
import de.hshannover.inform.gnuman.app.model.Player;
import de.hshannover.inform.gnuman.app.model.storage.MapCell;
import de.hshannover.inform.gnuman.app.util.Helper;


/**
 * Strategy for Pinky.
 * @author Moiz Abdullah
 */

public class ClydeStrategy implements Strategy {
    @Override
    public MapCell chaseStrategy(Player player, AbstractGhost ghost) {
        if(Helper.euclideanDistance(ghost.clampCellX(), ghost.clampCellY(),
                player.clampCellX(), player.clampCellY()) < 9.0) {
            return ghost.getCoordinator().getScatterPoint(ghost.getEntityType());
        }
        return new MapCell(player.clampCellX(), player.clampCellY());
    }
}

