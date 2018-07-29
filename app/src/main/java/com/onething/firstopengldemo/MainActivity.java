package com.onething.firstopengldemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {
    private MySurfaceView mySurfaceView;
    private static String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "onCreate ... lance");
        super.onCreate(savedInstanceState);
        mySurfaceView = new MySurfaceView(this);
        setContentView(mySurfaceView);
    }

    @Override
    protected void onResume() {
        Log.i(TAG, "onResume ... lance");
        super.onResume();
        mySurfaceView.onResume();
    }

    @Override
    protected void onPause() {
        Log.i(TAG, "onPause ...lance");
        super.onPause();
        mySurfaceView.onPause();
    }
}
