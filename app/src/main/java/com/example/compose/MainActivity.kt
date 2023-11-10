package com.example.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
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
                ) {
                    ChatBubble("Android ")
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
                contentDescription = "aaaa",
                contentScale = ContentScale.Crop,
                modifier = Modifier.padding(8.dp).width(80.dp).clip(CircleShape).aspectRatio(1f),
            )
            Card(elevation = CardDefaults.cardElevation(
                defaultElevation = 10.dp
            ),    shape = RoundedCornerShape(20.dp),
                modifier = Modifier.background(color = Color.Red).weight(1f)
            ) {
                Text(
                    text = text,
                    modifier = modifier.padding(24.dp),
                )
            }
            Text(
                text = "Sub Text",
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