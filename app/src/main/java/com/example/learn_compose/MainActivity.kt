package com.example.learn_compose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.platform.LocalContext
import com.example.learn_compose.ui.theme.Learn_composeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Learn_composeTheme {
                    Greeting()
                }
            }
        }
    }

@Composable
fun Greeting() {
    val context = LocalContext.current
    val clickOnText = {}
        Text(text= "hello world",
            color = Color.Blue  ,
            fontSize = 32.sp,
            fontStyle = FontStyle.Italic,
            modifier = Modifier.padding(22.dp).background(Color.Black).clickable{
                Toast.makeText(
                    context,
                    "done",
                    Toast.LENGTH_SHORT
                ).show()
            }
        )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Learn_composeTheme {
        Greeting()
    }
}