package com.example.myapplication.View

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp

@Composable
fun TelaPrincipal() {
    Column(
        modifier = Modifier
            .background(color = Color.Yellow)
            .padding(top = Dp(15F)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Amogus")
    }
}