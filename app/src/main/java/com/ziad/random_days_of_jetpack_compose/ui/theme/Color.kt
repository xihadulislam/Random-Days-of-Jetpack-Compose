package com.ziad.random_days_of_jetpack_compose.ui.theme

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFF74075)

val Purple40 = Color(0xFFF74075)
val PurpleGrey40 = Color(0xFFEE5682)
val Pink40 = Color(0xFFF82C67)

val Green200 = Color(0xFFAEFF82)
val Green300 = Color(0xFF9EDD7C)
val Green500 = Color(0xFF07A312)

val DarkColor = Color(0xFF101522)
val DarkColor2 = Color(0xFF202532)
val LightColor = Color(0xFF414D66)
val LightColor2 = Color(0xFF626F88)

val GreenGradient = Brush.linearGradient(
    colors = listOf(Purple40, PurpleGrey40),
    start = Offset(0f, 0f),
    end = Offset(Float.POSITIVE_INFINITY, 0f)
)

val DarkGradient = Brush.verticalGradient(
    colors = listOf(DarkColor2, DarkColor)
)