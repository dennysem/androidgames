package com.dstudio.androidgames.framework;

/**
 * Created by denny_000 on 27.01.2015.
 */
public interface Game {
    public Input getInput();

    public FileIO getFileIO();

    public Graphics getGraphics();

    public Audio getAudio();

    public void setScreen(Screen screen);

    public Screen getCurrentScreen();

    public Screen getStartScreen();
}
