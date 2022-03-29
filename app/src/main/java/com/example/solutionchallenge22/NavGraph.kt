package com.example.solutionchallenge22

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun SetupNavGraph(
    navController: NavHostController
){
    NavHost(
        navController = navController,
        startDestination = Screen.Login.route
    ){
        composable(
            route = Screen.Login.route
        ){
            LoginScreen(navController = navController)
        }
        composable(
            route = Screen.Home.route
        ){
            HomeScreen(navController = navController)
        }
        composable(
            route = Screen.SignUp.route
        ){
            SignUpScreen(navController = navController)
        }
        composable(
            route = Screen.Supply.route
        ){
            SupplyScreen(navController = navController)
        }
        composable(
            route = Screen.Demand.route
        ){
            DemandScreen(navController = navController)
        }
        composable(
            route = Screen.Order.route
        ){
            OrderScreen(navController = navController)
        }
        composable(
            route = Screen.Profile.route
        ){
            ProfileScreen(navController = navController)
        }
    }
}