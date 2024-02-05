package com.astdev.mtn


import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.graphics.Color
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun ChangeStatusBarColor(color: Color){
    //source :https://google.github.io/accompanist/systemuicontroller/
    //pour personnaliser la couleur du status bar
    val systemUiController = rememberSystemUiController()
    val useDarkIcons = !isSystemInDarkTheme()
    DisposableEffect(systemUiController, useDarkIcons) {
        // Update all of the system bar colors to be transparent, and use
        // dark icons if we're in light theme
        systemUiController.setSystemBarsColor(
            color = color,
            darkIcons = useDarkIcons
        )
        // setStatusBarColor() and setNavigationBarColor() also exist
        onDispose {}
    }
}