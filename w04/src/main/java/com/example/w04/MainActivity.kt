package com.example.w04

import android.content.res.Configuration
import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.w04.ui.theme.FunnyyTheme
import com.example.w04.R
import androidx.compose.material3.Surface
import androidx.compose.ui.graphics.Color


data class ChatMessage(val name: String, val msg: String)
data class Profile(val name: String, val intro: String)

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
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF87CEEB)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            ProfileCard(data = Profile("정유찬", "개발자 아기새"))
            Spacer(modifier = Modifier.height(16.dp))
            MessageCard(me = ChatMessage("참새", "하늘을 날고싶어요"))
            Spacer(modifier = Modifier.height(8.dp))
            MessageCard(me = ChatMessage("YUCHAN", "I like sparrow!!"))
        }
    }
}

@Composable
fun MessageCard(me: ChatMessage) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        modifier = Modifier.padding(all = 8.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) { // Card 내부 컨텐츠 패딩
            Text(
                text = me.name,
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.onSurface
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = me.msg,
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onSurface
            )
        }
    }
}

@Composable
fun ProfileCard(data: Profile) {
    Row(
        modifier = Modifier.padding(all = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(R.drawable.sparrow),
            contentDescription = "Contact profile picture",
            modifier = Modifier
                .size(60.dp)
                .clip(CircleShape)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column {
            Text(
                text = data.name,
                color = MaterialTheme.colorScheme.onBackground,
                style = MaterialTheme.typography.titleMedium
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = data.intro,
                color = MaterialTheme.colorScheme.onBackground,
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}


@Preview(
    name = "Profile Card Dark Mode",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true
)
@Composable
fun PreviewProfileCard() {
    FunnyyTheme {
        ProfileCard(Profile("정유찬", "앱 만들어 하늘 난다."))
    }
}

@Preview(
    name = "Message Card Dark Mode",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true
)
@Composable
fun PreviewMessageCard() {
    FunnyyTheme {
        MessageCard(ChatMessage("YUCHAN", "MAKE THE WORLD")) // ChatMessage 사용
    }
}

@Preview(
    name = "HomeScreen Dark Mode",
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES
)
@Composable
fun PreviewHomeScreen() {
    FunnyyTheme {
        HomeScreen()
    }
}
