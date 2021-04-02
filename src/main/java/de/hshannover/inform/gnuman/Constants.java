package de.hshannover.inform.gnuman;

import de.hshannover.inform.gnuman.Log.LogLevel;
import javafx.scene.paint.Color;

/**
 * Global constants within the game. These are never going to change on runtime.
 * @author Marc Herschel
 */
@SuppressWarnings("unused")
public final class Constants {

    /*
     * Log related
     */
    final static String DEBUG_LOG_FILE = "output.log";
    final static String DEBUG_LOG_TIME_FORMAT = "dd.MM.yyyy HH:mm:ss.S";
    final static LogLevel DEBUG_LEVEL_MIN = Log.LogLevel.INFO;
    final static boolean DEBUG_LOG = false;

    /*
     * True => No Music/Sound | False => Music/Sound (Default => False)
     */
    public final static boolean DEBUG_NO_SOUND = false;
    /*
     * True => Player is invincible | False => Player can loose by dying (Default => False)
     */
    public final static boolean DEBUG_CANT_DIE = false;
    /*
     * True => Debug Renderer | False => Game Renderer (Default => False)
     */
    public final static boolean DEBUG_RENDERER = false;
    /*
     * True => Use DEBUG_FPS as frame rate | False => Use user defined frame rate (Default => False)
     */
    public final static boolean DEBUG_USE_OWN_FPS = false;
    /*
     * Integer => Frame rate to use in game
     */
    public final static int     DEBUG_FPS = 5;
    /*
     * True => No speed adjustment to FPS | False => Speed adjustment to FPS (Always same speed on different frame rates) (Default => False)
     */
    public final static boolean DEBUG_DISABLE_SPEED_ADJUSTMENT = false;
    /*
     * True => Display current cell of ghost | False => Don't show that (Default => False) (Needs debug renderer = true)
     */
    public final static boolean DEBUG_GHOST_CURRENT_CELL = false;
    /*
     * True => Display current target tile of ghost as a colored circle | False => Don't show that (Default => False) (Needs debug renderer = true)
     */
    public final static boolean DEBUG_GHOST_CURRENT_TARGET_TILE = false;
    /*
     * True => Draw Cell Coordinates in format x y | False => Don't show that (Default => False) (Needs debug renderer = true)
     */
    public final static boolean DEBUG_DRAW_CELL_COORDINATES = false;
    /*
     * True => Test audio system on startup | False => Don't test (Default => False)
     */
    public final static boolean DEBUG_AUDIO_TEST = false;

    /*
     * Texture related
     */
    public final static int TEXTURE_SPRITE_SHEET_DIMENSION = 14;
    public final static boolean TEXTURE_USE_CLASSIC_SPRITES_FOR_GHOSTS = false;
    public final static String TEXTURE_PATH_PREFIX = "/textures/";
    public final static String TEXTURE_LOAD_ERROR = "error.png";
    public final static String TEXTURE_GHOST_SPRITES_CLASSIC = "ghostSpritesClassic.png";
    public final static String TEXTURE_GHOST_SPRITES_CORPORATIONS = "ghostSpritesForGnuman.png";

    /*
     * File related
     */
    public final static String DATA_PREFIX = "/data/";
    public final static String FILE_MAP = DATA_PREFIX + "map.gnuman";

    /*
     * FXML related
     */
    final static String FXML_FILE_PREFIX = "/fxml/";
    final static String FXML_CSS_FILE = "/css/style.css";

    /*
     * Audio related
     */
    public final static String AUDIO_PARSE_MUSIC = DATA_PREFIX + "music.parse";
    public final static String AUDIO_PARSE_SOUND = DATA_PREFIX + "sound.parse";
    public final static String AUDIO_FILE_PREFIX = "/audio/";

    /*
     * Highscore related
     */
    public final static String HIGHSCORE_LOCATION = ".gnuman_highscore";
    public final static String HIGHSCORE_BOX_CSS_ID = "highscore-vbox";
    public final static String HIGHSCORE_HEADLINE_CSS_ID = "highscore-top";
    public final static String HIGHSCORE_RESULT_CSS_ID = "highscore-result";
    public final static String HIGHSCORE_RANK_FORMAT = "%-20s %08d";
    public final static String HIGHSCORE_EMPTY_NAME = "None";
    public final static String HIGHSCORE_UNKNOWN_PLAYER = "Unknown";
    public final static double HIGHSCORE_BOX_WIDTH = 800.00;
    public final static double HIGHSCORE_BOX_HEIGHT = 265.00;
    public final static int HIGHSCORE_EMPTY_POINTS = 0;
    public final static int HIGHSCORE_NAME_MAX_LENGTH = 12;
    public final static int HIGHSCORE_MAX_PLAYERS_TO_DISPLAY = 5;

    /*
     * UI related
     */
    final static String GAME_ICON = TEXTURE_PATH_PREFIX + "game/life.png";
    public final static String MAIN_MENU_WISEDOM = DATA_PREFIX + "wisdom.stallman";
    public final static String OPTIONS_CSS_ENABLED = "options-enabled";
    public final static String OPTIONS_CSS_DISABLED = "options-disabled";
    public final static Color UI_BORDER = Color.web("#FF2A99");

    /*
     * Mystery
     */
    public final static int INTERJECTION_FONT_SIZE = 18;
    public final static int INTERJECTION_WIDTH = 1000;
    public final static int INTERJECTION_HEIGHT = 800;
    public final static String INTERJECTION_FONT = "/css/fonts/SourceCodePro-Regular.ttf";
    public final static String INTERJECTION = DATA_PREFIX + "interjection.rms";

    /*
     * Canvas related
     */
    public static final Color HIGHSCORE_CANVAS_FILL_COLOR = Color.rgb(255, 42, 153);

    /*
     * Game related
     */
    public final static double GAME_MOVEMENT_SPEED_TO_BLOCK_RATIO = 0.15;

    /*
     * Resolution Option related
     */
    public final static int[] POSSIBLE_FRAMERATES = { 60, 120, 144, 240, 30 };
    public final static int DEFAULT_BLOCK_DIMENSIONS = 25;
    public final static int DEFAULT_MAP_HEIGHT = 31;
    public final static int DEFAULT_MAP_WIDTH = 28;

    static {
        if(DEBUG_CANT_DIE || DEBUG_DISABLE_SPEED_ADJUSTMENT || DEBUG_DRAW_CELL_COORDINATES || DEBUG_AUDIO_TEST ||DEBUG_GHOST_CURRENT_CELL || DEBUG_GHOST_CURRENT_TARGET_TILE || DEBUG_NO_SOUND || DEBUG_RENDERER || DEBUG_USE_OWN_FPS)
            System.out.println("DEBUG SETTINGS ARE ENABLED!!!");
    }
}
