package com.astdev.mtn

import android.annotation.SuppressLint
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
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
fun HomeScreen(navController: NavHostController){

    //HomeScreenUI()

    ChangeStatusBarColor(color = jauneMTN)
    val nbrActivations = 15
    var phoneInput by remember { mutableStateOf("") }

    Surface(modifier = Modifier.fillMaxSize()) {
        Scaffold(
            topBar = {
                CenterAlignedTopAppBar(
                    title = {  },
                    actions = {
                        IconButton(onClick = {  }) {
                            Icon(Icons.Filled.Menu, contentDescription = "Menu",
                                tint = Color.Black,modifier = Modifier.size(32.dp))
                        }},
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = jauneMTN,
                        titleContentColor = Color.Black,
                    )
                )
            },
            containerColor = jauneMTN,
            content = {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(top = 105.dp, start = 30.dp, end = 30.dp)
                        .fillMaxSize()) {

                    Row (modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 20.dp)){
                        Text(text = "Y'ello",
                            style = TextStyle(
                                fontWeight = FontWeight(800),
                                fontSize = 40.sp)
                        )
                    }

                    Card (
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(78.dp),
                        colors = CardDefaults.cardColors(containerColor = Color.Black),
                        shape = RoundedCornerShape(20.dp)
                    ){
                        Row(modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 13.dp, start = 20.dp, end = 20.dp)){
                            Column (modifier = Modifier.weight(1f)){
                                Text(text = "Aujourd'hui",
                                    style = TextStyle(
                                        fontWeight = FontWeight(600),
                                        color = Color.White
                                    )
                                )

                                Text(text = "$nbrActivations activations",
                                    style = TextStyle(
                                        fontWeight = FontWeight(600),
                                        color = jauneMTN,
                                        fontSize = 20.sp
                                    )
                                )
                            }

                            Column( modifier = Modifier.align(Alignment.CenterVertically)){
                                Button(
                                    onClick = { navController.navigate("Statistiques")},
                                    shape = RoundedCornerShape(20.dp),
                                    colors = ButtonDefaults.buttonColors(blanc),
                                    modifier = Modifier
                                        .width(103.dp)
                                        .height(40.dp),
                                    elevation = ButtonDefaults.buttonElevation(defaultElevation = 4.dp)
                                ) {
                                    Text(
                                        text = "Détails",
                                        style = TextStyle(
                                            fontSize = 16.sp,
                                            fontWeight = FontWeight(600),
                                            color = Color.Black
                                        )
                                    )

                                }
                            }
                        }
                    }

                    Row (modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 80.dp, bottom = 20.dp)
                    ){
                        Text(text = "Numéro du client",
                            style = TextStyle(
                                fontWeight = FontWeight(600),
                                fontSize = 20.sp)
                        )
                    }

                    OutlinedTextField(
                        placeholder = { Text(text = "05xxxxxxxx")},
                        value = phoneInput,
                        singleLine = true,
                        shape = RoundedCornerShape(20.dp),
                        onValueChange = { if (it.length<=10) phoneInput = it },
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = noir,
                            focusedLabelColor = noir,
                            unfocusedBorderColor = noir,
                            cursorColor = noir,
                        ),
                        keyboardOptions = KeyboardOptions.Default.copy(
                            keyboardType = KeyboardType.Phone,
                            imeAction = ImeAction.Done
                        ),
                        modifier = Modifier
                            .width(349.dp)
                            .height(69.dp)
                    )

                    Spacer(modifier = Modifier.padding(15.dp))

                    Button(
                        onClick = { },
                        shape = RoundedCornerShape(20.dp),
                        colors = ButtonDefaults.buttonColors(noir),
                        modifier = Modifier
                            .width(349.dp)
                            .height(69.dp),
                        elevation = ButtonDefaults.buttonElevation(defaultElevation = 4.dp)
                    ) {
                        Text(
                            text = "Valider",
                            style = TextStyle(
                                fontSize = 18.sp,
                                fontWeight = FontWeight(800),
                                color = Color.White
                            )
                        )
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
fun HomeScreenUI(){

    ChangeStatusBarColor(color = jauneMTN)
    val nbrActivations = 15
    var phoneInput by remember { mutableStateOf("") }

    Surface(modifier = Modifier.fillMaxSize()) {
        Scaffold(
            topBar = {
                CenterAlignedTopAppBar(
                    title = {  },
                    actions = {
                        IconButton(onClick = {  }) {
                            Icon(Icons.Filled.Menu, contentDescription = "Menu",
                                tint = Color.Black,modifier = Modifier.size(32.dp))
                        }},
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = jauneMTN,
                        titleContentColor = Color.Black,
                    )
                )
            },
            containerColor = jauneMTN,
            content = {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(top = 105.dp, start = 30.dp, end = 30.dp)
                        .fillMaxSize()) {

                    Row (modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 20.dp)){
                        Text(text = "Y'ello",
                            style = TextStyle(
                                fontWeight = FontWeight(800),
                                fontSize = 40.sp)
                        )
                    }

                    Card (
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(78.dp),
                        colors = CardDefaults.cardColors(containerColor = Color.Black),
                        shape = RoundedCornerShape(20.dp)
                    ){
                        Row(modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 13.dp, start = 20.dp, end = 20.dp)){
                            Column (modifier = Modifier.weight(1f)){
                                Text(text = "Aujourd'hui",
                                    style = TextStyle(
                                        fontWeight = FontWeight(600),
                                        color = Color.White
                                    )
                                )

                                Text(text = "$nbrActivations activations",
                                    style = TextStyle(
                                        fontWeight = FontWeight(600),
                                        color = jauneMTN,
                                        fontSize = 20.sp
                                    )
                                )
                            }

                            Column( modifier = Modifier.align(Alignment.CenterVertically)){
                                Button(
                                    onClick = { },
                                    shape = RoundedCornerShape(20.dp),
                                    colors = ButtonDefaults.buttonColors(blanc),
                                    modifier = Modifier
                                        .width(103.dp)
                                        .height(40.dp),
                                    elevation = ButtonDefaults.buttonElevation(defaultElevation = 4.dp)
                                ) {
                                    Text(
                                        text = "Détails",
                                        style = TextStyle(
                                            fontSize = 16.sp,
                                            fontWeight = FontWeight(600),
                                            color = Color.Black
                                        )
                                    )

                                }
                            }
                        }
                    }

                    Row (modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 80.dp, bottom = 20.dp)
                    ){
                        Text(text = "Numéro du client",
                            style = TextStyle(
                                fontWeight = FontWeight(600),
                                fontSize = 20.sp)
                        )
                    }

                    OutlinedTextField(
                        placeholder = { Text(text = "05xxxxxxxx")},
                        value = phoneInput,
                        singleLine = true,
                        shape = RoundedCornerShape(20.dp),
                        onValueChange = { phoneInput = it },
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = noir,
                            focusedLabelColor = noir,
                            unfocusedBorderColor = noir,
                            cursorColor = noir,
                        ),
                        keyboardOptions = KeyboardOptions.Default.copy(
                            keyboardType = KeyboardType.Phone,
                            imeAction = ImeAction.Done
                        ),
                        modifier = Modifier
                            .width(349.dp)
                            .height(69.dp)
                    )

                    Spacer(modifier = Modifier.padding(15.dp))

                    Button(
                        onClick = { },
                        shape = RoundedCornerShape(20.dp),
                        colors = ButtonDefaults.buttonColors(noir),
                        modifier = Modifier
                            .width(349.dp)
                            .height(69.dp),
                        elevation = ButtonDefaults.buttonElevation(defaultElevation = 4.dp)
                    ) {
                        Text(
                            text = "Valider",
                            style = TextStyle(
                                fontSize = 18.sp,
                                fontWeight = FontWeight(800),
                                color = Color.White
                            )
                        )
                    }

                }
            }
        )
    }
}