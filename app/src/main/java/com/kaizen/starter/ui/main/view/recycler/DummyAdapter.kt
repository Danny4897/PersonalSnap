package com.kaizen.starter.ui.main.view.recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.kaizen.starter.data.model.Dummy
import com.kaizen.starter.databinding.DummyCardBinding

class DummyAdapter(private val onItemClicked: (Dummy) -> Unit) :
    ListAdapter<Dummy, DummyAdapter.DummyHolder>(DiffCallback()) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DummyHolder {
        val inflate = DummyCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DummyHolder(inflate)
    }

    override fun onBindViewHolder(holder: DummyHolder, position: Int) {
        val dummy = currentList[position]
        holder.bind(dummy)
    }

    override fun getItemCount(): Int {
        return currentList.size
    }

    private class DiffCallback : DiffUtil.ItemCallback<Dummy>() {
        override fun areItemsTheSame(oldItem: Dummy, newItem: Dummy) =
            oldItem.id == newItem.id

        override fun areContentsTheSame(oldItem: Dummy, newItem: Dummy) =
            oldItem == newItem
    }

    inner class DummyHolder(private val binding: DummyCardBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(dummy: Dummy) {
            binding.title.text = dummy.displayName
            binding.image.load(dummy.imageUrl)
            binding.card.setOnClickListener {
                onItemClicked(dummy)
            }
        }
    }
}