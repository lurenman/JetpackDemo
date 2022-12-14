package com.example.jetpackdemo.lifecycle

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.OnLifecycleEvent
import org.jetbrains.annotations.NotNull

/**
 * @Author yang.bai.
 * Date: 2022/12/1
 */
open class IPresenter : LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    protected open fun onCreate(@NotNull owner: LifecycleOwner) = Unit

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    protected open fun onDestroy(@NotNull owner: LifecycleOwner) = Unit

    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    protected open fun onLifecycleChanged(
        @NotNull owner: LifecycleOwner,
        @NotNull event: Lifecycle.Event
    ) = Unit

}