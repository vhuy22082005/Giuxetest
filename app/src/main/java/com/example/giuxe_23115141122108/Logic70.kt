package com.example.giuxe_23115141122108

import java.util.Locale

object Logic70 {

    fun kiemTraBienSo(text: String): String? {
        val trimmed = text.trim().uppercase(Locale.ROOT)
        return if (trimmed.isEmpty() || trimmed.length !in 4..12) null else trimmed
    }

    fun docSoGio(str: String, min: Int = 1, max: Int = 24): Int? {
        return try {
            val num = str.trim().toInt()
            if (num in min..max) num else null
        } catch (e: Exception) {
            null
        }
    }
    fun docDonGia(str: String, min: Int = 1000, max: Int = 500000): Int? {
        return try {
            val num = str.trim().toInt()
            if (num in min..max) num else null
        } catch (e: Exception) {
            null
        }
    }

    fun tinhToan(soGio: Int, donGia: Int): Int {
        var ketQua = soGio * donGia
        return ketQua
    }
}