package nl.han.ica.oopg;

import nl.han.ica.oopg.engine.GameEngine;
import nl.han.ica.oopg.view.View;
import nl.han.ica.oopg.view.Viewport;

public class FakeGameEngine extends GameEngine {
    public FakeGameEngine() {
        View view = new View(100, 100);
        Viewport viewport = new Viewport(0, 0, 100, 100);

        view.setViewport(viewport);
        setView(view);
    }

    @Override
    public void setupGame() {

    }

    @Override
    public void update() {

    }
}
