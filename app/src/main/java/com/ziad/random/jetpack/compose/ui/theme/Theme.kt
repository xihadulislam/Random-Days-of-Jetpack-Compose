package com.ziad.random.jetpack.compose.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable

const val DEFAULT_PADDING = 44

private val DarkColorPalette = darkColors(
    primary = Purple200,
    secondary = Pink,
    background = DarkPurple
)


@Composable
fun RandomJetpackComposeTheme(
    content: @Composable () -> Unit,
) {
    MaterialTheme(
        colors = DarkColorPalette,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}