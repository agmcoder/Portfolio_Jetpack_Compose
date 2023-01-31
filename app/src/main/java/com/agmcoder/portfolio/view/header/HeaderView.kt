package com.agmcoder.portfolio.view.header

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.agmcoder.portfolio.R

@Composable
fun HeaderView() {
    //create a constant with the width of the screen
    Column() {
        //show an image from resources with a flush border
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "Logo",
            modifier = Modifier
                .size(200.dp)
                .clip(CircleShape)
                .border(2.dp, Color.Black, CircleShape)
                .background(
                    color = Color.White,
                    shape = CircleShape,
                )
                .padding(vertical = 20.dp)
        )

        Row {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "Logo Github",
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
                    .border(2.dp, Color.Black, CircleShape)
                    .background(
                        color = Color.White,
                        shape = CircleShape,
                    )
            )

            Spacer(modifier = Modifier.width(10.dp))

            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "Logo Linkedin",
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
                    .border(2.dp, Color.Black, CircleShape)
                    .background(
                        color = Color.White,
                        shape = CircleShape,
                    )
            )
        }

        Text(text = "Nombre y apellidos")
        Text(text = "Role, software developer")
        Row() {
            Icon(Icons.Filled.LocationOn, contentDescription = "Location")
            Text(text = "location")
        }






    }
}

// create a preview
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HeaderView()
}