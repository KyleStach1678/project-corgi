package net.deepwater.corgi;

/**
 * Created by Kyle on 9/6/2015.
 */
public abstract class GameState {
    public abstract void update(float dt);
    public abstract void render();
    public abstract void start();
    public abstract void pause();
    public abstract void resume();
    public abstract void stop();
}
