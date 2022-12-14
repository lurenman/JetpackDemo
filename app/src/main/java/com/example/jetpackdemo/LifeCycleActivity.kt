package com.example.jetpackdemo

import com.example.androidtest.base.BaseActivity
import com.example.jetpackdemo.lifecycle.BasePresenter
import com.example.jetpackdemo.lifecycle.IPresenter
import com.example.jetpackdemo.lifecycle.PlayListener

/**
 * @Author yang.bai.
 * Date: 2022/11/30
 * 可以操作activity/fragment/service/app 等
 */
class LifeCycleActivity : BaseActivity() {
    companion object {
        val TAG = "LifeCycleActivity"
    }

    lateinit var mPlayListener: PlayListener
    lateinit var mPresenter: IPresenter

    override fun getActionBarTitle(): String = TAG

    override fun getLayoutResId(): Int = R.layout.activity_lifecycle

    override fun initView() {
        super.initView()
        //实质就是监听生命周期解藕
        mPlayListener = PlayListener()
        lifecycle.addObserver(mPlayListener)

        mPresenter = BasePresenter()
        lifecycle.addObserver(mPresenter)
    }
}