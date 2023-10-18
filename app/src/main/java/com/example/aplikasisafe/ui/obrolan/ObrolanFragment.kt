package com.example.aplikasisafe.ui.obrolan

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.aplikasisafe.R
import com.example.aplikasisafe.adapters.HomeAdapter
import com.example.aplikasisafe.adapters.ObrolanAdapter
import com.example.aplikasisafe.databinding.FragmentHomeBinding
import com.example.aplikasisafe.databinding.FragmentObrolanBinding
import com.example.aplikasisafe.model.HomeModel
import com.example.aplikasisafe.model.ObrolanModel

class ObrolanFragment : Fragment() {

    private lateinit var _binding: FragmentObrolanBinding
    private lateinit var adapter: ObrolanAdapter

    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentObrolanBinding.inflate(inflater, container, false)
        return binding.root
        }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setObrolanAdapter()
    }

    private fun setObrolanAdapter() {
        val dataList: MutableList<ObrolanModel> = mutableListOf()

        nama().forEachIndexed { index, nama ->
            dataList.add(ObrolanModel(imageobrolan()[index], nama, isicht()[index]))
        }
        Log.d("ISI DATANYA ", dataList.toString())
        adapter = ObrolanAdapter(dataList, requireContext())
        binding.recyleview.layoutManager = LinearLayoutManager(requireContext())
        binding.recyleview.adapter = adapter
    }

    private fun nama(): Array<String> = resources.getStringArray(R.array.nama)
    private fun isicht(): Array<String> = resources.getStringArray(R.array.isicht)
    private fun imageobrolan(): List<Int> = listOf(
        R.drawable.cht1,
        R.drawable.cht2,
        R.drawable.cht3,
        R.drawable.cht4,
    )

}