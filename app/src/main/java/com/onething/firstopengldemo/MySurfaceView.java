package com.onething.firstopengldemo;

import android.content.Context;
import android.opengl.GLSurfaceView;

public class MySurfaceView extends GLSurfaceView {
    private MyRenderer myRender;

    public MySurfaceView(Context context) {
        super(context);
        init();
    }

    private void init() {
        // 创建一个GL20的Context
        setEGLContextClientVersion(2);
        // 创建一个渲染器实例
        myRender = new MyRenderer();
        // 设置渲染器实例
        setRenderer(myRender);
        // 设置渲染模式
        setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
    }
}
