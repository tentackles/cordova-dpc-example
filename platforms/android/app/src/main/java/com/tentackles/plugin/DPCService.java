package com.tentackles.plugin;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import org.apache.cordova.LOG;
//import android.support.annotation.Nullable;

/**
 * Created by Belal on 12/30/2016.
 */

public class DPCService extends Service {
    //creating a mediaplayer object

    private final IBinder mBinder = new LocalBinder();
    public class LocalBinder extends Binder {
        DPCService getService() {
            return DPCService.this;
        }
    }


    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        //getting systems default ringtone
        LOG.d("CORDOVA_DPC: ", "Background Service Started");

        //we have some options for service
        //start sticky means service will be explicity started and stopped
        return START_STICKY;
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}