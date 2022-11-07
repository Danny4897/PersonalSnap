package com.kaizen.starter.ui.compounds

import android.content.Context
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import coil.load
import com.kaizen.starter.data.model.Dummy
import com.kaizen.starter.databinding.DummyCardBinding

class DummyCard(context: Context) : ConstraintLayout(context) {
    private val binding: DummyCardBinding =
        DummyCardBinding.inflate(LayoutInflater.from(context), this, true)

    fun setupWithViewBean(dummy: Dummy) {
        binding.title.text = dummy.displayName
        binding.image.load(dummy.imageUrl)
    }
}