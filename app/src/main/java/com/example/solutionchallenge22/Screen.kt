package com.example.solutionchallenge22

sealed class Screen(val route: String) {
    object Login: Screen(route = "login_screen")
    object Home: Screen(route = "home_screen")
    object SignUp: Screen(route = "signup_screen")
    object Supply: Screen(route = "supply_screen")
    object Demand: Screen(route = "demand_screen")
    object Order: Screen(route = "order_page")
    object Profile: Screen(route = "profile_page")
}
