package com.example.funnyy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.funnyy.ui.theme.FunnyyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FunnyyTheme {
                HomeScreen()
                }
            }
        }
    }


@Composable
fun HomeScreen() {
    Text(
        text = "Compose Modifier를 배워보자~"
    )
}

@Preview(showBackground = true)
@Composable
fun HomePreview() {
    HomeScreen()
}