package de.hshannover.inform.gnuman.app.model.strategy;

import de.hshannover.inform.gnuman.app.enums.Directions;
import de.hshannover.inform.gnuman.app.model.Player;
import de.hshannover.inform.gnuman.app.model.coordination.GhostMovementCoordinator;
import de.hshannover.inform.gnuman.app.model.storage.MapCell;

/**
 * Strategy for Inky.
 * @author Moiz Abdullah
 */

public class InkyStrategy implements Strategy {

    @Override
    public MapCell strategy(Player player, GhostMovementCoordinator coordinator) {
        Directions d = player.getDirection();
        int initialOffsetX, initialOffsetY, blinkyToOffsetX, blinkyToOffsetY;
        //X Calculation will take the original games offset bug into consideration!
        initialOffsetX = player.clampCellX() + ((d == Directions.LEFT || d == Directions.RIGHT || d == Directions.UP) ? (d == Directions.RIGHT && d != Directions.UP ? 2 : -2) : 0);
        initialOffsetY = player.clampCellY() + ((d == Directions.DOWN || d == Directions.UP) ? (d == Directions.DOWN ? 2 : -2) : 0);
        blinkyToOffsetX = (initialOffsetX - coordinator.getBlinkyX())*2;
        blinkyToOffsetY = (initialOffsetY - coordinator.getBlinkyY())*2;
        return new MapCell(coordinator.getBlinkyX() + blinkyToOffsetX, coordinator.getBlinkyY()+blinkyToOffsetY);
    }

}
