package com.example.jetpackdemo

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.androidtest.base.BaseActivity
import com.example.jetpackdemo.util.toast
import kotlinx.android.synthetic.main.activity_live_data.*

/**
 * @Author yang.bai.
 * Date: 2022/12/2
 * 参考：https://juejin.cn/post/6844903748574117901
 * livedata注册观察者，依赖lifecycle实现
 */
class LiveDataActivity : BaseActivity() {
    companion object {
        val TAG = LiveDataActivity::class.java.simpleName
    }

    private var i = 0
    lateinit var mLivedata: MutableLiveData<Int>

    override fun getActionBarTitle(): String = TAG

    override fun getLayoutResId(): Int = R.layout.activity_live_data

    override fun initVariables() {
        super.initVariables()
        mLivedata = MutableLiveData()
        mLivedata.observe(this, {
            toast("the mLivedata value:${it}")
            Log.d(TAG, "initVariables observe mLivedata value: ${it}")
        })
        //看源码装饰者模式可知道 shouldBeActive=true，不随生命周期变化，和mLivedata生命周期绑定
        mLivedata.observeForever {
            Log.d(TAG, "initVariables observe observeForever value: ${it}")
        }
    }

    override fun initListenter() {
        super.initListenter()
        btn_click.setOnClickListener {
            i++
            //这种是在主线程的，看源码
            mLivedata.value = i
            //异步，子线程调用，很好理解
            //mLivedata.postValue()
        }
    }

    override fun onPause() {
        super.onPause()
        i++
        mLivedata.value = i
    }
}