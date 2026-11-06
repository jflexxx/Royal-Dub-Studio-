package com.royaldubstudio.app
MainActivity.kt. 
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RoyalDubApp()
        }
    }
}

private val RoyalBlue = Color(0xFF071B49)
private val RoyalGold = Color(0xFFFFC83D)
private val Dark = Color(0xFF080B14)

@Composable
fun RoyalDubApp() {
    val context = LocalContext.current

    MaterialTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Dark
        ) {
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                contentPadding = PaddingValues(20.dp)
            ) {
                item {
                    Spacer(modifier = Modifier.height(25.dp))

                    Text("👑", fontSize = 65.sp)

                    Text(
                        "ROYAL DUB STUDIO",
                        color = RoyalGold,
                        fontSize = 27.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Text(
                        "MASARAUTAR FASSARA",
                        color = Color.White,
                        fontSize = 15.sp
                    )

                    Spacer(modifier = Modifier.height(25.dp))

                    Text(
                        "Barka da zuwa Royal Dub Studio",
                        color = Color.White,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Text(
                        "Kalli fina-finan Hausa da shirye-shiryenmu.",
                        color = Color.LightGray,
                        fontSize = 14.sp
                    )

                    Spacer(modifier = Modifier.height(25.dp))

                    RoyalButton("Fina-finai", RoyalBlue) {
                        val url = "https://royal-dub-studio-official-website-kf7xnj.v2.appdeploy.ai/"
                        context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
                    }

                    RoyalButton("Facebook", RoyalBlue) {
                        val url = "https://www.facebook.com/share/1EME3R5q8U/"
                        context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
                    }

                    RoyalButton("YouTube - Royal Movies", RoyalBlue) {
                        val url = "https://youtube.com/@royalmovies02?si=zEjlaAipBdA6l1ad"
                        context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
                    }

                    RoyalButton("WhatsApp - Tuntube mu", RoyalBlue) {
                        val url = "https://wa.me/2349016908705"
                        context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
                    }

                    RoyalButton("TikTok", RoyalBlue) {
                        val url = "https://www.tiktok.com/@royaldubstudio"
                        context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
                    }

                    Spacer(modifier = Modifier.height(25.dp))

                    Text(
                        "© 2026 ROYAL DUB STUDIO",
                        color = RoyalGold,
                        fontSize = 12.sp
                    )
                }
            }
        }
    }
}

@Composable
fun RoyalButton(
    title: String,
    buttonColor: Color,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 7.dp)
            .height(55.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = buttonColor
        ),
        shape = RoundedCornerShape(12.dp)
    ) {
        Text(
            title,
            color = Color.White,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        )
    }
}
