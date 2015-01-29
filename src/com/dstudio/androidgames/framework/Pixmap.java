package com.dstudio.androidgames.framework;

/**
 * Created by denny_000 on 27.01.2015.
 */
public interface Pixmap {
    public int getWidth();

    public int getHeight();

    public Graphics.PixmapFormat getFormat();

    public void dispose();
}
