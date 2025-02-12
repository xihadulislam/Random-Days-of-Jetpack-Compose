package com.ziad.random_days_of_jetpack_compose.ui.screen.components.speedIndicator

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun SpeedValue(value: String) {
    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("DOWNLOAD", style = MaterialTheme.typography.caption)
        Text(
            text = value,
            fontSize = 45.sp,
            color = Color.White,
            fontWeight = FontWeight.Bold
        )
        Text("mbps", style = MaterialTheme.typography.caption)
    }
}