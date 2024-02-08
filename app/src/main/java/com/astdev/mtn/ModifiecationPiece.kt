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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import com.astdev.mtn.ui.theme.jauneMTN
import com.astdev.mtn.ui.theme.noir

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
fun ModificationPiece(navController: NavHostController){
    //DepotScreenUI()

    ChangeStatusBarColor(color = jauneMTN)

    val phoneInput by remember { mutableStateOf("") }

    var amountInput by remember { mutableStateOf("") }

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
                        .padding(top = 20.dp, bottom = 10.dp)
                    ){
                        Text(text = "Pièce d’identification",
                            style = TextStyle(
                                fontWeight = FontWeight(600),
                                fontSize = 20.sp)
                        )
                    }

                    OutlinedTextField(
                        placeholder = { Text(text = "Entrez le type de pièce") },
                        value = amountInput,
                        singleLine = true,
                        shape = RoundedCornerShape(20.dp),
                        onValueChange = { amountInput = it },
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
                        onClick = { navController.navigate("InfoClient") },
                        shape = RoundedCornerShape(20.dp),
                        colors = ButtonDefaults.buttonColors(noir),
                        modifier = Modifier
                            .width(349.dp)
                            .height(69.dp),
                        elevation = ButtonDefaults.buttonElevation(defaultElevation = 4.dp)
                    ) {
                        Text(
                            text = "Enregistrer",
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
fun ModificationPieceUI(){

    ChangeStatusBarColor(color = jauneMTN)

    var amountInput by remember { mutableStateOf("") }


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
                        .padding(top = 20.dp, bottom = 10.dp)
                    ){
                        Text(text = "Pièce d’identification",
                            style = TextStyle(
                                fontWeight = FontWeight(600),
                                fontSize = 20.sp)
                        )
                    }

                    OutlinedTextField(
                        placeholder = { Text(text = "Entrez le type de pièce") },
                        value = amountInput,
                        singleLine = true,
                        shape = RoundedCornerShape(20.dp),
                        onValueChange = { amountInput = it },
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
                            text = "Enregistrer",
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