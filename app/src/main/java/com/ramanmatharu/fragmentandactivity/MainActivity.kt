package com.ramanmatharu.fragmentandactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ramanmatharu.fragmentandactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var activityInterface : ActivityInterface
    var num = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.redBtn.setOnClickListener {
            activityInterface.setRedColor()
        }

        binding.blueBtn.setOnClickListener {
            activityInterface.setBlueColor()
        }

        binding.greenBtn.setOnClickListener {
            activityInterface.setGreenColor()
        }
    }

    fun updateNumber() {
        binding.numBtn.text = num.toString()
    }

    fun setZero() {
        num = 0
        binding.numBtn.text = (num.toString())
    }
}