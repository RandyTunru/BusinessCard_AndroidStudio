package com.example.businesscardd121211023

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardd121211023.ui.theme.BusinessCardD121211023Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardD121211023Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CardText("A Analta Dwiyanto", "Informatics Student")
                }
            }
        }
    }
}

@Composable
fun CardText(name: String, job: String, modifier: Modifier = Modifier) {
    Column(verticalArrangement = Arrangement.Center,horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxHeight().fillMaxWidth().background(
        Color(35,71,87)
    )){
        Image(
            painter = painterResource(R.drawable.my_img),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .size(100.dp)
                .background(Color.Black)
                .padding(5.dp)
        )
        Text(
            text = name,
            fontSize = 28.sp,
            lineHeight = 116.sp,
            color = Color.White,
            modifier = Modifier.padding(10.dp)
        )
        Text(
            text = job,
            fontSize = 18.sp,
            color = Color.LightGray,
            fontWeight = FontWeight.Bold
        )
    }
    ContactText()
}

@Composable
fun ContactText(modifier: Modifier = Modifier) {
    Column(verticalArrangement = Arrangement.Bottom, modifier = Modifier.fillMaxHeight().fillMaxWidth().padding(bottom = 20.dp, start = 50.dp)){
        Row(modifier = Modifier.padding(7.dp)) {
            Icon(
                Icons.Filled.Call,
                contentDescription = "Localized description",
                tint = Color.White,
                modifier = Modifier.padding(horizontal = 16.dp)
            )
            Text(
                text = "+62-812-4562-7690",
                fontSize = 18.sp,
                color = Color.White
            )
        }
        Row(modifier = Modifier.padding(7.dp)){
            Icon(
                Icons.Filled.Share,
                contentDescription = "Localized description",
                tint = Color.White,
                modifier = Modifier.padding(horizontal = 16.dp)
            )
            Text(
                text = "@randy_analta",
                fontSize = 18.sp,
                color = Color.White
            )
        }

        Row(modifier = Modifier.padding(7.dp)){
            Icon(
                Icons.Filled.Email,
                contentDescription = "Localized description",
                tint = Color.White,
                modifier = Modifier.padding(horizontal = 16.dp)
            )
            Text(
                text = "randytunru@gmail.com",
                fontSize = 18.sp,
                color = Color.White
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardD121211023Theme {
        CardText("A Analta Dwiyanto", "Informatics Student")

    }
}