package com.dstudio.androidgames.framework.impl;

import android.graphics.Bitmap;
import com.dstudio.androidgames.framework.Graphics;
import com.dstudio.androidgames.framework.Pixmap;

import java.util.BitSet;

/**
 * Created by denny_000 on 01.02.2015.
 */
public class AndroidPixmap implements Pixmap{
    Bitmap bitmap;
    Graphics.PixmapFormat format;

    public AndroidPixmap(Bitmap bitmap, Graphics.PixmapFormat format) {
        this.bitmap = bitmap;
        this.format = format;
    }

    @Override
    public int getWidth() {
        return bitmap.getWidth();
    }

    @Override
    public int getHeight() {
        return bitmap.getHeight();
    }

    @Override
    public Graphics.PixmapFormat getFormat() {
        return format;
    }

    @Override
    public void dispose() {
        bitmap.recycle();
    }
}
