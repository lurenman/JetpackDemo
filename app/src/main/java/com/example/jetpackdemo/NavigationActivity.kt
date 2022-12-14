package com.example.jetpackdemo

import androidx.navigation.Navigation
import com.example.androidtest.base.BaseActivity

/**
 * @Author yang.bai.
 * Date: 2022/11/30
 */
class NavigationActivity :BaseActivity() {
    companion object{
        val TAG="NavigationActivity"
    }
    override fun getActionBarTitle(): String = TAG

    override fun getLayoutResId(): Int =R.layout.activity_navigation


    /**
     * onSupportNavigateUp()方法的重写，意味着Activity将它的 back键点击事件的委托出去，如果当前并非栈中顶部的Fragment, 那么点击back键，返回上一个Fragment
     */
    override fun onSupportNavigateUp() =
        Navigation.findNavController(this, R.id.my_nav_host_fragment).navigateUp()
}