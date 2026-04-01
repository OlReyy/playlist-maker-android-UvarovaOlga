package com.example.myapplication

import androidx.compose.runtime.Composable
import androidx.compose.NavHost
import androidx.compose.composable
import androidx.compose.rememberNavController
import com.example.myapplication.SettingsScreen

@Composable
fun PlaylistHost() {
    val navController = rememberNavController()
    val navigateBack: () -> Unit = { navController.popBackStack() }
    val navigateToSearch = { navController.navigate(Screenfd.Search.route) }
    val navigateToSettings = { navController.navigate(Screenfd.Settings.route) }
    val navigateToPlaylists = { /* пока ничего */ }
    val navigateToFavorites = { /* пока ничего */ }


    NavHost(
        navController = navController,
        startDestination = Screenfd.Main.route
    ) {
        composable(Screenfd.Main.route) {
            MainScreen(
                onSearchClick = navigateToSearch,
                onPlaylistsClick = navigateToPlaylists,
                onFavoritesClick = navigateToFavorites,
                onSettingsClick = navigateToSettings
            )
        }

        composable(Screenfd.Search.route) {
            SearchScreen(
                onBackClick = navigateBack
            )
        }

        composable(Screenfd.Settings.route) {
            SettingsScreen(
                onBackClick = navigateBack
            )
        }
    }
}