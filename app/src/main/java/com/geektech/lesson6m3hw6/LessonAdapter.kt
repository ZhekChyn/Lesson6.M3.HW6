package com.geektech.lesson6m3hw6

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.geektech.lesson6m3hw6.databinding.ItemLessonBinding

class LessonAdapter(val data: ArrayList<Lesson>): RecyclerView.Adapter<LessonAdapter.LessonViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LessonViewHolder {
        return LessonViewHolder(ItemLessonBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: LessonViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int = data.size

    class LessonViewHolder(val binding: ItemLessonBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(lesson: Lesson) {
            binding.lesson.text = lesson.lesson
            lesson.color?.let { itemView.context.getColor(it) }
                ?.let { binding.mainLayout.setBackgroundColor(it) }
            Glide.with(binding.image).load(lesson.image).into(binding.image)
        }
    }
}