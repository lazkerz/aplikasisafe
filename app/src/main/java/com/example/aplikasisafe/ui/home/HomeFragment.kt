package com.example.aplikasisafe.ui.home

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.aplikasisafe.Pelatihan.JobActivity
import com.example.aplikasisafe.Pelatihan.TemaPelatihanActivity
import com.example.aplikasisafe.R
import com.example.aplikasisafe.adapters.HomeAdapter
import com.example.aplikasisafe.databinding.FragmentHomeBinding
import com.example.aplikasisafe.model.HomeModel
import com.example.aplikasisafe.potensi.PotensiActivity


class HomeFragment : Fragment() {

    private lateinit var _binding: FragmentHomeBinding
    private lateinit var adapter: HomeAdapter

    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val view = binding.root

        val menu1: ImageButton = view.findViewById(R.id.menu1)
        val menu2: ImageButton = view.findViewById(R.id.menu2)
        val menu3: ImageButton = view.findViewById(R.id.menu3)


        menu1.setOnClickListener {
            // Tindakan saat tombol diklik
            val intent = Intent(activity, JobActivity::class.java)
            startActivity(intent)
        }


        menu2.setOnClickListener {
            // Tindakan saat tombol diklik
            val intent = Intent(activity, TemaPelatihanActivity::class.java)
            startActivity(intent)
        }


        menu3.setOnClickListener {
            // Tindakan saat tombol diklik
            val intent = Intent(activity, PotensiActivity::class.java)
            startActivity(intent)
        }

        return view
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setHomeAdapter()
    }

        private fun setHomeAdapter() {
            val dataList: MutableList<HomeModel> = mutableListOf()

            judul().forEachIndexed { index, judul ->
                dataList.add(HomeModel(image()[index], judul, isi()[index]))
            }
            Log.d("ISI DATANYA ", dataList.toString())
            adapter = HomeAdapter(dataList, requireContext())
            binding.recyleview.layoutManager = LinearLayoutManager(requireContext())
            binding.recyleview.adapter = adapter
        }

        private fun judul(): Array<String> = resources.getStringArray(R.array.judul)
        private fun isi(): Array<String> = resources.getStringArray(R.array.isi)
        private fun image(): List<Int> = listOf(
            R.drawable.anti,
            R.drawable.anti2,
            R.drawable.anti3,
            R.drawable.anti4,
            R.drawable.anti5,
        )
    }