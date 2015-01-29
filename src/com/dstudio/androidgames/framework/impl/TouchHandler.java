package com.dstudio.androidgames.framework.impl;

import android.view.MotionEvent;
import android.view.View;
import com.dstudio.androidgames.framework.Input;

import java.util.List;

/**
 * Created by denny_000 on 29.01.2015.
 */
public interface TouchHandler extends View.OnTouchListener {
    public boolean isTouchDown(int pointer);

    public int getTouchX(int pointer);

    public int getTouchY(int pointer);

    public List<Input.TouchEvent> getTouchEvents();

}
