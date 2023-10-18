package com.example.aplikasisafe.ui.profile

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.aplikasisafe.Pelatihan.JobActivity
import com.example.aplikasisafe.Pelatihan.LoginActivity
import com.example.aplikasisafe.R
import com.example.aplikasisafe.databinding.FragmentHomeBinding
import com.example.aplikasisafe.databinding.FragmentObrolanBinding
import com.example.aplikasisafe.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {

    private lateinit var _binding: FragmentProfileBinding

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        val view = binding.root

        val out: ImageButton = view.findViewById(R.id.out)

        out.setOnClickListener {
            // Tindakan saat tombol diklik
            val intent = Intent(activity, LoginActivity::class.java)
            startActivity(intent)
        }

        return view
    }

}