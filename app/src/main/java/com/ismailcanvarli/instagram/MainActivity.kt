package com.ismailcanvarli.instagram

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InstagramProfileScreen()
        }
    }
}

@Composable
fun InstagramProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        TopBar()
        Spacer(modifier = Modifier.height(16.dp))
        ProfileSection()
        Spacer(modifier = Modifier.height(16.dp))
        ActionButtons()
        Spacer(modifier = Modifier.height(16.dp))
        HighlightsSection()
        Spacer(modifier = Modifier.height(16.dp))
        TabSection()
        Spacer(modifier = Modifier.height(8.dp))
        PostsGrid()
    }
}

@Composable
fun TopBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "ismailcanvarli",
            color = Color.Black,
            fontSize = 20.sp,
            modifier = Modifier.weight(1f)
        )
        IconButton(onClick = { /* Share profile action */ }) {
            Icon(
                painter = painterResource(id = R.drawable.ic_add),
                contentDescription = "Share",
                tint = Color.Black
            )
        }
        IconButton(onClick = { /* Options action */ }) {
            Icon(
                painter = painterResource(id = R.drawable.ic_menu),
                contentDescription = "Menu",
                tint = Color.Black
            )
        }
    }
}

@Composable
fun ProfileSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.Start
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.profile_picture),
                contentDescription = "Profile Picture",
                modifier = Modifier
                    .size(80.dp)
                    .background(Color.Gray, shape = CircleShape),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(16.dp))
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.fillMaxWidth()
            ) {
                ProfileStat(label = "53", description = "Posts")
                ProfileStat(label = "105", description = "Followers")
                ProfileStat(label = "147", description = "Following")
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "İsmail Can Varlı",
            color = Color.Black,
            fontSize = 16.sp,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = "Marmara Üniversitesi",
            color = Color.Black,
            fontSize = 14.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = "Bilgisayar Mühendisliği",
            color = Color.Black,
            fontSize = 14.sp,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun ProfileStat(label: String, description: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(horizontal = 8.dp)
    ) {
        Text(
            text = label, color = Color.Black, fontSize = 18.sp, textAlign = TextAlign.Center
        )
        Text(
            text = description, color = Color.Gray, fontSize = 14.sp, textAlign = TextAlign.Center
        )
    }
}

@Composable
fun HighlightsSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .horizontalScroll(rememberScrollState()),
        horizontalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        HighlightItem("2024")
        HighlightItem("Fitness & Sport")
        HighlightItem("Board Game")
        HighlightItem("2023")
        HighlightItem("2022") // Yeni yıl eklendi
        HighlightItem("2021") // Yeni yıl eklendi
    }
}

@Composable
fun ActionButtons() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Button(
            onClick = { /* Edit profile action */ },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Gray),
            modifier = Modifier.width(150.dp)
        ) {
            Text(text = "Edit Profile", color = Color.Black)
        }
        Button(
            onClick = { /* Share profile action */ },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Gray),
            modifier = Modifier.width(150.dp)
        ) {
            Text(text = "Share Profile", color = Color.Black)
        }
        IconButton(onClick = { /* Add friend action */ }) {
            Icon(
                painter = painterResource(id = R.drawable.ic_add_friend),
                contentDescription = "Add Friend",
                tint = Color.Black
            )
        }
    }
}

@Composable
fun HighlightItem(text: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Box(
            modifier = Modifier
                .size(70.dp)
                .background(Color.Gray, shape = CircleShape)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = text, color = Color.Black, fontSize = 12.sp, textAlign = TextAlign.Center
        )
    }
}

@Composable
fun TabSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 40.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        TabItem(iconResId = R.drawable.ic_grid, contentDescription = "Photos")
        TabItem(iconResId = R.drawable.ic_reels, contentDescription = "Reels")
        TabItem(iconResId = R.drawable.ic_tagged, contentDescription = "Tagged")
    }
}

@Composable
fun TabItem(iconResId: Int, contentDescription: String) {
    IconButton(onClick = { /* Handle tab click */ }) {
        Icon(
            painter = painterResource(id = iconResId),
            contentDescription = contentDescription,
            tint = Color.Black,
            modifier = Modifier.size(24.dp)
        )
    }
}

@Composable
fun PostsGrid() {
    val photos = listOf(
        R.drawable.photo1,
        R.drawable.photo2,
        R.drawable.photo3,
        R.drawable.photo4,
        R.drawable.photo5,
        R.drawable.photo6,
        R.drawable.photo7,
        R.drawable.photo8,
        R.drawable.photo9,
        R.drawable.photo10,
        R.drawable.photo11,
        R.drawable.photo12,
        R.drawable.photo13,
        R.drawable.photo14,
        R.drawable.photo15,
        R.drawable.photo16,
        R.drawable.photo17,
        R.drawable.photo18
    )
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState())
    ) {
        for (row in photos.chunked(3)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(2.dp)
            ) {
                for (photo in row) {
                    Image(
                        painter = painterResource(id = photo),
                        contentDescription = null,
                        modifier = Modifier
                            .weight(1f)
                            .aspectRatio(1f)
                            .padding(1.dp)
                            .background(Color.Gray, shape = RoundedCornerShape(4.dp)),
                        contentScale = ContentScale.Crop
                    )
                }
            }
            Spacer(modifier = Modifier.height(2.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    InstagramProfileScreen()
}