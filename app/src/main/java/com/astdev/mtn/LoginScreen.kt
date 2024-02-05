package com.astdev.mtn

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
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

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun LoginScreen(navController: NavHostController){

    ChangeStatusBarColor(color = jauneMTN)
    //LoginScreenUI()
    var phoneInput by remember { mutableStateOf("") }

    Surface (modifier = Modifier.fillMaxSize()){
        Scaffold {
            Box(modifier = Modifier
                .fillMaxSize()
                .background(jauneMTN))
            {
                Column (modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()){

                    Row (modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.Top,
                        horizontalArrangement = Arrangement.Center){
                        Image(modifier = Modifier
                            .width(49.dp)
                            .height(31.dp),
                            painter = painterResource(
                                id = R.drawable.mtn_logo),
                            contentDescription = "Logo MTN",
                        )
                    }

                    Spacer(modifier = Modifier.padding(top = 100.dp))

                    Row (modifier = Modifier.fillMaxSize()){
                        Column (horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier.padding(start = 30.dp, end = 30.dp))
                        {
                            Image(painter = painterResource(id = R.drawable.usercircle),
                                contentDescription = null,
                                modifier = Modifier
                                    .width(150.dp)
                                    .height(150.dp))

                            Spacer(modifier = Modifier.padding(bottom = 85.dp))

                            OutlinedTextField(
                                label = { Text("Numéro de téléphone") },
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

                            Spacer(modifier = Modifier.padding(bottom = 32.dp))

                            Button(
                                onClick = { navController.navigate("Validation")},
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
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
fun LoginScreenUI(){

    var phoneInput by remember { mutableStateOf("") }

    Surface (modifier = Modifier.fillMaxSize()){
        Scaffold {
            Box(modifier = Modifier
                .fillMaxSize()
                .background(jauneMTN))
            {
                Column (modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()){

                    Row (modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.Top,
                        horizontalArrangement = Arrangement.Center){
                        Image(modifier = Modifier
                            .width(49.dp)
                            .height(31.dp),
                            painter = painterResource(
                                id = R.drawable.mtn_logo),
                            contentDescription = "Logo MTN",
                        )
                    }

                    Spacer(modifier = Modifier.padding(top = 100.dp))

                    Row (modifier = Modifier.fillMaxSize()){
                        Column (horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier.padding(start = 25.dp, end = 25.dp))
                        {
                            Image(painter = painterResource(id = R.drawable.usercircle),
                                contentDescription = null,
                                modifier = Modifier
                                    .width(150.dp)
                                    .height(150.dp))

                            Spacer(modifier = Modifier.padding(bottom = 85.dp))

                            OutlinedTextField(
                                label = { Text("Numéro de téléphone") },
                                value = phoneInput,
                                singleLine = true,
                                shape = RoundedCornerShape(20.dp),
                                onValueChange = { phoneInput = it },
                                colors = OutlinedTextFieldDefaults.colors(
                                    focusedBorderColor = noir,
                                    focusedLabelColor = noir,
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

                            Spacer(modifier = Modifier.padding(bottom = 32.dp))

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
                }
            }
        }
    }


}