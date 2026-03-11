package com.heavywater.cityweather.feature.currentweather.impl

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.heavywater.cityweather.feature.settings.impl.SettingsDialog
import com.heavywater.core.designsystem.icon.AppIcons

@Composable
fun CurrentWeatherScreen(
    modifier: Modifier = Modifier
) {
    var showSettingsDialog by rememberSaveable { mutableStateOf(false) }

    if (showSettingsDialog) {
        SettingsDialog(
            onDismiss = { showSettingsDialog = false },
        )
    }

    Scaffold(
        modifier = modifier,
        topBar = {
            CurrentWeatherTopBar(
                onSettingsClick = { showSettingsDialog = true },
            )
        }
    ) {
        paddingValues ->
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun CurrentWeatherTopBar(
    onSettingsClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    TopAppBar(
        title = { Text("Home") },
        actions = {
            IconButton(onClick = onSettingsClick) {
                Icon(
                    imageVector = AppIcons.settings,
                    contentDescription = "Settings",
                )
            }
        },
        modifier = modifier,
    )
}