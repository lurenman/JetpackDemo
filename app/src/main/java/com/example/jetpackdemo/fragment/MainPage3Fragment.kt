package com.example.jetpackdemo.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.jetpackdemo.R
import kotlinx.android.synthetic.main.fragment_main_page3.*


/**
 * @Author yang.bai.
 * Date: 2022/11/30
 */
class MainPage3Fragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_main_page3, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_back.setOnClickListener {
            //点击返回page1
            Navigation.findNavController(it).navigateUp()
        }

    }
}