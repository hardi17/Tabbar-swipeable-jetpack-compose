package com.hardi.tabbarjetpackcompose.ui.utils

import android.accounts.Account
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import com.hardi.tabbarjetpackcompose.ui.screens.CartScreen
import com.hardi.tabbarjetpackcompose.ui.screens.HomeScreen
import com.hardi.tabbarjetpackcompose.ui.screens.ProfileScreen

data class TabItems(
    val title: String,
    val unSelectedIcon: ImageVector,
    val selectedIcon: ImageVector,
    val screen: @Composable () ->Unit
)

val tabItems = listOf(
    TabItems(
        title = "Home",
        unSelectedIcon = Icons.Outlined.Home,
        selectedIcon = Icons.Filled.Home,
        screen = { HomeScreen()}
    ),TabItems(
        title = "Cart",
        unSelectedIcon = Icons.Outlined.ShoppingCart,
        selectedIcon = Icons.Filled.ShoppingCart,
        screen = { CartScreen() }
    ),
    TabItems(
        title = "Account",
        unSelectedIcon = Icons.Outlined.AccountCircle,
        selectedIcon = Icons.Filled.AccountCircle,
        screen = { ProfileScreen() }
    ),
)