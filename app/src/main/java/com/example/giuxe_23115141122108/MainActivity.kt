package com.example.giuxe_23115141122108

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.giuxe_23115141122108.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btntinh2108.setOnClickListener {
            val bienso = Logic70.kiemTraBienSo(binding.edtbienso2108.text.toString())
            val sogio = Logic70.docSoGio(binding.edtsogio2108.text.toString(), min = 1 , max = 24 )
            val dongia = Logic70.docDonGia(binding.edtdongia2108.text.toString(), min = 1000)

            if (bienso == null || sogio == null || dongia == null) {
                binding.ketqua2108.text = ""
                Toast.makeText(this, "Vui lòng nhập đúng và đủ dữ liệu!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val ketqua = Logic70.tinhToan(sogio, dongia)
            binding.ketqua2108.text = "Thông tin: $bienso\nKết quả tính toán: $ketqua"
        }

        binding.btnxoa2108.setOnClickListener {
            binding.edtbienso2108.text.clear()
            binding.edtsogio2108.text.clear()
            binding.edtdongia2108.text.clear()
            binding.ketqua2108.text = ""
            binding.edtsogio2108.requestFocus()
            Toast.makeText(this, "Đã làm sạch form!", Toast.LENGTH_SHORT).show()
        }
    }
}