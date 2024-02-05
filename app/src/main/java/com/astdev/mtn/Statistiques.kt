package com.astdev.mtn

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
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
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.astdev.mtn.ui.theme.blanc
import com.astdev.mtn.ui.theme.jauneMTN
import com.astdev.mtn.ui.theme.noir

@Composable
fun StatisticScreen(navController: NavHostController){
    StatisticScreenUI()
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showSystemUi = true)
@Composable
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
fun StatisticScreenUI(){

    ChangeStatusBarColor(color = jauneMTN)
    val nbrActivations = 15
    var phoneInput by remember { mutableStateOf("") }

    var btnJourIsClicked by remember { mutableStateOf(true) }
    var btnSemaineIsClicked by remember { mutableStateOf(false) }
    var btnMoisIsClicked by remember { mutableStateOf(false) }

    Surface(modifier = Modifier.fillMaxSize()) {
        Scaffold(
            topBar = {
                CenterAlignedTopAppBar(
                    title = { },
                    navigationIcon = {
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(
                                painter = painterResource(id = R.drawable.arrowcircleleft),
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
                        Text(text = "Statistique d'activation",
                            style = TextStyle(
                                fontWeight = FontWeight(800),
                                fontSize = 27.sp)
                        )
                    }

                    Row (
                        horizontalArrangement = Arrangement.spacedBy(5.dp, Alignment.CenterHorizontally),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 5.dp)
                    ){
                        BtnPeriode(modifier = Modifier.width(110.dp).height(39.dp).weight(1f),
                            txt = "Jour",
                            onClick = {
                                btnJourIsClicked = !btnJourIsClicked
                                btnMoisIsClicked = false
                                btnSemaineIsClicked = false },
                            isClicked = btnJourIsClicked)

                        BtnPeriode(modifier = Modifier.width(110.dp).height(39.dp).weight(1f),
                            txt = "Semaine",
                            onClick = {
                                btnSemaineIsClicked = !btnSemaineIsClicked
                                btnJourIsClicked = false
                                btnMoisIsClicked = false
                            },
                            isClicked = btnSemaineIsClicked)

                        BtnPeriode(modifier = Modifier.width(110.dp).height(39.dp).weight(1f),
                            txt = "Mois",
                            onClick = {
                                btnMoisIsClicked = !btnMoisIsClicked
                                btnJourIsClicked = false
                                btnSemaineIsClicked = false
                            },
                            isClicked = btnMoisIsClicked)
                    }
                }
            }
        )
    }
}