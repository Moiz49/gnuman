package de.hshannover.inform.gnuman.app.model.strategy;

import de.hshannover.inform.gnuman.app.enums.Directions;
import de.hshannover.inform.gnuman.app.model.AbstractGhost;
import de.hshannover.inform.gnuman.app.model.Player;
import de.hshannover.inform.gnuman.app.model.storage.MapCell;

/**
 * Strategy for Pinky.
 * @author Moiz Abdullah
 */

public class PinkyStrategy implements Strategy {
    @Override
    public MapCell chaseStrategy(Player player, AbstractGhost ghost) {
        Directions d = player.getDirection();
        int xPlayerOffset, yPlayerOffset;
        //X Calculation will take the original games offset bug into consideration!
        xPlayerOffset = (d == Directions.LEFT || d == Directions.RIGHT || d == Directions.UP)
                ? (d == Directions.RIGHT && d != Directions.UP ? 4 : -4) : 0;
        yPlayerOffset = (d == Directions.DOWN || d == Directions.UP) ? (d == Directions.DOWN
                ? 4 : -4) : 0;
        return new MapCell(player.clampCellX() + xPlayerOffset, player.clampCellY()
                + yPlayerOffset);
    }
}

