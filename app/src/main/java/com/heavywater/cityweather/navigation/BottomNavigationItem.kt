package com.heavywater.cityweather.navigation

import androidx.annotation.StringRes
import androidx.compose.ui.graphics.vector.ImageVector
import com.heavywater.cityweather.feature.favourites.api.FavouritesNavKey
import com.heavywater.cityweather.feature.currentweather.api.CurrentWeatherNavKey


class BottomNavigationItem {
    data class BottomNavigationItem(
        @StringRes val labelTextId: Int? = null,
        val selectedIcon: ImageVector? = null,
        val unselectedIcon: ImageVector? = null
    )

    val CURRENT_WEATHER = BottomNavigationItem(
        R.string.home,
        Icons.Filled.Home,
        Icons.Outlined.Home

    )

    val FAVOURITES = BottomNavigationItem(
        R.string.bookmarks,
        Icons.Filled.Bookmark,
        Icons.Outlined.Bookmark
    )

    val BOTTOM_NAV_ITEMS = mapOf(
        CurrentWeatherNavKey to CURRENT_WEATHER,
        FavouritesNavKey to FAVOURITES
    )

}