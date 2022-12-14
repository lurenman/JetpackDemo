package com.example.jetpackdemo.lifecycle

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

/**
 * @Author yang.bai.
 * Date: 2022/11/30
 *  参考：https://blog.csdn.net/u012165769/article/details/108626783
 */
class PlayListener : LifecycleObserver {
    companion object {
        val TAG = "PlayListener"
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun initVideo() {
        Log.d(TAG, "initVideo: ------")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun startPlay() {
        Log.d(TAG, "startPlay: ------")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun pausePlay() {
        Log.d(TAG, "pausePlay: ------")
    }

}