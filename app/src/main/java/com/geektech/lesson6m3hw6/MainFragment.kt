package com.geektech.lesson6m3hw6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.geektech.lesson6m3hw6.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding
    private var data = arrayListOf<Lesson>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(LayoutInflater.from(requireContext()), container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        val adapter = LessonAdapter(data)
        binding.recycler.layoutManager = GridLayoutManager(requireContext(), 2)
        binding.recycler.adapter = adapter
    }

    private fun loadData() {
        data.add(Lesson("https://www.pngall.com/wp-content/uploads/9/History-Book.png", "History", R.color.teal_200))
        data.add(Lesson("https://upload.wikimedia.org/wikipedia/commons/c/c3/Deus_mathematics.png", "Math", R.color.red))
        data.add(Lesson("https://www.pinclipart.com/picdir/middle/522-5228047_transparent-biology-clipart-microbiology-png.png", "Biology", R.color.orange))
        data.add(Lesson("https://w7.pngwing.com/pngs/900/3/png-transparent-human-anatomy-s-positive-back-muscle-structure.png", "Anatomy", R.color.blue))
        data.add(Lesson("https://cdn-icons-png.flaticon.com/512/188/188802.png", "Physics", R.color.green))
    }
}