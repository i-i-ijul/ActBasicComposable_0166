package com.example.pertemuan3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.pertemuan3.ui.theme.LayoutBoxColumnRow
import com.example.pertemuan3.ui.theme.LayoutPraktikum
import com.example.pertemuan3.ui.theme.Pertemuan3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Pertemuan3Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    LayoutBoxColumnRow(
                        modifier = Modifier.padding(innerPadding)
                    )
                    LayoutPraktikum(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}