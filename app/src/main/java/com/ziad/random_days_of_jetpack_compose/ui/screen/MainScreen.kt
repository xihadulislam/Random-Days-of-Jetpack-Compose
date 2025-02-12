package com.ziad.random_days_of_jetpack_compose.ui.screen

import androidx.compose.animation.core.Animatable
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.ziad.random_days_of_jetpack_compose.ui.screen.components.AdditionalInfo
import com.ziad.random_days_of_jetpack_compose.ui.screen.components.Header
import com.ziad.random_days_of_jetpack_compose.ui.screen.components.NavigationView
import com.ziad.random_days_of_jetpack_compose.ui.screen.components.speedIndicator.SpeedIndicator
import com.ziad.random_days_of_jetpack_compose.ui.theme.DarkGradient
import com.ziad.random_days_of_jetpack_compose.ui.state.UiState
import com.ziad.random_days_of_jetpack_compose.utils.startAnimation
import com.ziad.random_days_of_jetpack_compose.utils.toUiState
import kotlinx.coroutines.launch
import kotlin.math.max


@Composable
fun MainScreen() {
    val coroutineScope = rememberCoroutineScope()
    val animation = remember { Animatable(0f) }
    val maxSpeed = remember { mutableStateOf(0f) }
    maxSpeed.value = max(maxSpeed.value, animation.value * 100f)

    MainContainer(animation.toUiState(maxSpeed.value)) {
        coroutineScope.launch {
            maxSpeed.value = 0f
            startAnimation(animation)
        }
    }
}

@Composable
fun MainContainer(uiState: UiState, onStartClicked: () -> Unit) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(DarkGradient),
        verticalArrangement = Arrangement.SpaceBetween,
    ) {
        Header()
        SpeedIndicator(state = uiState, onClick = onStartClicked)
        AdditionalInfo(uiState.ping, uiState.maxSpeed)
        NavigationView()
    }

}






