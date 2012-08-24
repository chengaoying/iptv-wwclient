package wwnet;

import cn.ohyeah.stb.protocolv2.HeadWrapper;
import cn.ohyeah.stb.servicev2.FrameDecoder;
import cn.ohyeah.stb.util.ByteBuffer;

public class WWNetFrameDecoder extends FrameDecoder {

    protected Object decodeOtherMessageTag(ByteBuffer data, HeadWrapper head) {
        Object result = null;
        switch (head.getCommand()) {
            case Constant.PUSH_MSG_ROOM_INFO:
                result = decodeMessageRoomInfo(data, head);
                break;
            case Constant.PUSH_MSG_TABLE_INFO:
                result = decodeMessageTableInfo(data, head);
                break;
            case Constant.PUSH_MSG_GAME_START:
                result = decodeMessageGameStart(data, head);
                break;
            case Constant.PUSH_MSG_GAME_ROUND:
                result = decodeMessageGameRound(data, head);
                break;
            case Constant.PUSH_MSG_GAME_END:
                result = decodeMessageGameEnd(data, head);
                break;
            default: raiseError(data, head);
        }
        return result;
    }

    private Object decodeMessageRoomInfo(ByteBuffer data, HeadWrapper head) {
        return null;  //To change body of created methods use File | Settings | File Templates.
    }

    private Object decodeMessageTableInfo(ByteBuffer data, HeadWrapper head) {
        return null;  //To change body of created methods use File | Settings | File Templates.
    }

    private Object decodeMessageGameStart(ByteBuffer data, HeadWrapper head) {
        return null;  //To change body of created methods use File | Settings | File Templates.
    }

    private Object decodeMessageGameRound(ByteBuffer data, HeadWrapper head) {
        return null;  //To change body of created methods use File | Settings | File Templates.
    }

    private Object decodeMessageGameEnd(ByteBuffer data, HeadWrapper head) {
        return null;  //To change body of created methods use File | Settings | File Templates.
    }

    protected Object decodeOtherTag(ByteBuffer data, HeadWrapper head) {
        Object result = null;
        if (head.getTag() == Constant.PROTOCOL_TAG_GAME_SERVER) {
            result = decodeTagGameServer(data, head);
        }
        else {
            raiseError(data, head);
        }
        return result;
    }

    protected Object decodeTagGameServer(ByteBuffer data, HeadWrapper head) {
        Object result = null;
        switch (head.getCommand()) {
            case Constant.CMD_HALL:
                result = decodeCmdHall(data, head);
                break;
            case Constant.CMD_ROOM:
                result = decodeCmdRoom(data, head);
                break;
            case Constant.CMD_TABLE:
                result = decodeCmdTable(data, head);
                break;
            case Constant.CMD_GAME:
                result = decodeCmdGame(data, head);
                break;
            default: result = raiseError(data, head);
        }
        return result;
    }

    protected Object decodeCmdHall(ByteBuffer data, HeadWrapper head) {
        Object result = null;
        switch (head.getUserdata()) {
            case Constant.HALL_UD_LOGIN: break;
            case Constant.HALL_UD_QUIT: break;
            case Constant.HALL_UD_QUERY_INFO: break;
            default: result = raiseError(data, head);
        }
        return result;
    }

    protected Object decodeCmdRoom(ByteBuffer data, HeadWrapper head) {
        Object result = null;
        switch (head.getUserdata()) {
            case Constant.ROOM_UD_LOGIN: break;
            case Constant.ROOM_UD_QUIT: break;
            case Constant.ROOM_UD_QUICK_JOIN_TABLE: break;
            case Constant.ROOM_UD_QUERY_INFO: break;
            default: result = raiseError(data, head);
        }
        return result;
    }

    protected Object decodeCmdTable(ByteBuffer data, HeadWrapper head) {
        Object result = null;
        switch (head.getUserdata()) {
            case Constant.TABLE_UD_JOIN: break;
            case Constant.TABLE_UD_QUIT: break;
            case Constant.TABLE_UD_PREPARE: break;
            case Constant.TABLE_UD_QUERY_INFO: break;
            default: result = raiseError(data, head);
        }
        return result;
    }

    protected Object decodeCmdGame(ByteBuffer data, HeadWrapper head) {
        Object result = null;
        switch (head.getUserdata()) {
            case Constant.GAME_UD_QUIT: break;
            case Constant.GAME_UD_COERCE_QUIT: break;
            case Constant.GAME_UD_USE_PROP: break;
            case Constant.GAME_UD_ATTACK: break;
            case Constant.GAME_UD_END_ROUND: break;
            default: result = raiseError(data, head);
        }
        return result;
    }
}
