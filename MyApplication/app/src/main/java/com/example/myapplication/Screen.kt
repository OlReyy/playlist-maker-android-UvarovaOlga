package com.example.myapplication

sealed class Screen(val route: String) {
    object Main : Screen("main_screen")
    object Search : Screen("search_screen")
    object Settings : Screen("settings_screen")}
