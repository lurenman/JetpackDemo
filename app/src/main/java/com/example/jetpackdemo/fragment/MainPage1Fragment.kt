package com.example.jetpackdemo.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.navOptions
import com.example.jetpackdemo.R
import kotlinx.android.synthetic.main.fragment_main_page1.*

/**
 * @Author yang.bai.
 * Date: 2022/11/30
 */
class MainPage1Fragment : Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_main_page1, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_skip.setOnClickListener {
            //点击跳转page2
            // 设置动画参数
//            val navOption = navOptions {
//                anim {
//                    enter = R.anim.slide_in_right
//                    exit = R.anim.slide_out_left
//                    popEnter = R.anim.slide_in_left
//                    popExit = R.anim.slide_out_right
//                }
//            }
//            // 参数设置
//            val bundle = Bundle()
//            bundle.putString("name","TeaOf")
 //           Navigation.findNavController(it).navigate(R.id.action_page2,bundle,navOption)
            Navigation.findNavController(it).navigate(R.id.action_page2)
        }
    }

}