package com.themehedi.androidbasicswithcompose.unit1.business_card

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.themehedi.androidbasicswithcompose.R
import com.themehedi.androidbasicswithcompose.ui.theme.AndroidBasicsWithComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidBasicsWithComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard() {

    val backgroundColor = Color.Blue
    Box(modifier = Modifier.fillMaxSize()
        .background(backgroundColor)) {
        Column() {
            Column(modifier = Modifier.fillMaxWidth()) {

            }

            Column() {

            }
        }
    }

}

@Composable
fun ContactInfoItem(
    info: String,
    backgroundColor: Color
){
    Row() {

    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AndroidBasicsWithComposeTheme {
        BusinessCard()
    }
}