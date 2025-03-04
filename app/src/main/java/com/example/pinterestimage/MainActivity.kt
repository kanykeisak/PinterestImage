package com.example.pinterestimage

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.pinterestimage.databinding.ActivityMainBinding
import com.example.pinterestimage.view.adapters.ApiAdapter
import com.example.pinterestimage.viewmodel.ApiViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val adapter = ApiAdapter()

    private val viewModel: ApiViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        initialize()
    }

    private fun initialize() {
        viewModel.getImages("49164749-a4e8aa80ec795c35329a829ea", "orange")

        binding.apply {
            recyclerView.adapter = adapter
            viewModel.images.observeForever { response ->
                adapter.submitList(response.hits)
            }
        }


    }
}