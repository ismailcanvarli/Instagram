package com.ismailcanvarli.instagram

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ismailcanvarli.instagram.ui.components.ActionButtons
import com.ismailcanvarli.instagram.ui.components.HighlightsSection
import com.ismailcanvarli.instagram.ui.components.PostsGrid
import com.ismailcanvarli.instagram.ui.components.ProfileSection
import com.ismailcanvarli.instagram.ui.components.TabSection
import com.ismailcanvarli.instagram.ui.components.TopBar

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

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    InstagramProfileScreen()
}