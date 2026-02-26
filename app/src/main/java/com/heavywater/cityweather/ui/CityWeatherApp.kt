package com.heavywater.cityweather.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.adaptive.ExperimentalMaterial3AdaptiveApi
import androidx.compose.material3.adaptive.WindowAdaptiveInfo
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.heavywater.cityweather.feature.currentweather.api.CurrentWeatherNavKey
import com.heavywater.cityweather.feature.favourites.api.FavouritesNavKey
import com.heavywater.cityweather.navigation.BOTTOM_NAV_ITEMS
import com.heavywater.core.designsystem.component.AppNavigationBar
import com.heavywater.core.designsystem.component.AppNavigationBarItem

@Composable
fun CityWeatherApp() {
    //TODO: add theming and state logic
    CityWeatherApp(modifier = Modifier)
}

@Composable
@OptIn(
    ExperimentalMaterial3Api::class,
    ExperimentalComposeUiApi::class,
    ExperimentalMaterial3AdaptiveApi::class,
)
internal fun CityWeatherApp(
    modifier: Modifier = Modifier,
    windowAdaptiveInfo: WindowAdaptiveInfo = currentWindowAdaptiveInfo(),
) {
    var selectedKey by remember { mutableStateOf(CurrentWeatherNavKey) }

    Scaffold(
        modifier = modifier,
        bottomBar = {
            AppNavigationBar {
                BOTTOM_NAV_ITEMS.forEach { (key, item) ->
                    AppNavigationBarItem(
                        selected = selectedKey == key,
                        onClick = { selectedKey = key as CurrentWeatherNavKey },
                        icon = {
                            item.unselectedIcon?.let {
                                Icon(imageVector = it, contentDescription = null)
                            }
                        },
                        selectedIcon = {
                            item.selectedIcon?.let {
                                Icon(imageVector = it, contentDescription = null)
                            }
                        },
                        label = item.labelTextId?.let {
                            { Text(stringResource(it)) }
                        }
                    )
                }
            }
        }
    ) { paddingValues ->
        // Your screen content based on selectedKey
        when (selectedKey) {
//            CurrentWeatherNavKey -> CurrentWeatherScreen(Modifier.padding(paddingValues))
//            FavouritesNavKey -> FavouritesScreen(Modifier.padding(paddingValues))
        }
    }
}