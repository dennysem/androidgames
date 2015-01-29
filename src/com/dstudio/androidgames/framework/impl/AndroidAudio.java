package com.dstudio.androidgames.framework.impl;

import android.app.Activity;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.AudioManager;
import android.media.SoundPool;
import com.dstudio.androidgames.framework.Audio;
import com.dstudio.androidgames.framework.Music;
import com.dstudio.androidgames.framework.Sound;

import java.io.IOException;

/**
 * Created by denny_000 on 27.01.2015.
 */
public class AndroidAudio implements Audio {
    AssetManager assets;
    SoundPool soundPool;

    public AndroidAudio(Activity activity) {
        activity.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        this.assets = activity.getAssets();
        this.soundPool = new SoundPool(20, AudioManager.STREAM_MUSIC, 0);
    }

    @Override
    public Music newMusic(String fileName) {
        try {
            AssetFileDescriptor assetFileDescriptor = assets.openFd(fileName);
            return new AndroidMusic(assetFileDescriptor);
        } catch (IOException e) {
            throw new RuntimeException("Can't load music " + fileName);
        }
    }

    @Override
    public Sound newSound(String fileName) {
        try {
            AssetFileDescriptor assetFileDescriptor = assets.openFd(fileName);
            int soundID = soundPool.load(assetFileDescriptor, 0);
            return new AndroidSound(soundPool, soundID);
        } catch (IOException e) {
            throw new RuntimeException("Can't load sound " + fileName);
        }
    }
}
