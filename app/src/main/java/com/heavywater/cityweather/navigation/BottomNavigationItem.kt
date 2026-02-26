package com.heavywater.cityweather.navigation

import androidx.annotation.StringRes
import androidx.compose.ui.graphics.vector.ImageVector
import com.heavywater.cityweather.feature.currentweather.api.CurrentWeatherNavKey
import com.heavywater.cityweather.feature.favourites.api.FavouritesNavKey
import com.heavywater.core.designsystem.icon.AppIcons
import com.heavywater.cityweather.feature.currentweather.api.R as currentWeatherR
import com.heavywater.cityweather.feature.favourites.api.R as favouritesR


class BottomNavigationItem {
    data class BottomNavigationItem(
        @StringRes val labelTextId: Int? = null,
        val selectedIcon: ImageVector? = null,
        val unselectedIcon: ImageVector? = null
    )

    val CURRENT_WEATHER = BottomNavigationItem(
        currentWeatherR.string.feature_currentweather_api_title,
        AppIcons.currentWeather,
        AppIcons.currentWeatherBorder

    )

    val FAVOURITES = BottomNavigationItem(
        favouritesR.string.feature_favourites_api_title,
        AppIcons.favourites,
        AppIcons.favouritesBorder
    )

    val BOTTOM_NAV_ITEMS = mapOf(
        CurrentWeatherNavKey to CURRENT_WEATHER,
        FavouritesNavKey to FAVOURITES
    )
}