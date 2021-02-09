package com.kotlin.mylivedata

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.kotlin.mylivedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mLiveDataTimerViewModel: MainViewModel
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mLiveDataTimerViewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[MainViewModel::class.java]
        subscribe()
    }

    private fun subscribe() {
        val elapsedTimeObserver = Observer<Long?> { aLong ->
            val newText = this@MainActivity.resources.getString(R.string.seconds, aLong)
            binding.timerTextview.text = newText
        }

        mLiveDataTimerViewModel.getElapsedTime().observe(this, elapsedTimeObserver)
    }
}