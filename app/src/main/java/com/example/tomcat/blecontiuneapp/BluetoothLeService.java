package com.example.tomcat.blecontiuneapp;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

public class BluetoothLeService extends Service
{
    public BluetoothLeService()
    {}

    @Override
    public IBinder onBind(Intent intent)
    {
        // TODO: Return the communication channel to the service.
        //throw new UnsupportedOperationException("Not yet implemented");
        return mBinder;
    }

    @Override
    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }


    public class LocalBinder extends Binder
    {

    }

    private final IBinder mBinder = new LocalBinder();



}
