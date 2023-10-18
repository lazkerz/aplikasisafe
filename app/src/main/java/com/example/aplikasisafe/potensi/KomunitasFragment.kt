package com.example.aplikasisafe.potensi

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.aplikasisafe.adapters.ObrolanAdapter
import com.example.aplikasisafe.databinding.FragmentObrolanBinding
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.aplikasisafe.R
import com.example.aplikasisafe.adapters.KomunitasAdapter
import com.example.aplikasisafe.databinding.FragmentKomunitasBinding
import com.example.aplikasisafe.model.KomunitasModel
import com.example.aplikasisafe.model.ObrolanModel


class KomunitasFragment : Fragment() {

    private lateinit var _binding: FragmentKomunitasBinding
    private lateinit var adapter: KomunitasAdapter

    private val binding get() = _binding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentKomunitasBinding.inflate(inflater, container, false)
        return binding.root
        // Inflate the layout for this fragment
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setKomunitasAdapter()
    }

    private fun setKomunitasAdapter() {
        val dataList: MutableList<KomunitasModel> = mutableListOf()

        komunitas().forEachIndexed { index, komunitas ->
            dataList.add(KomunitasModel (image()[index], komunitas, namaakun()[index], isipost()[index], imgpost()[index]))
        }
        Log.d("ISI DATANYA ", dataList.toString())
        adapter = KomunitasAdapter(dataList, requireContext())
        binding.recyleview.layoutManager = LinearLayoutManager(requireContext())
        binding.recyleview.adapter = adapter
    }

    private fun komunitas(): Array<String> = resources.getStringArray(R.array.komunitas)

    private fun namaakun(): Array<String> = resources.getStringArray(R.array.namaakun)
    private fun isipost(): Array<String> = resources.getStringArray(R.array.isipost)
    private fun image(): List<Int> = listOf(
        R.drawable.ava_post,
        R.drawable.ava_post2,
        R.drawable.ava_post3,
        R.drawable.ava_post4,
    )

    private fun imgpost(): List<Int> = listOf(
        R.drawable.img_post,
        R.drawable.img_post2,
        R.drawable.img_post3,
        R.drawable.img_post4,
    )


}