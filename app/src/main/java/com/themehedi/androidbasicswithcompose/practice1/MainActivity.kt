package com.themehedi.androidbasicswithcompose.practice1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
                    //JetpackComposeTutorial("Android")
                }
            }
        }
    }
}


@Composable
fun JetpackComposeTutorial(title: String, paragraph1: String, paragraph2: String) {

    val image = painterResource(id = R.drawable.bg_compose_background)
    Column() {
        Image(painter = image,
            contentDescription = null)

        Text(text = title,
        fontSize = 24.sp,
        modifier = Modifier
            .padding(start = 16.dp, end = 16.dp, bottom = 16.dp, top = 16.dp)
        )

        Text(text = paragraph1,
        fontSize = 16.sp,
        modifier = Modifier
            .padding(start = 16.dp, end = 16.dp)
        )

        Text(text = paragraph2,
        fontSize = 16.sp,
        modifier = Modifier
            .padding(start = 16.dp, end = 16.dp, bottom = 16.dp, top = 16.dp)
        )
    }

}


@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun DefaultPreview() {
    AndroidBasicsWithComposeTheme {
        JetpackComposeTutorial(
            stringResource(R.string.title),
            stringResource(R.string.paragraph1),
            stringResource(R.string.paragraph2)
        )
    }
}