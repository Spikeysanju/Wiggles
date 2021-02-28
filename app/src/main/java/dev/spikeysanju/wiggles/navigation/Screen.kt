package dev.spikeysanju.wiggles.navigation

import androidx.annotation.StringRes
import dev.spikeysanju.wiggles.R

sealed class Screen(val route: String, @StringRes val resourceId: Int) {
    object Home : Screen("home", R.string.text_home)
    object Details : Screen("details", R.string.text_details)
}