package wwnet;

public class Constant {
    public static final byte PROTOCOL_VERSION = 2;
    public static final byte PROTOCOL_TAG_GAME_SERVER = 0X0F;


    public static final byte PUSH_MSG_ROOM_INFO = 0;
    public static final byte PUSH_MSG_TABLE_INFO = 1;
    public static final byte PUSH_MSG_GAME_START = 2;
    public static final byte PUSH_MSG_GAME_ROUND = 3;
    public static final byte PUSH_MSG_GAME_END = 4;

    public static final byte CMD_HALL = 0;
    public static final byte CMD_ROOM = 1;
    public static final byte CMD_TABLE = 2;
    public static final byte CMD_GAME = 3;

    public static final byte HALL_UD_LOGIN = 0;
    public static final byte HALL_UD_QUIT = 1;
    public static final byte HALL_UD_QUERY_INFO = 2;

    public static final byte ROOM_UD_LOGIN = 0;
    public static final byte ROOM_UD_QUIT = 1;
    public static final byte ROOM_UD_QUICK_JOIN_TABLE = 2;
    public static final byte ROOM_UD_QUERY_INFO = 3;

    public static final byte TABLE_UD_JOIN = 0;
    public static final byte TABLE_UD_QUIT = 1;
    public static final byte TABLE_UD_PREPARE = 2;
    public static final byte TABLE_UD_QUERY_INFO = 3;

    public static final byte GAME_UD_QUIT = 0;
    public static final byte GAME_UD_COERCE_QUIT = 1;
    public static final byte GAME_UD_USE_PROP = 2;
    public static final byte GAME_UD_ATTACK = 3;
    public static final byte GAME_UD_END_ROUND = 4;
    public static final byte GAME_UD_QUERY_INFO = 5;
}
