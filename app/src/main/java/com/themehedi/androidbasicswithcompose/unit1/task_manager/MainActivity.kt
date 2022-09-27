package com.themehedi.androidbasicswithcompose.unit1.task_manager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
                    TaskManager(stringResource(R.string.task_completed), stringResource(R.string.nice_work))
                }
            }
        }
    }
}

@Composable
fun TaskManager(text1: String, text2: String) {
    
    Column(modifier = Modifier.fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally) {

        val image = painterResource(id = R.drawable.ic_task_completed);

        Image(painter = image, contentDescription = null)

        Text(text = text1,
        fontSize = 24.sp,
        modifier = Modifier.padding(top = 24.dp, bottom = 8.dp))

        Text(text = text1,
            fontSize = 16.sp)
    }
}

@Preview(showBackground = true,
showSystemUi = true)
@Composable
fun DefaultPreview() {
    AndroidBasicsWithComposeTheme {
        TaskManager(stringResource(R.string.task_completed), stringResource(R.string.nice_work))
    }
}