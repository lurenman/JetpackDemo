package com.example.jetpackdemo

import android.content.Intent
import android.view.View
import com.example.androidtest.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

/**
 * 参考：https://blog.csdn.net/mq2553299/article/details/80445952
 * https://www.jianshu.com/p/66b93df4b7a6
 */
class MainActivity : BaseActivity(), View.OnClickListener {
    override fun getActionBarTitle(): String = "JetpackDemo"

    override fun getLayoutResId(): Int = R.layout.activity_main

    override fun initListenter() {
        super.initListenter()
        btn_navigation.setOnClickListener(this@MainActivity)
        btn_lifecycle.setOnClickListener(this@MainActivity)
        btn_view_model.setOnClickListener(this@MainActivity)
        btn_live_data.setOnClickListener(this@MainActivity)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_navigation -> {
                val intent = Intent(mContext, NavigationActivity::class.java)
                startActivity(intent)
            }
            R.id.btn_lifecycle -> {
                val intent = Intent(mContext, LifeCycleActivity::class.java)
                startActivity(intent)
            }
            R.id.btn_view_model -> {
                val intent = Intent(mContext, ViewModelActivity::class.java)
                startActivity(intent)
            }
            R.id.btn_live_data -> {
                Intent(mContext, LiveDataActivity::class.java).let {
                    startActivity(it)
                }
            }
        }
    }
}