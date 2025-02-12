package com.ziad.random_days_of_jetpack_compose.ui.screen.components.speedIndicator

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.ziad.random_days_of_jetpack_compose.ui.state.UiState

@Composable
fun SpeedIndicator(state: UiState, onClick: () -> Unit) {
    Box(
        contentAlignment = Alignment.BottomCenter,
        modifier = Modifier
            .fillMaxWidth()
            .aspectRatio(1f)
    ) {
        CircularSpeedIndicator(state.arcValue, 240f)
        StartButton(!state.inProgress, onClick)
        SpeedValue(state.speed)
    }
}


