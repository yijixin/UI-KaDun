package bkt.zakj.com.butterknifetest.app;

import android.app.Application;

import bkt.zakj.com.butterknifetest.choreographer.BlockDetectByChoreographer;

/**
 * Created by Administrator on 2017/4/18.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        BlockDetectByChoreographer.start();
    }
}
