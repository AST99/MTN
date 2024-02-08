package com.astdev.mtn.navigation


import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.astdev.mtn.R
import com.astdev.mtn.ui.theme.rouge

//@Preview(showSystemUi = true)
@Composable
fun DrawerHeader(){

    Box (modifier = Modifier
        .fillMaxWidth()
        .padding(vertical = 64.dp)){

        Row {
            Image(painter = painterResource(id = R.drawable.usercircle),
                contentDescription = null,
                modifier = Modifier
                    .width(60.dp)
                    .height(60.dp)
            )
            Column {
                Text(text = "Agent", style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight(600),
                ))

                Text(text = "05xxxxxxxx", style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight(600),
                ))

                Text(text = "SAGRIVEC", style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight(400),
                ))
            }
        }
    }
}


/*@Composable
fun DrawerBody(
    items: List<MenuItem>,
    modifier: Modifier = Modifier,
    itemTextStyle: TextStyle = TextStyle(fontSize = 18.sp),
    onItemClick: (MenuItem)->Unit
){
    LazyColumn(modifier){
        items(items){item ->
            Row (modifier = Modifier
                .fillMaxWidth()
                .clickable { item }
                .padding(16.dp)
            ){
                Icon(
                    imageVector = item.icon,
                    contentDescription = null
                )
                Spacer(modifier = Modifier.width(16.dp))
                Text(
                    text = item.title,
                    style = itemTextStyle,
                    modifier = Modifier.weight(1f)
                )
            }

        }
    }

}*/

@Preview(showSystemUi = true)
@Composable
fun DrawerBody(){

    val items = listOf(
        NavigationDrawerItem(
            label = {
                Text(text = "GSM ID information",
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight(600)
                    )
                ) },
            selected = false,
            icon = {
                Icon(painter = painterResource(id = R.drawable.simcard),
                contentDescription = "Sim card", modifier = Modifier.size(32.dp))},
            onClick = { /*TODO*/ }),

        NavigationDrawerItem(
            label = {
                Text(text = "Momo ID information",
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight(600)
                    )
                ) },
            selected = false,
            icon = {
                Icon(painter = painterResource(id = R.drawable.money),
                    contentDescription = "Money", modifier = Modifier.size(32.dp))},
            onClick = { /*TODO*/ }
        ),

        NavigationDrawerItem(
            label = {
                Text(text = "Mes activations",
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight(600)
                    )
                ) },
            selected = false,
            icon = {
                Icon(painter = painterResource(id = R.drawable.history),
                    contentDescription = "History", modifier = Modifier.size(32.dp))},
            onClick = { /*TODO*/ }
        ),

        NavigationDrawerItem(
            label = {
                Text(text = "Mes activations",
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight(600)
                    )
                ) },
            selected = false,
            icon = {
                Icon(painter = painterResource(id = R.drawable.handcoins),
                    contentDescription = "Hand Coins", modifier = Modifier.size(32.dp))},
            onClick = { /*TODO*/ }
        ),

        NavigationDrawerItem(
            label = {
                Text(text = "Déconnection",
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight(600),
                        color = rouge
                    )
                ) },
            selected = false,
            icon = {
                Icon(painter = painterResource(id = R.drawable.signout),
                    contentDescription = "Sign Out", modifier = Modifier.size(32.dp))},
            onClick = { /*TODO*/ }
        ),
    )
}
