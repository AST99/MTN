package com.astdev.mtn

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.CheckCircle
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
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
import com.astdev.mtn.ui.theme.succesColor

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
fun InfoClient(navController: NavHostController){
    //SuccesUI()

    ChangeStatusBarColor(color = jauneMTN)
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
                    modifier = Modifier
                        .padding(top = 60.dp, start = 20.dp, end = 20.dp)
                        .fillMaxSize()) {

                    Text(text = "Informations",
                        style = TextStyle(
                            fontWeight = FontWeight(600),
                            fontSize = 27.sp,
                            color = Color.Black
                        )
                    )

                    Text(text = "05xxxxxxxx",
                        style = TextStyle(
                            fontWeight = FontWeight(400),
                            fontSize = 20.sp)
                    )


                    Spacer(modifier = Modifier.padding(20.dp))

                    Row {
                        Column (modifier = Modifier.weight(1f)){
                            Text(text = "Pièce d’identification",
                                style = TextStyle(
                                    fontWeight = FontWeight(600),
                                    fontSize = 21.sp),
                            )

                            Text(text = "Carte nationale d’identité",
                                style = TextStyle(
                                    fontWeight = FontWeight(400),
                                    fontSize = 18.sp),
                            )
                        }

                        Icon(painter = painterResource(id = R.drawable.pencilsimple),
                            tint = Color.Black,
                            modifier = Modifier.size(32.dp).clickable { navController.navigate("ModificationPiece") },
                            contentDescription = null)
                    }

                    Spacer(modifier = Modifier.padding(10.dp))

                    Row {
                        Column (modifier = Modifier.weight(1f)){
                            Text(text = "Numéro de la pièce",
                                style = TextStyle(
                                    fontWeight = FontWeight(600),
                                    fontSize = 21.sp),
                            )

                            Text(text = "C 01 XXXXXXXXX",
                                style = TextStyle(
                                    fontWeight = FontWeight(400),
                                    fontSize = 18.sp),
                            )
                        }

                        Icon(painter = painterResource(id = R.drawable.pencilsimple),
                            tint = Color.Black,
                            modifier = Modifier.size(32.dp).clickable { navController.navigate("ModificationNumeroPieces") },
                            contentDescription = null)
                    }
                }
            }
        )
    }
}

@Composable
@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Preview(showSystemUi = true)
fun InfoClientUI(){
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
                    modifier = Modifier
                        .padding(top = 60.dp, start = 20.dp, end = 20.dp)
                        .fillMaxSize()) {

                    Text(text = "Informations",
                        style = TextStyle(
                            fontWeight = FontWeight(600),
                            fontSize = 27.sp,
                            color = Color.Black
                        )
                    )

                    Text(text = "05xxxxxxxx",
                        style = TextStyle(
                            fontWeight = FontWeight(400),
                            fontSize = 20.sp)
                    )


                    Spacer(modifier = Modifier.padding(20.dp))

                    Row {
                        Column (modifier = Modifier.weight(1f)){
                            Text(text = "Pièce d’identification",
                                style = TextStyle(
                                    fontWeight = FontWeight(600),
                                    fontSize = 21.sp),
                            )

                            Text(text = "Carte nationale d’identité",
                                style = TextStyle(
                                    fontWeight = FontWeight(400),
                                    fontSize = 18.sp),
                            )
                        }

                        Icon(painter = painterResource(id = R.drawable.pencilsimple),
                            tint = Color.Black,
                            modifier = Modifier.size(32.dp),
                            contentDescription = null)
                    }

                    Spacer(modifier = Modifier.padding(10.dp))

                    Row {
                        Column (modifier = Modifier.weight(1f)){
                            Text(text = "Numéro de la pièce",
                                style = TextStyle(
                                    fontWeight = FontWeight(600),
                                    fontSize = 21.sp),
                            )

                            Text(text = "C 01 XXXXXXXXX",
                                style = TextStyle(
                                    fontWeight = FontWeight(400),
                                    fontSize = 18.sp),
                            )
                        }

                        Icon(painter = painterResource(id = R.drawable.pencilsimple),
                            tint = Color.Black,
                            modifier = Modifier.size(32.dp),
                            contentDescription = null)
                    }
                }
            }
        )
    }
}