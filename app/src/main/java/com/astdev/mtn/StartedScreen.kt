package com.astdev.mtn

import android.content.Context
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.astdev.mtn.ui.theme.jauneMTN
import kotlinx.coroutines.delay

@Composable
fun StartedScreen(navController: NavHostController){

    ChangeStatusBarColor(color = jauneMTN)

    val alpha = remember {
        Animatable(0f)
    }

    LaunchedEffect(key1 = true){
        alpha.animateTo(1f, animationSpec = tween(1500))
        delay(800)
        navController.popBackStack()
        navController.navigate("Login")
    }

    Box (modifier = Modifier
        .fillMaxSize()
        .background(jauneMTN),
        contentAlignment = Alignment.Center){

        Image(modifier = Modifier
            .alpha(alpha.value)
            .width(200.dp)
            .height(200.dp),
            painter = painterResource(
                id = R.drawable.mtn_logo),
            contentDescription = "Logo MTN")
    }

}


@Preview(showSystemUi = true)
@Composable
fun StartedScreenUI(){
    val alpha = remember {
        Animatable(0f)
    }

    /*LaunchedEffect(key1 = true){
        alpha.animateTo(1f, animationSpec = tween(1500))
        delay(800)
        navController.popBackStack()
        navController.navigate("WelcomeScreen")
        CheckLocationPermission(mContext)
    }*/

    Box (modifier = Modifier
        .fillMaxSize()
        .background(jauneMTN),
        contentAlignment = Alignment.Center){

        Image(modifier = Modifier
            //.alpha(alpha.value)
            .width(200.dp)
            .height(200.dp),
            painter = painterResource(
                id = R.drawable.mtn_logo
            ),
            contentDescription = "App logo")
    }
}