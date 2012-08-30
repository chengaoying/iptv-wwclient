package wwnet;


import cn.ohyeah.stb.game.GameCanvasEngine;
import cn.ohyeah.stb.servicev2.AbstractService;
import cn.ohyeah.stb.util.ByteBuffer;

import javax.microedition.midlet.MIDlet;

public class WWNetEngine extends GameCanvasEngine{
    static WWNetEngine instance;

    public WWNetEngine(MIDlet midlet) {
        super(midlet);
        AbstractService.registerFrameDecoder(new WWNetFrameDecoder());
    }

    public static WWNetEngine createInstance(MIDlet midle) {
        if (instance == null) {
            instance = new WWNetEngine(midle);
        }
        return instance;
    }

    protected void processServerMessage(ByteBuffer message) {
        //TODO
    }

    protected void loop() {
        //TODO

    }
}
