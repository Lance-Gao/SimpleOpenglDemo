package com.onething.firstopengldemo;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.Log;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class MyRenderer implements GLSurfaceView.Renderer {
    private static String TAG = "MyRenderer";

    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {
        Log.i(TAG, "onSurfaceCreated ... lance");
        // 设置清屏颜色
        GLES20.glClearColor(0f, 1f, 0f, 0f);
    }

    @Override
    public void onSurfaceChanged(GL10 gl, int width, int height) {
        Log.i(TAG, "onSurfaceChanged ... lance width " + width + " height " + height);
        // 设置窗口大小
        GLES20.glViewport(0, 0, width, height);
    }

    @Override
    public void onDrawFrame(GL10 gl) {
        Log.i(TAG, "onDrawFrame ... lance");
        // 调用GLES20.glClear(GL10.GL_COLOR_BUFFER_BIT)方法清除屏幕颜色，执行这个方法之后，屏幕就会渲染之前通过glClearColor设置的颜色
        GLES20.glClear(GL10.GL_COLOR_BUFFER_BIT);
    }
}
