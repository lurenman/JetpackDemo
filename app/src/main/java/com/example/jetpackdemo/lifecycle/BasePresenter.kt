package com.example.jetpackdemo.lifecycle

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner

/**
 * @Author yang.bai.
 * Date: 2022/12/1
 * mvp处理是有点用的，创建及注册在内部处理
 */
class BasePresenter : IPresenter() {
    companion object{
        val TAG="BasePresenter"
    }
    override fun onCreate(owner: LifecycleOwner) {
        Log.d(TAG, "onCreate: ------")
    }

    override fun onDestroy(owner: LifecycleOwner) {
        Log.d(TAG, "onDestroy: ------")

    }

    override fun onLifecycleChanged(owner: LifecycleOwner, event: Lifecycle.Event) {
        Log.d(TAG, "onLifecycleChanged: event:${event.name}")
    }
}