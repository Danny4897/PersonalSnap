package com.kaizen.starter.ui.main.view.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.NavController
import com.kaizen.starter.databinding.MainFragmentBinding
import com.kaizen.starter.ui.main.view.recycler.DummyAdapter
import com.kaizen.starter.ui.main.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
@AndroidEntryPoint
class MainFragment : Fragment() {
    private var navController: NavController? = null
    private val viewModel: MainViewModel by viewModels()
    private lateinit var binding: MainFragmentBinding

    private val dummyAdapter: DummyAdapter = DummyAdapter {
        Toast.makeText(context, "${it.displayName}", Toast.LENGTH_SHORT).show()
    }

    companion object {
        fun newInstance() = MainFragment()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = MainFragmentBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}