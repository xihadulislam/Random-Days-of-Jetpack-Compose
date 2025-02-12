package com.ziad.random_days_of_jetpack_compose.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColors(
    primary = Purple80,
    secondary = PurpleGrey80,
)

private val LightColorScheme = lightColors(
    primary = Purple40,
    secondary = PurpleGrey40,

    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

@Composable
fun RandomDaysofJetpackComposeTheme(
    content: @Composable () -> Unit
) {

    MaterialTheme(
        colors = DarkColorScheme,
        typography = Typography,
        content = content
    )
}