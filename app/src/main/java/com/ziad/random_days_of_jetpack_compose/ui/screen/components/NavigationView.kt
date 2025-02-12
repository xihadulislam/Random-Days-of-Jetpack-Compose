package com.ziad.random_days_of_jetpack_compose.ui.screen.components

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.ziad.random_days_of_jetpack_compose.R
import com.ziad.random_days_of_jetpack_compose.ui.theme.DarkColor
import com.ziad.random_days_of_jetpack_compose.ui.theme.Pink80

@Composable
fun NavigationView() {
    val items = listOf(
        R.drawable.speed,
        R.drawable.wifi,
        R.drawable.person,
        R.drawable.settings
    )
    val selectedItem = 0
    BottomNavigation(backgroundColor = DarkColor) {
        items.mapIndexed { index, i ->
            BottomNavigationItem(selected = index == selectedItem,
                selectedContentColor = Pink80,
                unselectedContentColor = MaterialTheme.colors.onSurface,
                icon = {
                    Icon(painterResource(id = i), null)
                }, onClick = { /*TODO*/ })
        }
    }

}