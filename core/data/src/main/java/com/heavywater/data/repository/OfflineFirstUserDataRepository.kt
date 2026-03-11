package com.heavywater.data.repository

import com.heavywater.cityweather.core.model.DarkThemeConfig
import com.heavywater.cityweather.core.model.UserData
import com.heavywater.core.datastore.CityWeatherPreferencesDataSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class OfflineFirstUserDataRepository @Inject constructor(
    private val dataSource: CityWeatherPreferencesDataSource,
) : UserDataRepository {

    override val userData: Flow<UserData> = dataSource.userData

    override suspend fun setDarkThemeConfig(darkThemeConfig: DarkThemeConfig) =
        dataSource.setDarkThemeConfig(darkThemeConfig)

    override suspend fun setDynamicColorPreference(useDynamicColor: Boolean) =
        dataSource.setDynamicColorPreference(useDynamicColor)
}