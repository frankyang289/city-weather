pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "CityWeather"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
include(":app")
include(":core")
include(":core:common")
include(":core:data")
include(":core:database")
include(":core:domain")
include(":core:model")
include(":core:navigation")
include(":core:network")
include(":core:screenshot-testing")
include(":core:ui")
include(":feature")
include(":feature:addcity")
include(":feature:currentweather")
include(":feature:detailedview")
include(":feature:favourites")
include(":feature:addcity:api")
include(":feature:addcity:impl")
include(":feature:currentweather:api")
include(":feature:currentweather:impl")
include(":feature:detailedview:api")
include(":feature:detailedview:impl")
include(":feature:favourites:api")
include(":feature:favourites:impl")
include(":feature:settings")
include(":feature:settings:impl")
include(":core:designsystem")
include(":core:datastore")
