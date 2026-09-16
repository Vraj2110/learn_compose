package com.example.learn_compose.basics

import android.R
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun RowExample() {

    Row(
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,

    ) { Text(
        text = "Apple",
        color = Color.Red,
        fontSize = 40.sp,
        fontFamily = FontFamily.Default
    )
        Text(
            text = "Banana",
            color = Color.Yellow,
            fontSize = 40.sp,
            fontFamily = FontFamily.Default
        )
        Text(
            text = "Guava",
            color = Color.Green,
            fontSize = 40.sp,
            fontFamily = FontFamily.Default
        )}

}