package com.astdev.mtn

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.astdev.mtn.ui.theme.jauneMTN

@Composable
fun MtnLogo(modifier: Modifier){

    Image(
        painter = painterResource(id = R.drawable.mtn_logo),
        contentDescription = "App Logo",
        modifier = modifier)
}

@Composable
fun BtnPeriode(modifier: Modifier, txt: String, isClicked: Boolean, onClick: () -> Unit){

    var txtColor = Color(0xFF000000)
    val btnColor = if (isClicked){
        txtColor = Color(0xFF000000)
        0xFF000000
    } else {
        txtColor = Color(0xFFA59B9B)
        0xFFA59B9B
    }
    OutlinedButton(
        onClick = { onClick() },
        shape = RoundedCornerShape(20.dp),
        border = BorderStroke(1.dp, Color(btnColor)) ,
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(Color(0xFFFFCC00)),
    ) {
        Text(
            text = txt,
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight(600),
                color = txtColor
            )
        )
    }
}