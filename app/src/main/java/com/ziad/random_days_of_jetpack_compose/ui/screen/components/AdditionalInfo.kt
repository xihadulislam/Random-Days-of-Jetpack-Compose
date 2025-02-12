package com.ziad.random_days_of_jetpack_compose.ui.screen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun AdditionalInfo(ping: String, maxSpeed: String) {

    Row(
        Modifier
            .fillMaxWidth()
            .height(IntrinsicSize.Min)
    ) {

        InfoColumn(title = "PING", value = ping)
        VerticalDivider()
        InfoColumn(title = "MAX SPEED", value = maxSpeed)

    }


}

@Composable
fun VerticalDivider() {
    Box(
        modifier = Modifier
            .fillMaxHeight()
            .background(Color(0xFF414D66))
            .width(1.dp)
    )
}


@Composable
fun RowScope.InfoColumn(title: String, value: String) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.weight(1f)
    ) {
        Text(text = title)
        Text(
            text = value,
            style = MaterialTheme.typography.body2,
            modifier = Modifier.padding(vertical = 8.dp),
            color = Color.White
        )
    }
}