package com.astdev.mtn

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.astdev.mtn.ui.theme.jauneMTN

@Composable
@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
fun GsmIdInfo(navController: NavHostController){

    ChangeStatusBarColor(color = jauneMTN)

    Surface(modifier = Modifier.fillMaxSize()) {
        Scaffold(
            topBar = {
                CenterAlignedTopAppBar(
                    title = { },
                    navigationIcon = {
                        IconButton(onClick = { navController.popBackStack()}) {
                            Icon(
                                painter = painterResource(id = R.drawable.arrow_circle_left_2),
                                contentDescription = null, modifier = Modifier.size(45.dp)
                            )

                        }
                    },
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = jauneMTN,
                        titleContentColor = Color.Black,
                    ),
                )
            },
            containerColor = jauneMTN,
            content = {
                Box (modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center)
                {
                    LazyVerticalStaggeredGrid(
                        columns = StaggeredGridCells.Fixed(2),
                        contentPadding = PaddingValues(15.dp),
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                        verticalItemSpacing = 16.dp
                    ){

                        item {
                            Card (
                                modifier = Modifier
                                    .width(180.dp)
                                    .height(150.dp).clickable { navController.navigate("NumeroClient") },
                                colors = CardDefaults.cardColors(containerColor = Color.Black),
                                shape = RoundedCornerShape(20.dp)
                            ){
                                Row(modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(start = 10.dp, top = 20.dp, end = 10.dp, bottom = 20.dp)){
                                    Column (verticalArrangement = Arrangement.Center,
                                        horizontalAlignment = Alignment.CenterHorizontally,
                                        modifier = Modifier.weight(1f)){

                                        Icon(painter = painterResource(id = R.drawable.phone),
                                            contentDescription = "Phone icon",
                                            modifier = Modifier.size(40.dp),
                                            tint = Color.White)

                                        Text(text = "Numéro de téléphone",
                                            style = TextStyle(
                                                fontWeight = FontWeight(800),
                                                color = Color.White,
                                                fontSize = 20.sp,
                                                textAlign = TextAlign.Center
                                            )
                                        )
                                    }
                                }
                            }
                        }

                        item {
                            Card (
                                modifier = Modifier
                                    .width(180.dp)
                                    .height(150.dp).clickable { /*navController.navigate("Accueil")*/ },
                                colors = CardDefaults.cardColors(containerColor = Color.Black),
                                shape = RoundedCornerShape(20.dp)
                            ){
                                Row(modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(start = 10.dp, top = 20.dp, end = 10.dp, bottom = 20.dp)){
                                    Column (verticalArrangement = Arrangement.Center,
                                        horizontalAlignment = Alignment.CenterHorizontally,
                                        modifier = Modifier.weight(1f)){

                                        Icon(painter = painterResource(id = R.drawable.identificationcard),
                                            contentDescription = "Phone icon",
                                            modifier = Modifier.size(40.dp),
                                            tint = Color.White)

                                        Text(text = "Numéro de la pièce",
                                            style = TextStyle(
                                                fontWeight = FontWeight(800),
                                                color = Color.White,
                                                fontSize = 20.sp,
                                                textAlign = TextAlign.Center
                                            )
                                        )
                                    }
                                }
                            }
                        }
                    }
                }


            }
        )
    }
}

@Preview(showSystemUi = true)
@Composable
@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
fun GsmIdInfoUI(){

    ChangeStatusBarColor(color = jauneMTN)

    Surface(modifier = Modifier.fillMaxSize()) {
        Scaffold(
            topBar = {
                CenterAlignedTopAppBar(
                    title = { },
                    navigationIcon = {
                        IconButton(onClick = { }) {
                            Icon(
                                painter = painterResource(id = R.drawable.arrow_circle_left_2),
                                contentDescription = null, modifier = Modifier.size(45.dp)
                            )

                        }
                    },
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = jauneMTN,
                        titleContentColor = Color.Black,
                    ),
                )
            },
            containerColor = jauneMTN,
            content = {
                Box (modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center)
                {
                    LazyVerticalStaggeredGrid(
                        columns = StaggeredGridCells.Fixed(2),
                        contentPadding = PaddingValues(15.dp),
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                        verticalItemSpacing = 16.dp
                    ){

                        item {
                            Card (
                                modifier = Modifier
                                    .width(180.dp)
                                    .height(150.dp),
                                colors = CardDefaults.cardColors(containerColor = Color.Black),
                                shape = RoundedCornerShape(20.dp)
                            ){
                                Row(modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(start = 10.dp, top = 20.dp, end = 10.dp, bottom = 20.dp)){
                                    Column (verticalArrangement = Arrangement.Center,
                                        horizontalAlignment = Alignment.CenterHorizontally,
                                        modifier = Modifier.weight(1f)){

                                        Icon(painter = painterResource(id = R.drawable.phone),
                                            contentDescription = "Phone icon",
                                            modifier = Modifier.size(40.dp),
                                            tint = Color.White)

                                        Text(text = "Numéro de téléphone",
                                            style = TextStyle(
                                                fontWeight = FontWeight(800),
                                                color = Color.White,
                                                fontSize = 25.sp,
                                                textAlign = TextAlign.Center
                                            )
                                        )
                                    }
                                }
                            }
                        }

                        item {
                            Card (
                                modifier = Modifier
                                    .width(180.dp)
                                    .height(150.dp),
                                colors = CardDefaults.cardColors(containerColor = Color.Black),
                                shape = RoundedCornerShape(20.dp)
                            ){
                                Row(modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(start = 10.dp, top = 20.dp, end = 10.dp, bottom = 20.dp)){
                                    Column (verticalArrangement = Arrangement.Center,
                                        horizontalAlignment = Alignment.CenterHorizontally,
                                        modifier = Modifier.weight(1f)){

                                        Icon(painter = painterResource(id = R.drawable.identificationcard),
                                            contentDescription = "Phone icon",
                                            modifier = Modifier.size(40.dp),
                                            tint = Color.White)

                                        Text(text = "Numéro de la pièce",
                                            style = TextStyle(
                                                fontWeight = FontWeight(800),
                                                color = Color.White,
                                                fontSize = 25.sp,
                                                textAlign = TextAlign.Center
                                            )
                                        )
                                    }
                                }
                            }
                        }
                    }
                }


            }
        )
    }
}