package com.heavywater.cityweather.navigation

import androidx.annotation.StringRes
import androidx.compose.ui.graphics.vector.ImageVector

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
        BookmarksNavKey to FAVOURITES
    )

}