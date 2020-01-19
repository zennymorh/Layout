package com.zennymorh.layout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.zennymorh.layout.databinding.ActivityMainBinding
import com.zennymorh.layout.databinding.ActivityWeatherBinding

class WeatherActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWeatherBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_weather)
        binding.next.setOnClickListener{
            move(it)
        }

    }

    private fun move(view: View){
        val intent = Intent(this, BusinessActivity::class.java)
        startActivity(intent)
    }
}
