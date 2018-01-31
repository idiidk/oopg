package nl.han.ica.oopd.oopg.dashboard;

import nl.han.ica.oopd.oopg.alarm.Alarm;
import nl.han.ica.oopd.oopg.alarm.IAlarmListener;
import processing.core.PGraphics;

/**
 * The FPSCounter is used by the GameEngine and shows the Frames Per Second on the screen.
 */
public class FPSCounter extends Dashboard implements IAlarmListener {

    private int fps;
    private int fpsCounter;

    /**
     * Create a new FPSCounter object.
     *
     * @param x
     * @param y
     */
    public FPSCounter(float x, float y) {
        super(x, y, 0, 0);
        startTimer();
    }

    /**
     * Draws the FPS on the given canvas.
     */
    @Override
    public void draw(PGraphics g) {
        g.beginDraw();

        fpsCounter += 1;
        g.text(fps, x, y);

        g.endDraw();
    }

    /**
     * Executed by the alarm when the timer has expired.
     */
    @Override
    public void triggerAlarm(String alarmName) {
        fps = fpsCounter;
        fpsCounter = 0;
        startTimer();
    }

    /**
     * Starts a new Alarm.
     */
    private void startTimer() {
        Alarm alarm = new Alarm("FPSCounter", 1);
        alarm.addTarget(this);
        alarm.start();
    }
}