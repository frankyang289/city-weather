package com.heavywater.cityweather.feature.favourites.impl

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun FavouritesScreen(
    modifier: Modifier = Modifier
) {
    Scaffold(
        modifier = modifier,
        topBar = {
            FavouritesScreenTopBar()
        }
    ) { paddingValues ->
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun FavouritesScreenTopBar(
    modifier: Modifier = Modifier
) {
    TopAppBar(
        title = { Text("Favourites") },
        modifier = modifier,
    )
}