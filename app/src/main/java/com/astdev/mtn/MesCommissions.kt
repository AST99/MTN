package com.astdev.mtn

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.astdev.mtn.ui.theme.jauneMTN

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
fun MesCommissions(navController: NavHostController){

    ChangeStatusBarColor(color = jauneMTN)
    
    val solde = 0

    Surface(modifier = Modifier.fillMaxSize()) {
        Scaffold(
            topBar = {
                CenterAlignedTopAppBar(
                    title = { },
                    navigationIcon = {
                        IconButton(onClick = { navController.popBackStack() }) {
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
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(top = 70.dp, start = 20.dp, end = 20.dp)
                        .fillMaxSize()) {

                    Row (modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 20.dp)){
                        Text(text = "Mes commissions",
                            style = TextStyle(
                                fontWeight = FontWeight(800),
                                fontSize = 27.sp)
                        )
                    }

                    Row (modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 30.dp),
                        horizontalArrangement = Arrangement.Center){

                        Column {
                            Row {
                                Icon(painter = painterResource(id = R.drawable.coins),
                                    contentDescription = "coins", modifier = Modifier
                                        .size(32.dp)
                                        .padding(end = 6.dp))

                                Text(text = "Solde",
                                    style = TextStyle(
                                        fontWeight = FontWeight(400),
                                        fontSize = 23.sp)
                                )
                            }


                            Text(
                                text = "${solde} FCFA",
                                style = TextStyle(
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight(800),
                                    color = Color.Black
                                ),
                                modifier = Modifier
                                    .border(
                                        BorderStroke(3.dp, Color.Black),
                                        shape = RoundedCornerShape(20.dp)
                                    )
                                    .padding(
                                        start = 20.dp,
                                        top = 10.dp,
                                        end = 20.dp,
                                        bottom = 10.dp
                                    ),
                            )
                        }
                    }
                }
            }
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showSystemUi = true)
@Composable
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
fun MesCommissionsUI(){

    ChangeStatusBarColor(color = jauneMTN)
    
    var solde = 0

    Surface(modifier = Modifier.fillMaxSize()) {
        Scaffold(
            topBar = {
                CenterAlignedTopAppBar(
                    title = { },
                    navigationIcon = {
                        IconButton(onClick = { /*TODO*/ }) {
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
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(top = 70.dp, start = 20.dp, end = 20.dp)
                        .fillMaxSize()) {

                    Row (modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 20.dp)){
                        Text(text = "Mes commissions",
                            style = TextStyle(
                                fontWeight = FontWeight(800),
                                fontSize = 27.sp)
                        )
                    }

                    Row (modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 50.dp),
                        horizontalArrangement = Arrangement.Center){

                        Column {
                            Row {
                                Icon(painter = painterResource(id = R.drawable.coins),
                                    contentDescription = "coins", modifier = Modifier
                                        .size(32.dp)
                                        .padding(end = 6.dp))

                                Text(text = "Solde",
                                    style = TextStyle(
                                        fontWeight = FontWeight(400),
                                        fontSize = 23.sp)
                                )
                            }

                            Spacer(modifier = Modifier.padding(top = 3.dp))
                            
                            Text(
                                text = "${solde} FCFA",
                                style = TextStyle(
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight(600),
                                    color = Color(0xFF4B4B4B)
                                ),
                                modifier = Modifier
                                    .border(
                                        BorderStroke(3.dp, Color.Black),
                                        shape = RoundedCornerShape(20.dp)
                                    )
                                    .padding(
                                        start = 20.dp,
                                        top = 10.dp,
                                        end = 20.dp,
                                        bottom = 10.dp
                                    ),
                            )
                        }
                    }
                }
            }
        )
    }
}