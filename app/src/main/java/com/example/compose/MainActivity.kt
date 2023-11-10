package com.example.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.compose.ui.theme.ComposeTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .alpha(0.5F),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ChatBubble("Android")
                }
            }
        }
    }
}

@Composable
fun ChatBubble(text: String, modifier: Modifier = Modifier) {
    Surface() {
        Row {
            AsyncImage(
                model = "https://www.alleycat.org/wp-content/uploads/2019/03/FELV-cat.jpg",
                contentDescription = null,
            )
            Text(
                text = text,
                modifier = modifier.padding(24.dp),
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeTheme {
        ChatBubble("Tyler")
    }
}