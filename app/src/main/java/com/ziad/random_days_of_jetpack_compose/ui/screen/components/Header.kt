package com.ziad.random_days_of_jetpack_compose.ui.screen.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Header() {

    Text(
        text = "SPEED TEST",
        modifier = Modifier.padding(top = 52.dp, bottom = 16.dp),
        color = Color.White,
        style = MaterialTheme.typography.h6
    )

}