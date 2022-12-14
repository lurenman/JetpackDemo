package com.example.jetpackdemo

import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.androidtest.base.BaseActivity
import com.example.jetpackdemo.viewmodel.MyViewModel
import kotlinx.android.synthetic.main.activity_view_model.*

/**
 * @Author yang.bai.
 * Date: 2022/12/1
 * 翻源码参考原理，实际map保存，这个版本，activity销毁后onRetainNonConfigurationInstance()恢复
 * 原理可参考：https://blog.csdn.net/lingjianglin/article/details/122158725
 */
class ViewModelActivity : BaseActivity() {
    companion object {
        val TAG = "ViewModelActivity"
    }

   private var i = 0

    lateinit var vM: MyViewModel
    override fun getActionBarTitle(): String = TAG

    override fun getLayoutResId(): Int = R.layout.activity_view_model

    override fun initVariables() {
        super.initVariables()
        //我们可以看到activit实现了ViewModelStoreOwner,重新赋值可以看到onRetainNonConfigurationInstance()这个方法
        val vp = ViewModelProvider(this)
        //调用这个实际就是保存在hashmap
        vM = vp.get(MyViewModel::class.java)
    }

    override fun initListenter() {
        super.initListenter()
        btn_test.setOnClickListener {
            //旋转屏幕Activity会销毁 i的值会重新变为0
            i++
            Log.d(TAG, "initListenter the i value ${i} ")
            //旋转屏幕Activity会销毁 vM.i的值不会变
            vM.i++
            Log.d(TAG, "initListenter the vM.i value ${vM.i} ")
        }
    }
}