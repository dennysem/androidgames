package com.dstudio.androidgames.framework.impl;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/**
 * Created by denny_000 on 27.01.2015.
 */
public class AccelerometerHandler implements SensorEventListener {
    public float getAccelX() {
        return accelX;
    }

    float accelX;

    public float getAccelY() {
        return accelY;
    }

    float accelY;

    public float getAccelZ() {
        return accelZ;
    }

    float accelZ;

    public AccelerometerHandler (Context context) {
        SensorManager manager = (SensorManager) context.getSystemService(Context.SENSOR_SERVICE);
        if (manager.getSensorList(Sensor.TYPE_ACCELEROMETER).size() != 0) {
            Sensor accelerometer = manager.getSensorList(Sensor.TYPE_ACCELEROMETER).get(0);
            manager.registerListener(this, accelerometer,SensorManager.SENSOR_DELAY_GAME);
        }
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        accelX = sensorEvent.values[0];
        accelY = sensorEvent.values[1];
        accelZ = sensorEvent.values[2];
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}
