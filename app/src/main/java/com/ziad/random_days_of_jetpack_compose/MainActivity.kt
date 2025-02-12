package com.ziad.random_days_of_jetpack_compose

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ziad.random_days_of_jetpack_compose.ui.screen.MainScreen
import com.ziad.random_days_of_jetpack_compose.ui.theme.RandomDaysofJetpackComposeTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            RandomDaysofJetpackComposeTheme {
                Surface(
                    modifier = Modifier
                        .fillMaxSize(),
                ) {
                    MainScreen()
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    RandomDaysofJetpackComposeTheme {
        Surface() {
            MainScreen()
        }

    }
}