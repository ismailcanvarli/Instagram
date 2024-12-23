//Created by canVarli on 12/21/2024

package com.ismailcanvarli.instagram.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.ismailcanvarli.instagram.R

@Composable
fun BottomNavigationBar() {
    Surface(
        color = Color.White, modifier = Modifier.fillMaxWidth().padding(bottom = 4.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
                .padding(horizontal = 16.dp, vertical = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            IconButton(onClick = { /* No action */ }) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_home),
                    contentDescription = "Home",
                    tint = Color.Black,
                    modifier = Modifier.size(32.dp)
                )
            }
            IconButton(onClick = { /* No action */ }) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_search),
                    contentDescription = "Search",
                    tint = Color.Black,
                    modifier = Modifier.size(32.dp)
                )
            }
            IconButton(onClick = { /* No action */ }) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_add),
                    contentDescription = "Add Story",
                    tint = Color.Black,
                    modifier = Modifier.size(32.dp)
                )
            }
            IconButton(onClick = { /* No action */ }) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_reels),
                    contentDescription = "Reels",
                    tint = Color.Black,
                    modifier = Modifier.size(32.dp)
                )
            }
            IconButton(onClick = { /* No action */ }) {
                Image(
                    painter = painterResource(id = R.drawable.profile_picture),
                    contentDescription = stringResource(R.string.profile_picture),
                    modifier = Modifier
                        .size(32.dp)
                        .clip(CircleShape)
                        .background(Color.Gray, shape = CircleShape),
                    contentScale = ContentScale.Crop
                )
            }
        }
    }
}