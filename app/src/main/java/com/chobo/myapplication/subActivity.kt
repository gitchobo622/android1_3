package com.chobo.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.chobo.myapplication.databinding.ActivitySubBinding

class subActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySubBinding.inflate(layoutInflater)
        setContentView(binding.root)


        if(intent.hasExtra("msg")){
            binding.tvGetMsg.text = intent.getStringExtra("msg")
        }
    }
}