package wwnet;


import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

public class WWNetMIDlet extends MIDlet{
    protected void startApp() throws MIDletStateChangeException {
        WWNetEngine engine = WWNetEngine.createInstance(this);
        Display.getDisplay(this).setCurrent(engine);
        new Thread(engine).start();
    }
    protected void pauseApp() {}
    protected void destroyApp(boolean b) throws MIDletStateChangeException {}
}
