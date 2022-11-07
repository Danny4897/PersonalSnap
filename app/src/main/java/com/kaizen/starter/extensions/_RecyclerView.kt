package com.kaizen.starter.extensions

import androidx.recyclerview.widget.RecyclerView
import com.kaizen.starter.ui.base.MarginItemDecoration

fun RecyclerView.setSpacing(dimenResource: Int) {
    addItemDecoration(MarginItemDecoration(resources.getDimension(dimenResource).toInt()))
}