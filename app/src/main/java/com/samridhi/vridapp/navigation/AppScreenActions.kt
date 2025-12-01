package com.samridhi.vridapp.navigation

sealed class HomeScreenActions{
    data class OpenBrowserScreen(
        val url: String
    ) : HomeScreenActions()
}
sealed class BrowserScreenScreenActions{
    data object OnBack : BrowserScreenScreenActions()
}