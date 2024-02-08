package com.astdev.mtn

import android.annotation.SuppressLint
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.outlined.CheckCircle
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.astdev.mtn.ui.theme.jauneMTN
import com.astdev.mtn.ui.theme.noir
import com.astdev.mtn.ui.theme.succesColor

@Composable
@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
fun ActivationStatus(navController: NavHostController){
    //ActivationStatusUI()

    ChangeStatusBarColor(color = jauneMTN)

    var expanded1 by remember { mutableStateOf (false) }
    var expanded2 by remember { mutableStateOf (false) }
    var expanded3 by remember { mutableStateOf (false) }
    val rotationState1 by animateFloatAsState(
        targetValue = if (expanded1) 180f else 0f, label = ""
    )

    val rotationState2 by animateFloatAsState(
        targetValue = if (expanded2) 180f else 0f, label = ""
    )

    val rotationState3 by animateFloatAsState(
        targetValue = if (expanded3) 180f else 0f, label = ""
    )

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
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(top = 60.dp, start = 20.dp, end = 20.dp)
                        .fillMaxSize()) {

                    Row (modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 20.dp)){
                        Text(text = "Statut d’activation",
                            style = TextStyle(
                                fontWeight = FontWeight(800),
                                fontSize = 27.sp)
                        )
                    }

                    Card (
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(130.dp),
                        colors = CardDefaults.cardColors(containerColor = Color.White),
                        shape = RoundedCornerShape(20.dp)
                    ){
                        Row(modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 20.dp, start = 20.dp, end = 20.dp)){
                            Column (modifier = Modifier.weight(1f)){
                                Text(text = "05xxxxxxxx",
                                    style = TextStyle(
                                        fontWeight = FontWeight(600),
                                        color = Color.Black,
                                        fontSize = 20.sp
                                    )
                                )

                                Spacer(modifier = Modifier.padding(bottom = 10.dp))

                                Button(
                                    onClick = { navController.navigate("Depot") },
                                    shape = RoundedCornerShape(20.dp),
                                    colors = ButtonDefaults.buttonColors(noir),
                                    modifier = Modifier
                                        .width(174.dp)
                                        .height(48.dp),
                                    elevation = ButtonDefaults.buttonElevation(defaultElevation = 4.dp)
                                ) {
                                    Text(
                                        text = "Faire un dépôt",
                                        style = TextStyle(
                                            fontSize = 16.sp,
                                            fontWeight = FontWeight(800),
                                            color = Color.White
                                        )
                                    )

                                }
                            }

                            Column {
                                Text(
                                    text = "Premium",
                                    style = TextStyle(
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight(600),
                                        color = Color(0xFF4B4B4B)
                                    ),
                                    modifier = Modifier
                                        .border(
                                            BorderStroke(2.dp, Color(0xFF4B4B4B)),
                                            shape = RoundedCornerShape(7.dp)
                                        )
                                        .padding(
                                            start = 10.dp,
                                            top = 5.dp,
                                            end = 10.dp,
                                            bottom = 5.dp
                                        )
                                )
                            }
                        }
                    }

                    Row (modifier = Modifier
                        .fillMaxSize()
                        .padding(top = 20.dp)
                    ){

                        Column {
                            Row {
                                Text(text = "Offres activées",
                                    style = TextStyle(
                                        fontWeight = FontWeight(700),
                                        fontSize = 25.sp)
                                )
                            }

                            LazyColumn(
                                contentPadding = PaddingValues(vertical = 10.dp),
                                verticalArrangement = Arrangement.spacedBy(10.dp),
                                content = {
                                    item {
                                        Row {
                                            Text(text = "Momo",
                                                style = TextStyle(
                                                    fontWeight = FontWeight(500),
                                                    fontSize = 18.sp),
                                                modifier = Modifier.weight(1f),
                                            )

                                            Icon(imageVector = Icons.Outlined.CheckCircle,
                                                tint = succesColor,
                                                contentDescription = null)
                                        }
                                    }

                                    item {
                                        Row {
                                            Text(text = "Data",
                                                style = TextStyle(
                                                    fontWeight = FontWeight(500),
                                                    fontSize = 18.sp),
                                                modifier = Modifier.weight(1f)
                                            )

                                            Icon(imageVector = Icons.Outlined.CheckCircle,
                                                tint = succesColor,
                                                contentDescription = null)
                                        }
                                    }
                                }
                            )

                            Spacer(modifier = Modifier
                                .padding(top = 20.dp, bottom = 25.dp)
                                .fillMaxWidth()
                                .height(1.5.dp)
                                .background(color = Color(0xFFC29D05)))

                            Row {
                                Text(text = "Offres disponibles",
                                    style = TextStyle(
                                        fontWeight = FontWeight(700),
                                        fontSize = 25.sp)
                                )
                            }

                            LazyColumn(
                                contentPadding = PaddingValues(vertical = 7.dp),
                                verticalArrangement = Arrangement.spacedBy(5.dp),
                                content = {
                                    item{
                                        Card (
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .clickable(onClick = {
                                                    expanded1 = !expanded1
                                                    expanded2 = false
                                                    expanded3 = false
                                                }),
                                            colors = CardDefaults.cardColors(containerColor = Color.White),
                                            shape = RoundedCornerShape(16.dp)
                                        ){
                                            Column (
                                                modifier = Modifier.padding(start = 16.dp, top = 6.dp, end = 16.dp, bottom = 6.dp)){

                                                Row(verticalAlignment = Alignment.CenterVertically){
                                                    Text(text = "Ayoba",
                                                        style = TextStyle(
                                                            fontWeight = FontWeight(500),
                                                            color = Color.Black,
                                                            fontSize = 19.sp
                                                        ),
                                                        modifier = Modifier.weight(1f)
                                                    )

                                                    IconButton(
                                                        modifier = Modifier
                                                            .alpha(0.2f)
                                                            .rotate(rotationState1),
                                                        onClick = {
                                                            expanded1 = !expanded1
                                                            expanded2 = false
                                                            expanded3 = false
                                                        }) {
                                                        Icon(
                                                            imageVector = Icons.Default.ArrowDropDown,
                                                            tint = Color.Black,
                                                            contentDescription = "Drop-Down Arrow"
                                                        )
                                                    }
                                                }

                                                if(expanded1){
                                                    Text(text = "Pack Free 100Mo, 300 SMS gratuits, 200 minutes d’appel gratuit.",
                                                        style = TextStyle(
                                                            fontWeight = FontWeight(400),
                                                            color = Color.Black,
                                                            fontSize = 14.sp
                                                        )
                                                    )

                                                    Spacer(modifier = Modifier.padding(bottom = 10.dp))

                                                    Button(
                                                        onClick = { },
                                                        shape = RoundedCornerShape(20.dp),
                                                        colors = ButtonDefaults.buttonColors(noir),
                                                        modifier = Modifier
                                                            .width(109.dp)
                                                            .height(40.dp)
                                                            .align(Alignment.End),
                                                        elevation = ButtonDefaults.buttonElevation(defaultElevation = 4.dp)
                                                    ) {
                                                        Text(
                                                            text = "Activer",
                                                            style = TextStyle(
                                                                fontSize = 14.sp,
                                                                fontWeight = FontWeight(700),
                                                                color = Color.White
                                                            )
                                                        )

                                                    }
                                                }
                                            }
                                        }
                                    }

                                    item{
                                        Card (
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .clickable(onClick = {
                                                    expanded2 = !expanded2
                                                    expanded1 = false
                                                    expanded3 = false
                                                }),
                                            colors = CardDefaults.cardColors(containerColor = Color.White),
                                            shape = RoundedCornerShape(16.dp)
                                        ){
                                            Column (
                                                modifier = Modifier.padding(start = 16.dp, top = 6.dp, end = 16.dp, bottom = 6.dp)){

                                                Row(verticalAlignment = Alignment.CenterVertically){
                                                    Text(text = "MTN TV",
                                                        style = TextStyle(
                                                            fontWeight = FontWeight(500),
                                                            color = Color.Black,
                                                            fontSize = 19.sp
                                                        ),
                                                        modifier = Modifier.weight(1f)
                                                    )

                                                    IconButton(
                                                        modifier = Modifier
                                                            .alpha(0.2f)
                                                            .rotate(rotationState2),
                                                        onClick = {
                                                            expanded2 = !expanded2
                                                            expanded1 = false
                                                            expanded3 = false
                                                        }) {
                                                        Icon(
                                                            imageVector = Icons.Default.ArrowDropDown,
                                                            tint = Color.Black,
                                                            contentDescription = "Drop-Down Arrow"
                                                        )
                                                    }
                                                }

                                                if(expanded2){
                                                    Text(text = "Pack Free 100Mo, 300 SMS gratuits, 200 minutes d’appel gratuit.",
                                                        style = TextStyle(
                                                            fontWeight = FontWeight(400),
                                                            color = Color.Black,
                                                            fontSize = 14.sp
                                                        )
                                                    )

                                                    Spacer(modifier = Modifier.padding(bottom = 10.dp))

                                                    Button(
                                                        onClick = { },
                                                        shape = RoundedCornerShape(20.dp),
                                                        colors = ButtonDefaults.buttonColors(noir),
                                                        modifier = Modifier
                                                            .width(109.dp)
                                                            .height(40.dp)
                                                            .align(Alignment.End),
                                                        elevation = ButtonDefaults.buttonElevation(defaultElevation = 4.dp)
                                                    ) {
                                                        Text(
                                                            text = "Activer",
                                                            style = TextStyle(
                                                                fontSize = 14.sp,
                                                                fontWeight = FontWeight(700),
                                                                color = Color.White
                                                            )
                                                        )

                                                    }
                                                }

                                            }
                                        }
                                    }

                                    item{
                                        Card (
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .clickable(onClick = { expanded3 = !expanded3 }),
                                            colors = CardDefaults.cardColors(containerColor = Color.White),
                                            shape = RoundedCornerShape(16.dp)
                                        ){
                                            Column (
                                                modifier = Modifier.padding(start = 16.dp, top = 6.dp, end = 16.dp, bottom = 6.dp)){

                                                Row(verticalAlignment = Alignment.CenterVertically){
                                                    Text(text = "Pack Surprise",
                                                        style = TextStyle(
                                                            fontWeight = FontWeight(500),
                                                            color = Color.Black,
                                                            fontSize = 19.sp
                                                        ),
                                                        modifier = Modifier.weight(1f)
                                                    )

                                                    IconButton(
                                                        modifier = Modifier
                                                            .alpha(0.2f)
                                                            .rotate(rotationState3),
                                                        onClick = {
                                                            expanded3 = !expanded3
                                                            expanded1 = false
                                                            expanded2 = false
                                                        }) {
                                                        Icon(
                                                            imageVector = Icons.Default.ArrowDropDown,
                                                            tint = Color.Black,
                                                            contentDescription = "Drop-Down Arrow"
                                                        )
                                                    }
                                                }

                                                if(expanded3){
                                                    Text(text = "Pack Free 100Mo, 300 SMS gratuits, 200 minutes d’appel gratuit.",
                                                        style = TextStyle(
                                                            fontWeight = FontWeight(400),
                                                            color = Color.Black,
                                                            fontSize = 14.sp
                                                        )
                                                    )

                                                    Spacer(modifier = Modifier.padding(bottom = 10.dp))

                                                    Button(
                                                        onClick = { },
                                                        shape = RoundedCornerShape(20.dp),
                                                        colors = ButtonDefaults.buttonColors(noir),
                                                        modifier = Modifier
                                                            .width(109.dp)
                                                            .height(40.dp)
                                                            .align(Alignment.End),
                                                        elevation = ButtonDefaults.buttonElevation(defaultElevation = 4.dp)
                                                    ) {
                                                        Text(
                                                            text = "Activer",
                                                            style = TextStyle(
                                                                fontSize = 14.sp,
                                                                fontWeight = FontWeight(700),
                                                                color = Color.White
                                                            )
                                                        )

                                                    }
                                                }



                                            }
                                        }
                                    }


                                } )



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
fun ActivationStatusUI(){

    ChangeStatusBarColor(color = jauneMTN)

    var expanded1 by remember { mutableStateOf (false) }
    var expanded2 by remember { mutableStateOf (false) }
    var expanded3 by remember { mutableStateOf (false) }
    val rotationState1 by animateFloatAsState(
        targetValue = if (expanded1 or expanded2 or expanded3) 180f else 0f, label = ""
    )

    val rotationState2 by animateFloatAsState(
        targetValue = if (expanded2) 180f else 0f, label = ""
    )

    val rotationState3 by animateFloatAsState(
        targetValue = if (expanded3) 180f else 0f, label = ""
    )

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
                        .padding(top = 60.dp, start = 20.dp, end = 20.dp)
                        .fillMaxSize()) {

                    Row (modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 20.dp)){
                        Text(text = "Statut d’activation",
                            style = TextStyle(
                                fontWeight = FontWeight(800),
                                fontSize = 27.sp)
                        )
                    }

                    Card (
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(130.dp),
                        colors = CardDefaults.cardColors(containerColor = Color.White),
                        shape = RoundedCornerShape(20.dp)
                    ){
                        Row(modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 20.dp, start = 20.dp, end = 20.dp)){
                            Column (modifier = Modifier.weight(1f)){
                                Text(text = "05xxxxxxxx",
                                    style = TextStyle(
                                        fontWeight = FontWeight(600),
                                        color = Color.Black,
                                        fontSize = 20.sp
                                    )
                                )

                                Spacer(modifier = Modifier.padding(bottom = 10.dp))

                                Button(
                                    onClick = { },
                                    shape = RoundedCornerShape(20.dp),
                                    colors = ButtonDefaults.buttonColors(noir),
                                    modifier = Modifier
                                        .width(174.dp)
                                        .height(48.dp),
                                    elevation = ButtonDefaults.buttonElevation(defaultElevation = 4.dp)
                                ) {
                                    Text(
                                        text = "Faire un dépôt",
                                        style = TextStyle(
                                            fontSize = 16.sp,
                                            fontWeight = FontWeight(800),
                                            color = Color.White
                                        )
                                    )

                                }
                            }

                            Column {
                                Text(
                                    text = "Premium",
                                    style = TextStyle(
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight(600),
                                        color = Color(0xFF4B4B4B)
                                    ),
                                    modifier = Modifier
                                        .border(
                                            BorderStroke(2.dp, Color(0xFF4B4B4B)),
                                            shape = RoundedCornerShape(7.dp)
                                        )
                                        .padding(
                                            start = 10.dp,
                                            top = 5.dp,
                                            end = 10.dp,
                                            bottom = 5.dp
                                        )
                                )
                            }
                        }
                    }



                    Row (modifier = Modifier
                        .fillMaxSize()
                        .padding(top = 20.dp)
                    ){

                        Column {
                            Row {
                                Text(text = "Offres activées",
                                    style = TextStyle(
                                        fontWeight = FontWeight(700),
                                        fontSize = 25.sp)
                                )
                            }

                            LazyColumn(
                                contentPadding = PaddingValues(vertical = 10.dp),
                                verticalArrangement = Arrangement.spacedBy(10.dp),
                                content = {
                                    item {
                                        Row {
                                            Text(text = "Momo",
                                                style = TextStyle(
                                                    fontWeight = FontWeight(500),
                                                    fontSize = 18.sp),
                                                modifier = Modifier.weight(1f),
                                        )

                                        Icon(imageVector = Icons.Outlined.CheckCircle,
                                            tint = succesColor,
                                            contentDescription = null)
                                        }
                                    }

                                    item {
                                        Row {
                                            Text(text = "Data",
                                                style = TextStyle(
                                                    fontWeight = FontWeight(500),
                                                    fontSize = 18.sp),
                                                modifier = Modifier.weight(1f)
                                            )

                                            Icon(imageVector = Icons.Outlined.CheckCircle,
                                                tint = succesColor,
                                                contentDescription = null)
                                        }
                                    }
                                }
                            )

                            Spacer(modifier = Modifier
                                .padding(top = 20.dp, bottom = 25.dp)
                                .fillMaxWidth()
                                .height(1.5.dp)
                                .background(color = Color(0xFFC29D05)))

                            Row {
                                Text(text = "Offres disponibles",
                                    style = TextStyle(
                                        fontWeight = FontWeight(700),
                                        fontSize = 25.sp)
                                )
                            }

                            LazyColumn(
                                contentPadding = PaddingValues(vertical = 7.dp),
                                verticalArrangement = Arrangement.spacedBy(5.dp),
                                content = {
                                    item{
                                        Card (
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .clickable(onClick = {
                                                    expanded1 = !expanded1
                                                    expanded2 = false
                                                    expanded3 = false
                                                }),
                                            colors = CardDefaults.cardColors(containerColor = Color.White),
                                            shape = RoundedCornerShape(16.dp)
                                        ){
                                            Column (
                                                modifier = Modifier.padding(start = 16.dp, top = 6.dp, end = 16.dp, bottom = 6.dp)){

                                                Row(verticalAlignment = Alignment.CenterVertically){
                                                    Text(text = "Ayoba",
                                                        style = TextStyle(
                                                            fontWeight = FontWeight(500),
                                                            color = Color.Black,
                                                            fontSize = 19.sp
                                                        ),
                                                        modifier = Modifier.weight(1f)
                                                    )

                                                    IconButton(
                                                        modifier = Modifier
                                                            .alpha(0.2f)
                                                            .rotate(rotationState1),
                                                        onClick = {
                                                            expanded1 = !expanded1
                                                            expanded2 = false
                                                            expanded3 = false
                                                        }) {
                                                        Icon(
                                                            imageVector = Icons.Default.ArrowDropDown,
                                                            tint = Color.Black,
                                                            contentDescription = "Drop-Down Arrow"
                                                        )
                                                    }
                                                }

                                                if(expanded1){
                                                    Text(text = "Pack Free 100Mo, 300 SMS gratuits, 200 minutes d’appel gratuit.",
                                                        style = TextStyle(
                                                            fontWeight = FontWeight(400),
                                                            color = Color.Black,
                                                            fontSize = 14.sp
                                                        )
                                                    )

                                                    Spacer(modifier = Modifier.padding(bottom = 10.dp))

                                                    Button(
                                                        onClick = { },
                                                        shape = RoundedCornerShape(20.dp),
                                                        colors = ButtonDefaults.buttonColors(noir),
                                                        modifier = Modifier
                                                            .width(109.dp)
                                                            .height(40.dp)
                                                            .align(Alignment.End),
                                                        elevation = ButtonDefaults.buttonElevation(defaultElevation = 4.dp)
                                                    ) {
                                                        Text(
                                                            text = "Activer",
                                                            style = TextStyle(
                                                                fontSize = 14.sp,
                                                                fontWeight = FontWeight(700),
                                                                color = Color.White
                                                            )
                                                        )

                                                    }
                                                }



                                            }
                                        }
                                    }

                                    item{
                                        Card (
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .clickable(onClick = {
                                                    expanded2 = !expanded2
                                                    expanded1 = false
                                                    expanded3 = false
                                                }),
                                            colors = CardDefaults.cardColors(containerColor = Color.White),
                                            shape = RoundedCornerShape(16.dp)
                                        ){
                                            Column (
                                                modifier = Modifier.padding(start = 16.dp, top = 6.dp, end = 16.dp, bottom = 6.dp)){

                                                Row(verticalAlignment = Alignment.CenterVertically){
                                                    Text(text = "MTN TV",
                                                        style = TextStyle(
                                                            fontWeight = FontWeight(500),
                                                            color = Color.Black,
                                                            fontSize = 19.sp
                                                        ),
                                                        modifier = Modifier.weight(1f)
                                                    )

                                                    IconButton(
                                                        modifier = Modifier
                                                            .alpha(0.2f)
                                                            .rotate(rotationState2),
                                                        onClick = {
                                                            expanded2 = !expanded2
                                                            expanded1 = false
                                                            expanded3 = false
                                                        }) {
                                                        Icon(
                                                            imageVector = Icons.Default.ArrowDropDown,
                                                            tint = Color.Black,
                                                            contentDescription = "Drop-Down Arrow"
                                                        )
                                                    }
                                                }

                                                if(expanded2){
                                                    Text(text = "Pack Free 100Mo, 300 SMS gratuits, 200 minutes d’appel gratuit.",
                                                        style = TextStyle(
                                                            fontWeight = FontWeight(400),
                                                            color = Color.Black,
                                                            fontSize = 14.sp
                                                        )
                                                    )

                                                    Spacer(modifier = Modifier.padding(bottom = 10.dp))

                                                    Button(
                                                        onClick = { },
                                                        shape = RoundedCornerShape(20.dp),
                                                        colors = ButtonDefaults.buttonColors(noir),
                                                        modifier = Modifier
                                                            .width(109.dp)
                                                            .height(40.dp),
                                                        elevation = ButtonDefaults.buttonElevation(defaultElevation = 4.dp)
                                                    ) {
                                                        Text(
                                                            text = "Activer",
                                                            style = TextStyle(
                                                                fontSize = 14.sp,
                                                                fontWeight = FontWeight(700),
                                                                color = Color.White
                                                            )
                                                        )

                                                    }
                                                }



                                            }
                                        }
                                    }

                                    item{
                                        Card (
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .clickable(onClick = { expanded3 = !expanded3 }),
                                            colors = CardDefaults.cardColors(containerColor = Color.White),
                                            shape = RoundedCornerShape(16.dp)
                                        ){
                                            Column (
                                                modifier = Modifier.padding(start = 16.dp, top = 6.dp, end = 16.dp, bottom = 6.dp)){

                                                Row(verticalAlignment = Alignment.CenterVertically){
                                                    Text(text = "Pack Surprise",
                                                        style = TextStyle(
                                                            fontWeight = FontWeight(500),
                                                            color = Color.Black,
                                                            fontSize = 19.sp
                                                        ),
                                                        modifier = Modifier.weight(1f)
                                                    )

                                                    IconButton(
                                                        modifier = Modifier
                                                            .alpha(0.2f)
                                                            .rotate(rotationState3),
                                                        onClick = {
                                                            expanded3 = !expanded3
                                                            expanded1 = false
                                                            expanded2 = false
                                                        }) {
                                                        Icon(
                                                            imageVector = Icons.Default.ArrowDropDown,
                                                            tint = Color.Black,
                                                            contentDescription = "Drop-Down Arrow"
                                                        )
                                                    }
                                                }

                                                if(expanded3){
                                                    Text(text = "Pack Free 100Mo, 300 SMS gratuits, 200 minutes d’appel gratuit.",
                                                        style = TextStyle(
                                                            fontWeight = FontWeight(400),
                                                            color = Color.Black,
                                                            fontSize = 14.sp
                                                        )
                                                    )

                                                    Spacer(modifier = Modifier.padding(bottom = 10.dp))

                                                    Button(
                                                        onClick = { },
                                                        shape = RoundedCornerShape(20.dp),
                                                        colors = ButtonDefaults.buttonColors(noir),
                                                        modifier = Modifier
                                                            .width(109.dp)
                                                            .height(40.dp),
                                                        elevation = ButtonDefaults.buttonElevation(defaultElevation = 4.dp)
                                                    ) {
                                                        Text(
                                                            text = "Activer",
                                                            style = TextStyle(
                                                                fontSize = 14.sp,
                                                                fontWeight = FontWeight(700),
                                                                color = Color.White
                                                            )
                                                        )

                                                    }
                                                }



                                            }
                                        }
                                    }


                                } )



                        }
                    }





                }
            }
        )
    }
}