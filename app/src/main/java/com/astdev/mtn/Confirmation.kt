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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
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
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ConfirmationScreen(navController: NavHostController){
    ChangeStatusBarColor(color = jauneMTN)

    var validationInput1 by remember { mutableStateOf("") }
    var validationInput2 by remember { mutableStateOf("") }
    var validationInput3 by remember { mutableStateOf("") }
    var validationInput4 by remember { mutableStateOf("") }

    //ValidationUI()
    Surface(modifier = Modifier.fillMaxSize()) {
        Scaffold(
            topBar = {
                CenterAlignedTopAppBar(
                    title = { Image(modifier = Modifier
                        .width(49.dp)
                        .height(31.dp),
                        painter = painterResource(
                            id = R.drawable.mtn_logo),
                        contentDescription = "Logo MTN",
                    ) },
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
                        .padding(top = 108.dp, start = 30.dp, end = 30.dp)
                        .fillMaxSize()) {

                    Text(text = "Code de validation",
                        style = TextStyle(
                            fontWeight = FontWeight(800),
                            fontSize = 30.sp)
                    )

                    Row (horizontalArrangement = Arrangement.spacedBy(7.dp, Alignment.CenterHorizontally),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 60.dp, bottom = 25.dp, start = 40.dp, end = 40.dp)){


                        ValidationTextField(
                            value = validationInput1,
                            onValueChange = {if (it.length<= 1) validationInput1 = it},
                            modifier = Modifier.weight(1f)
                        )

                        ValidationTextField(
                            value = validationInput2,
                            onValueChange = {if(it.length<=1) validationInput2 = it},
                            modifier = Modifier.weight(1f))

                        ValidationTextField(
                            value = validationInput3,
                            onValueChange = {if(it.length<=1) validationInput3 = it},
                            modifier = Modifier.weight(1f))

                        ValidationTextField(
                            value = validationInput4,
                            onValueChange = {if(it.length<=1) validationInput4 = it},
                            modifier = Modifier.weight(1f))
                    }

                    Text(text = "Entrez le code avant 2 minutes",
                        style = TextStyle(
                            fontWeight = FontWeight(300)
                        )
                    )

                    Spacer(modifier = Modifier.padding(top = 160.dp))

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
fun ConfirmationUI(){

    ChangeStatusBarColor(color = jauneMTN)

    var validationInput by remember { mutableStateOf("") }

    Surface(modifier = Modifier.fillMaxSize()) {
        Scaffold(
            topBar = {
                CenterAlignedTopAppBar(
                    title = { Image(modifier = Modifier
                        .width(49.dp)
                        .height(31.dp),
                        painter = painterResource(
                            id = R.drawable.mtn_logo),
                        contentDescription = "Logo MTN",
                    ) },
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
                        .padding(top = 108.dp, start = 30.dp, end = 30.dp)
                        .fillMaxSize()) {

                    Text(text = "Code de validation",
                        style = TextStyle(
                            fontWeight = FontWeight(800),
                            fontSize = 30.sp)
                    )

                    Row (horizontalArrangement = Arrangement.spacedBy(5.dp, Alignment.CenterHorizontally),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 60.dp, bottom = 25.dp, start = 40.dp, end = 40.dp)){


                        TextField(
                            value = validationInput,
                            onValueChange = {validationInput = it},
                            singleLine = true,
                            colors = TextFieldDefaults.colors(
                                focusedIndicatorColor = noir,
                                unfocusedIndicatorColor = Color.Black,
                                cursorColor = Color.Black,
                                unfocusedContainerColor = jauneMTN,
                                focusedContainerColor = jauneMTN
                            ),
                            keyboardOptions = KeyboardOptions.Default.copy(
                                keyboardType = KeyboardType.Number,
                                imeAction = ImeAction.Next
                            ),
                            modifier = Modifier
                                .weight(1f)
                                .width(57.dp)
                        )

                        TextField(
                            value = validationInput,
                            onValueChange = {validationInput = it},
                            singleLine = true,
                            colors = TextFieldDefaults.colors(
                                focusedIndicatorColor = noir,
                                unfocusedIndicatorColor = Color.Black,
                                cursorColor = Color.Black,
                                unfocusedContainerColor = jauneMTN,
                                focusedContainerColor = jauneMTN
                            ),
                            keyboardOptions = KeyboardOptions.Default.copy(
                                keyboardType = KeyboardType.Number,
                                imeAction = ImeAction.Next
                            ),
                            modifier = Modifier
                                .weight(1f)
                                .width(57.dp)
                        )

                        TextField(
                            value = validationInput,
                            onValueChange = {validationInput = it},
                            singleLine = true,
                            colors = TextFieldDefaults.colors(
                                focusedIndicatorColor = noir,
                                unfocusedIndicatorColor = Color.Black,
                                cursorColor = Color.Black,
                                unfocusedContainerColor = jauneMTN,
                                focusedContainerColor = jauneMTN
                            ),
                            keyboardOptions = KeyboardOptions.Default.copy(
                                keyboardType = KeyboardType.Number,
                                imeAction = ImeAction.Next
                            ),
                            modifier = Modifier
                                .weight(1f)
                                .width(57.dp)
                        )

                        TextField(
                            value = validationInput,
                            onValueChange = {validationInput = it},
                            singleLine = true,
                            colors = TextFieldDefaults.colors(
                                focusedIndicatorColor = noir,
                                unfocusedIndicatorColor = Color.Black,
                                cursorColor = Color.Black,
                                unfocusedContainerColor = jauneMTN,
                                focusedContainerColor = jauneMTN
                            ),
                            keyboardOptions = KeyboardOptions.Default.copy(
                                keyboardType = KeyboardType.Number,
                                imeAction = ImeAction.Done
                            ),
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxWidth()
                        )

                    }

                    Text(text = "Entrez le code avant 2 minutes",
                        style = TextStyle(
                            fontWeight = FontWeight(300)
                        )
                    )

                    Spacer(modifier = Modifier.padding(top = 175.dp))

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