package com.example.wazitoecommerce.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.ui.theme.Cars.CarsScreen
import com.example.wazitoecommerce.ui.theme.Drip.DripScreen
import com.example.wazitoecommerce.ui.theme.screens.Nature.NatureScreen
import com.example.wazitoecommerce.ui.theme.screens.home.HomeScreen
import com.example.wazitoecommerce.ui.theme.screens.login.LoginScreen
import com.example.wazitoecommerce.ui.theme.screens.products.AddProductsScreen
import com.example.wazitoecommerce.ui.theme.screens.products.ViewItemsScreen
import com.example.wazitoecommerce.ui.theme.screens.products.ViewItemsScreen
import com.example.wazitoecommerce.ui.theme.screens.signup.SignupScreen
import com.example.wazitoecommerce.ui.theme.screens.splash.SplashScreen
import com.example.wazitoecommerce.ui.theme.wallpapers.WallpapersScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController:NavHostController = rememberNavController(),
    startDestination:String = SPLASH_URL
){
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier){
        composable(LOGIN_URL){
            LoginScreen(navController = navController)
        }
        composable(SIGNUP_URL){
            SignupScreen(navController = navController)
        }
        composable(HOME_URL){
            HomeScreen(navController = navController)
        }
        composable(ADD_PRODUCTS_URL){
            AddProductsScreen(navController = navController)
        }
        composable(VIEW_ITEMS_URL){
            ViewItemsScreen(navController = navController)
        }

        composable(SPLASH_URL) {
            SplashScreen(navController = navController)
        }

        composable(WALLPAPERS_URL) {
            WallpapersScreen(navController = navController)
        }

        composable(CARS_URL) {
            CarsScreen(navController = navController)
        }

        composable(DRIP_URL) {
            DripScreen(navController = navController)
        }

        composable(NATURE_URL) {
            NatureScreen(navController = navController)
        }


    }
}